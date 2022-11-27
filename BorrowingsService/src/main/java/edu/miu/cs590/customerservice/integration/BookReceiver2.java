package edu.miu.cs590.customerservice.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.BookAddEventDto;
import edu.miu.cs590.customerservice.service.BorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class BookReceiver2 {

    @Autowired
    BorrowingsService borrowingsService;

    @KafkaListener(topics = "BookTopic",id = "book2")

    public void receiver(@Payload String bookDto){
        ObjectMapper objectMapper=new ObjectMapper();

        BookAddEventDto book=null;
        try {
            book = objectMapper.readValue(bookDto,BookAddEventDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

       // borrowingsService.updateBorrowing(book.getBookDto().getIsbn());


    }

}
