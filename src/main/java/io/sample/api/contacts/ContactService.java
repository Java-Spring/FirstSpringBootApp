package io.sample.api.contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;

	private List<Contact> contact = Arrays.asList(
			new Contact(1,"user1","user1L",18,"2017-01-08T05:00:00.000Z","Male",1234567890, "Atlanta", 1),
			new Contact(2,"user2","user1L",18,"2017-01-08T05:00:00.000Z","Male",1234567890, "Atlanta", 1)
			);
	public List<Contact> getAllContactDetails(){
		//return contact;
		List<Contact> contact = new ArrayList <>();
		contactRepository.findAll()
		.forEach(contact::add);
		return contact;
	}
	
	public Contact getContact(Integer id){
		return contact.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
