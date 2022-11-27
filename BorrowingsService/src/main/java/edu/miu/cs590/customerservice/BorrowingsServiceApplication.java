package edu.miu.cs590.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
@EnableMongoRepositories
public class BorrowingsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BorrowingsServiceApplication.class, args);

        System.out.println("Hello BorrowingsService");
    }

}
