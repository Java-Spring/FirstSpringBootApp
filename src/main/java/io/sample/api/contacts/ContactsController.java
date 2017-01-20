package io.sample.api.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/getAllcontactDetails")
	public List<Contact> getAllContactDetails(){
		return contactService.getAllContactDetails();
	}
	
	@RequestMapping("/getContact/{id}")
	public Contact getContact(@PathVariable Integer id){
		return contactService.getContact(id);
	}
}
