package edu.miu.cs590.customerservice.dto;


import edu.miu.cs590.customerservice.model.Borrowings;

public class BorrowingsAdapter {

    public static Borrowings fromBorrowingsDto(BorrowingsDto dto){
        return new Borrowings(dto.getBorrowingNumber(),
                dto.getDate(),dto.getCustomer(),dto.getBook());
    }
    public static BorrowingsDto toBorrowingsDto(Borrowings borrowings){
        return new BorrowingsDto(borrowings.getBorrowingNumber(),
                borrowings.getDate(),borrowings.getCustomer(),
        borrowings.getBook());
    }
}
