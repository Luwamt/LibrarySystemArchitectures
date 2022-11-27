package edu.miu.cs590.customerservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;


@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
public class BookQueryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookQueryServiceApplication.class, args);

        System.out.println("Hello BookQuery1");
    }


}


