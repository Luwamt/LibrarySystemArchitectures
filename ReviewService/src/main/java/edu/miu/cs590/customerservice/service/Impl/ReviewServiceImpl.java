package edu.miu.cs590.customerservice.service.Impl;
import edu.miu.cs590.customerservice.dto.ReviewAdapter;
import edu.miu.cs590.customerservice.dto.ReviewDto;
import edu.miu.cs590.customerservice.integration.Sender;
import edu.miu.cs590.customerservice.model.Review;
import edu.miu.cs590.customerservice.repository.ReviewRepository;
import edu.miu.cs590.customerservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    Sender sender;
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public void addReview(ReviewDto reviewDto) {
       Review review= ReviewAdapter.fromReviewDto(reviewDto);
        System.out.println("From DTO:"+ reviewDto);
        System.out.println("From:"+ review);
        reviewRepository.save(review);
        sender.send(reviewDto);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    }

