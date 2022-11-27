package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Review;

public class ReviewAdapter {

    public static Review fromReviewDto(ReviewDto dto){
        return new Review(dto.getIsbn(), dto.getRating(),
                dto.getCustomerName(), dto.getDescription());
    }
    public static ReviewDto toReviewDto(Review review){
        return new ReviewDto(review.getIsbn(), review.getRating(),
                review.getCustomerName(), review.getDescription());
    }
}
