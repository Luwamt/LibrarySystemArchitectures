package edu.miu.cs590.customerservice.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.CustomerAddEventDto;
import edu.miu.cs590.customerservice.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Sender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(CustomerAddEventDto customerEvent) {
        ObjectMapper objectMapper = new ObjectMapper();
        String customerToString;
        try {
            customerToString = objectMapper.writeValueAsString(customerEvent);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        kafkaTemplate.send("CustomerTopic", customerToString);
    }
}
