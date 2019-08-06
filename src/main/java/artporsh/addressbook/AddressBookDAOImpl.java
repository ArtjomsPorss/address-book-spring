package artporsh.addressbook;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import artporsh.addressbook.entities.Entry;

@Repository
public class AddressBookDAOImpl implements AddressBookDAO {

	public List<Entry> getAll() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	public Entry get(long id) {
		// TODO Auto-generated method stub
		return new Entry();
	}

	public int update(Entry entry) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
