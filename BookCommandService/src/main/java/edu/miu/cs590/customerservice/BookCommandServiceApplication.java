package edu.miu.cs590.customerservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
public class BookCommandServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCommandServiceApplication.class, args);

        System.out.println("Hello BookCommand");
    }


}


