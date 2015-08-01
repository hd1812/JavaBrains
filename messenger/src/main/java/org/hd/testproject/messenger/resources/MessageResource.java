package org.hd.testproject.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hd.testproject.messenger.resources.MessageService;
import org.hd.testproject.messenger.resources.Message;;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> setMessage(){
		return messageService.getAllMessages();
	}
	
	
	
}
