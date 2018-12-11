package com.processadora.hubfintech.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Transacao {

    @Id
    public String id;

    public Date date;
    public double amount;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

    
	
}
