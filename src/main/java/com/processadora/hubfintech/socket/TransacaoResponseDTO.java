package com.processadora.hubfintech.socket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransacaoResponseDTO {
	
	private String action;
	private String code;
	@JsonProperty(value="authorization_code")
	private String authorizationCode;

    public TransacaoResponseDTO() {
    }

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}
    
}
