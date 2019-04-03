package com.stress.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stress.app.Rep.MessageRepo;
import com.stress.app.model.Message;

@Service
public class MessageService {

	
	@Autowired
	MessageRepo repo;
	
	List<Message> listMessage;
	
	
	public Message createMessage(Message message) {
		return repo.save(message);
	}
	
	public Message updateMessage(Message message) {
		return repo.saveAndFlush(message);
	}
	
	
	
	
	
	
	
}
