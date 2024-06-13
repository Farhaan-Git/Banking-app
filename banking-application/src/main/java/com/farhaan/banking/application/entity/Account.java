package com.farhaan.banking.application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // create a default constructor which is need for jpa to create a reference in the spring bean
@AllArgsConstructor // creates a all args constructor

@Table(name= "accounts")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String accountHolderName;
    private double balance;
}
