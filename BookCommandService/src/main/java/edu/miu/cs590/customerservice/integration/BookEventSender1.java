package edu.miu.cs590.customerservice.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.BookAddEventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class BookEventSender1 {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(BookAddEventDto bookDto) {

        ObjectMapper objectMapper = new ObjectMapper();
        String asString = "";
        try {
            asString = objectMapper.writeValueAsString(bookDto);
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Error");
        }
        kafkaTemplate.send("BookTopic", asString);
    }
}
