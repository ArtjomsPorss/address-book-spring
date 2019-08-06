package artporsh.addressbook.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import artporsh.addressbook.AddressBookService;
import artporsh.addressbook.entities.Entry;

@Controller
public class AddressBookController {
	
	@Autowired
	private AddressBookService service;
	
	public void setAddressBookService(AddressBookService service) {
		this.service = service;
	}

	public List<Entry> viewAllEntries() {
		List<Entry> entries = service.getAll();
		return entries;
	}

	public void viewEntry(long id) {
		Entry entry = service.get(id);
	}
	
	public void updateEntry(Entry entry) {
		int result = service.update(entry);
	}
	
	public void deleteEntry(long id) {
		int result = service.delete(id);
	}
	
}
