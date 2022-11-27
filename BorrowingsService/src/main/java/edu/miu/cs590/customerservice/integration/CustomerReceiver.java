package edu.miu.cs590.customerservice.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.*;
import edu.miu.cs590.customerservice.service.BorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerReceiver {

    @Autowired
    BorrowingsService borrowingsService;

    @KafkaListener(topics = "CustomerTopic",id = "grop-1")

    public void receiver(@Payload String customerDto){
        ObjectMapper objectMapper=new ObjectMapper();

        CustomerAddEventDto customer=null;
        try {
            customer = objectMapper.readValue(customerDto,CustomerAddEventDto.class);
            borrowingsService.updateCustomer(customer);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


    }

}
