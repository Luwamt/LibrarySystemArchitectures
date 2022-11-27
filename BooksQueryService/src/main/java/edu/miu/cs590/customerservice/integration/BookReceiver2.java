package edu.miu.cs590.customerservice.integration;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.BookDto;
import edu.miu.cs590.customerservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class BookReceiver2 {

    @Autowired
    BookService bookService;


    @KafkaListener(topics = {"BookQuery"})
    public void receive(@Payload String asString,
                        @Headers MessageHeaders headers) {

        ObjectMapper objectMapper = new ObjectMapper();
        BookDto eventDto = null; //objectMapper.readValue(asString, BookDto.class);
        try {
            eventDto = objectMapper.readValue(asString, BookDto.class);
            System.out.println("Receiver Jms received: " + eventDto);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if (eventDto.getIsbn().equals("book Updated")) {
            bookService.updateBook(eventDto.getIsbn(),eventDto);
        }else {
            bookService.saveBook(eventDto);
        }
    }
}