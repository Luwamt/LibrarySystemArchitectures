package edu.miu.cs590.customerservice.web;

import edu.miu.cs590.customerservice.dto.ReviewDto;
import edu.miu.cs590.customerservice.model.Review;
import edu.miu.cs590.customerservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/reviews"})
public class ReviewController {

    @Autowired
    public ReviewService reviewService;

@PostMapping(value = {"/post"})
public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto reviewDto){
    reviewService.addReview(reviewDto);
   return new ResponseEntity<>( reviewDto, HttpStatus.OK);
}

    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Review>> getCustomerById(){
        return  new ResponseEntity<>(reviewService.getAllReviews(),HttpStatus.OK);
    }
//    @GetMapping(value = {"/get/{customerNumber}"})
//    public ResponseEntity<?> getCustomerById(@PathVariable Integer customerNumber){
//        customerService.getCustomer(customerNumber);
//        return  new ResponseEntity<>(customerNumber,HttpStatus.OK);
//    }
//    @PutMapping(value = {"/update/{customerNumber}"})
//    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Integer customerNumber, @RequestBody CustomerDto customerDto){
//     customerService.updateCustomer(customerNumber,customerDto);
//    return  new ResponseEntity<>(customerDto,HttpStatus.OK);
//    }
//    @DeleteMapping(value = {"/delete/{customerNumber}"})
//    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer customerNumber){
//   customerService.deleteCustomer(customerNumber);
//    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
