package artporsh.addressbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artporsh.addressbook.entities.Entry;

@Service
public class AddressBookServiceImpl implements AddressBookService {

	@Autowired
	private AddressBookDAO dao;
	
	public List<Entry> getAll() {
		return dao.getAll();
	}

	public Entry get(long id) {
		return dao.get(id);
	}

	public int update(Entry entry) {
		return dao.update(entry);
	}

	public int delete(long id) {
		return dao.delete(id);
	}

}
