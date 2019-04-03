package com.stress.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stress.app.model.Message;
import com.stress.app.service.MessageService;

@RestController
@RequestMapping("/")
public class MessageController {
	
	@Autowired
	MessageService service;
	
	@RequestMapping("/")
	String home() {
		return "<h1>Welcome to Aged Care Management System</h1>";
	}
	
	@RequestMapping(value="/messages",method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	String getAllMessages() throws Exception{
		List<Message> list = service.getAllMessages();
		return list.toString();
	}
	
	@RequestMapping(value="/message/add/{sender}/{receiver}/{info}",method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	String createMessage(@PathVariable int sender, @PathVariable int receiver,@PathVariable String info) throws Exception{
		Message message = new Message();
		message.setSender(sender);
		message.setReceiver(receiver);
		message.setGetInformation(info);
		return service.createMessage(message).toString();
	}
	
	@RequestMapping(value="/message/updatemessage/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	void updateMessage(@PathVariable("id") long id, @RequestBody Message message) throws Exception{
		
		((Message) message).setId(id);
		service.updateMessage(message);
	}
	
	
	
	
	

}
