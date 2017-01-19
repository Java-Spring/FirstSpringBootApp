package io.sample.api.contacts;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	
	@RequestMapping("/getAllcontactDetails")
	public List<Contact> getAllContactDetails(){
		return Arrays.asList(
				new Contact(1,"user1","user1L",18,"2017-01-08T05:00:00.000Z","Male",1234567890, "Atlanta", 1),
				new Contact(1,"user1","user1L",18,"2017-01-08T05:00:00.000Z","Male",1234567890, "Atlanta", 1)
				);
	}
}
