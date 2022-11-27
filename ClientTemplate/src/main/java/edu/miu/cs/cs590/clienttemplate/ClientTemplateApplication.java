package edu.miu.cs.cs590.clienttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientTemplateApplication implements CommandLineRunner {

    @Autowired
    private RestOperations restTemplate;



    public static void main(String[] args) {
        SpringApplication.run(ClientTemplateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        String serverUrl = "http://localhost:8081/products";

                //Create Review Class
        restTemplate.postForLocation(serverUrl,new Review ("1234","good",10));
        restTemplate.postForLocation(serverUrl,new Review ("102","good",8));

        //Create Stock Class
        restTemplate.postForLocation(serverUrl,new Stock (12542,"1234GBS"));
        restTemplate.postForLocation(serverUrl,new Stock (12042,"02NBV34"));

        //Create    Supplier   class
        restTemplate.postForLocation(serverUrl,new Supplier (1234,"Walmart","2031-7458-0125","walmart@.com"));
        restTemplate.postForLocation(serverUrl,new Supplier (12042,"Publixs","563-789-1254","pblixs@.com"));

        //Create    Product   class
        restTemplate.postForLocation(serverUrl, new Product(9362,"Bread",2.29));

        restTemplate.postForLocation(serverUrl, new Product(932,"Milk",1.29));

        restTemplate.postForLocation(serverUrl, new Product(362,"water",2.29));

        restTemplate.postForLocation(serverUrl, new Product(45289,"Juice",2.29));



        Product product= restTemplate.getForObject(serverUrl+"/{id}", Product.class,362);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!Get Book By Id!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println(product);



    }

    @Bean
    RestOperations restTemplate() {
        return new RestTemplate();
    }
}
