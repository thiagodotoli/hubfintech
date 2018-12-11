package com.processadora.hubfintech.socket;

public class TransacaoDTO {
	
	private String action;
	private String cardNumber;
	private String amount;
	
    public TransacaoDTO() {
    }

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

    
    
}
