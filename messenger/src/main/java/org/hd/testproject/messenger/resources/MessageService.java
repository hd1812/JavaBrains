package org.hd.testproject.messenger.resources;

import java.util.ArrayList;
import java.util.List;

import org.hd.testproject.messenger.resources.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1=new Message(1L,"Hello World!","hd");
		Message m2=new Message(2L,"Hello Jersey!","hd");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
}
