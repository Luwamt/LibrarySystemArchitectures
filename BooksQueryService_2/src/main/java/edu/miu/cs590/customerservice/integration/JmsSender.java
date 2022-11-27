//package edu.miu.cs590.customerservice.integration;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import edu.miu.cs590.customerservice.dto.CustomerAddEventDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JmsSender {
//
//    @Autowired
//    private JmsTemplate jmsTemplate;
//
//    public void sendMessage(CustomerAddEventDto productEvent){
//       try{
//           //Convert object to string
//           ObjectMapper mapper = new ObjectMapper();
//           String asString = mapper.writeValueAsString(productEvent);
//           System.out.println("Sending Jms: "+asString);
//           jmsTemplate.convertAndSend("ProductChangeEvent",asString);
//
//       }catch (JsonProcessingException e){
//           e.printStackTrace();
//       }
//    }
//}
