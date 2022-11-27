package edu.miu.cs590.customerservice.repository;

import edu.miu.cs590.customerservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer> {

}
