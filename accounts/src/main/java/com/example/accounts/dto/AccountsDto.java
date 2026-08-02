package com.example.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data

public class AccountsDto {


    private Long accountNumber;


    private String accountType;


    private String branchAddress;
}
