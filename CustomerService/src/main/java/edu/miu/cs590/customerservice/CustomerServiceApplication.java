package edu.miu.cs590.customerservice;

import edu.miu.cs590.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
public class CustomerServiceApplication  {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);

        System.out.println("Hello customer");
    }

}
