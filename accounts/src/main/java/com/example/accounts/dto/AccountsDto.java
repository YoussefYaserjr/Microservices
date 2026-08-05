package com.example.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotNull(message = "Account number cannot be null")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be null or empty")
    @Pattern(regexp = "(^$|[A-Za-z]+)", message = "Account type must be alphabetic")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
