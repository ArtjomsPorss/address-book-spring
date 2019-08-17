package artporsh.addressbook.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import artporsh.addressbook.AddressBookService;
import artporsh.addressbook.entities.Entry;

@RestController
public class AddressBookController {
	
	@Autowired
	private AddressBookService service;
	
	@RequestMapping("/")
	public String hello() {
		return "Greetings from Spring Boot: " + getAllEntries();
	}
	
	@RequestMapping("/all")
	public List<Entry> viewAllEntries() {
		return getAllEntries();
	}
	
	@RequestMapping("detail/{id}")
	public Entry viewAllEntries(@PathVariable final long id) {
		Optional<Entry> opt = getAllEntries().stream().filter(e -> e.getId() == id).findFirst();
		if(opt.isPresent()) {
			return opt.get();
		} else {
			return new Entry();
		}
	}
//	
//	@RequestMapping("/all")
//	public Map<String, Object> viewAllEntries() {
//		Map<String, Object> map = new HashMap<>();
//		map.put("allEntries", getAllEntries());
//		return map;
//	}
	
	public void setAddressBookService(AddressBookService service) {
		this.service = service;
	}

	public List<Entry> getAllEntries() {
		return service.getAll();
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
