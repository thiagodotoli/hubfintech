package com.processadora.hubfintech.enums;

public enum Tipo {
	APROVADA("00"),
	SALDO_INSUFICIENTE("51"),
	CONTA_INVALIDA("14"), 
	ERRO_PROCESSAMENTO("96");
	
	private Tipo(String code) {
		this.code = code;
	}

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
