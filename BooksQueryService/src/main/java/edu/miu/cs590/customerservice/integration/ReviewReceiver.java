package edu.miu.cs590.customerservice.integration;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.customerservice.dto.BookDto;
import edu.miu.cs590.customerservice.dto.ReviewDto;
import edu.miu.cs590.customerservice.model.Book;
import edu.miu.cs590.customerservice.model.Review;
import edu.miu.cs590.customerservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ReviewReceiver {

    @Autowired
    BookService bookService;

    @KafkaListener(topics = {"reviewTopic"})
    public void receive(@Payload String review) {
        ObjectMapper objectMapper=new ObjectMapper();
        ReviewDto reviewDto = null;
        try {
            reviewDto = objectMapper.readValue(review, ReviewDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
       System.out.println("Receiver1 received message= "+ review);
    }

}