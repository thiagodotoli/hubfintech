package com.processadora.hubfintech.model;

import org.springframework.data.annotation.Id;

public class Cartao {

    @Id
    public String id;

    public String cardNumber;
    public double availableAmount;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(double availableAmount) {
		this.availableAmount = availableAmount;
	}

     
	
}
