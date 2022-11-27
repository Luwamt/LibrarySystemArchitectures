package edu.miu.cs590.customerservice.service;


import edu.miu.cs590.customerservice.dto.ReviewDto;
import edu.miu.cs590.customerservice.model.Review;

import java.util.List;

public interface ReviewService {

    public void addReview(ReviewDto reviewDto);
    List<Review> getAllReviews();
   // Review getCustomer(Integer customerNumber);
   // void deleteCustomer(Integer customerNumber);
   // void updateCustomer(Integer customerNumber, ReviewDto customerDto);
}
