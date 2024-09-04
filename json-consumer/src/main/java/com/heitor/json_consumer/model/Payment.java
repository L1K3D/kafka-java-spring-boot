package com.heitor.json_consumer.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Payment implements Serializable{
    
    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
