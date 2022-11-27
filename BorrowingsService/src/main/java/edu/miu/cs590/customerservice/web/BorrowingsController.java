package edu.miu.cs590.customerservice.web;

import edu.miu.cs590.customerservice.dto.BorrowingsDto;
import edu.miu.cs590.customerservice.dto.CustomerDto;
import edu.miu.cs590.customerservice.model.Borrowings;
import edu.miu.cs590.customerservice.service.BorrowingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/borrowings"})
public class BorrowingsController {

    @Autowired
    public BorrowingsService borrowingsService;

@PostMapping(value = {"/post"})
public ResponseEntity<BorrowingsDto> addBorrowings(@RequestBody BorrowingsDto borrowingsDto){
    borrowingsService.addBorrowings(borrowingsDto);
   return new ResponseEntity<>( borrowingsDto, HttpStatus.OK);
}
@GetMapping(value = {"/get/{borrowingNumber}"})
    public ResponseEntity<?> getByBorrowingId(@PathVariable Integer borrowingNumber){
    borrowingsService.getBorrowingById(borrowingNumber);
    return  new ResponseEntity<>(borrowingNumber,HttpStatus.OK);
}
    @GetMapping(value = {"/list"})
    public ResponseEntity<List<Borrowings>> getBorrowings(){
        return  new ResponseEntity<>(
                borrowingsService.getAllBorrowings(),HttpStatus.OK);
    }
    @PutMapping(value = {"/update/{borrowingNumber}"})
    public ResponseEntity<BorrowingsDto> updateBorrowing(@PathVariable Integer borrowingNumber, @RequestBody BorrowingsDto borrowingsDto){
     borrowingsService.updateBorrowing(borrowingNumber,borrowingsDto);
    return  new ResponseEntity<>(borrowingsDto,HttpStatus.OK);
    }
    @DeleteMapping(value = {"/delete/{borrowingNumber}"})
    public ResponseEntity<Void> deleteBorrowing(@PathVariable Integer borrowingNumber){
   borrowingsService.deleteBorrowing(borrowingNumber);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
