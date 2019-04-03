package com.stress.app.Rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stress.app.model.Message;

public interface MessageRepo extends JpaRepository<Message, Integer>{
	

}
