package com.example.accounts.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class CustomerDto {


    private String name;


    private String email;


    private String mobileNumber;


    private AccountsDto accountsDto;
}