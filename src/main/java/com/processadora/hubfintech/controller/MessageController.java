package com.processadora.hubfintech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.processadora.hubfintech.service.ProcessadoraService;
import com.processadora.hubfintech.socket.TransacaoDTO;
import com.processadora.hubfintech.socket.TransacaoResponseDTO;

@Controller
public class MessageController {
	
	@Autowired
    private ProcessadoraService service;

    /*
     * This MessageMapping annotated method will be handled by
     * SimpAnnotationMethodMessageHandler and after that the Message will be
     * forwarded to Broker channel to be forwarded to the client via WebSocket
     */
    @MessageMapping("/withdraw")
    @SendTo("/topic/all")
    public TransacaoResponseDTO post(TransacaoDTO message) {
    	//message.put("timestamp", Long.toString(System.currentTimeMillis()));
        //chatHistoryDao.save(message);
    	
        return service.resultadoTransacao(message);
    }
//
//    @GetMapping("/history")
//    public List<Map<String, String>> getChatHistory() {
//        return chatHistoryDao.get();
//    }
}
