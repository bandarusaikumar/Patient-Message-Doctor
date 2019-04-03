package com.stress.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue
	@Column(name = "message_id")
	private int mid;
	private int sender;
	private int receiver;
	private String GetInformation;
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public String getGetInformation() {
		return GetInformation;
	}
	public void setGetInformation(String getInformation) {
		GetInformation = getInformation;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", GetInformation="
				+ GetInformation + "]";
	}
	public void setId(long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
