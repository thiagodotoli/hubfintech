package com.processadora.hubfintech.service;

import java.util.concurrent.ThreadLocalRandom;

import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.processadora.hubfintech.enums.Tipo;
import com.processadora.hubfintech.model.Cartao;
import com.processadora.hubfintech.repository.CartaoRepository;
import com.processadora.hubfintech.socket.TransacaoDTO;
import com.processadora.hubfintech.socket.TransacaoResponseDTO;

@Service
public class ProcessadoraService {
	
	@Autowired
	private CartaoRepository repository;
	
	public TransacaoResponseDTO resultadoTransacao(TransacaoDTO transacao) {
		TransacaoResponseDTO response = new TransacaoResponseDTO();
		response.setAction(transacao.getAction());  
		try {
			Cartao cartao = repository.findByCardNumber(transacao.getCardNumber());
			if(cartao.getAvailableAmount()>0) {
				response.setCode(Tipo.APROVADA.getCode());  
				RandomString gen = new RandomString(6);
				response.setAuthorizationCode(gen.nextString());
			} else {
				response.setCode(Tipo.SALDO_INSUFICIENTE.getCode());  
			}
		} catch (EmptyResultDataAccessException e) {
			response.setCode(Tipo.CONTA_INVALIDA.getCode());  
		} catch (Exception e) {
			response.setCode(Tipo.ERRO_PROCESSAMENTO.getCode());  
		}
		return response;
	}
	
}
