package artporsh.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import artporsh.addressbook.entities.Entry;

@Repository
//@Profile("test")
public class AddressBookDAOImpl implements AddressBookDAO {
	
	public List<Entry> generateMockEntryCollection() {
		List<Entry> list = new ArrayList<>();
		list.add(new Entry(11, "Dr Nicerrrrrrrrr"));
		list.add(new Entry(12, "Narco"));
		list.add(new Entry(13, "Bombasto"));
		list.add(new Entry(14, "Celeritas"));
		list.add(new Entry(15, "Magneta"));
		list.add(new Entry(16, "RubberMan"));
		list.add(new Entry(17, "Dynama"));
		list.add(new Entry(18, "Dr IQ"));
		list.add(new Entry(19, "Magma"));
		list.add(new Entry(20, "Tornado"));

		return list;
	}

	public List<Entry> getAll() {
		// TODO Auto-generated method stub
//		return Collections.emptyList();
		return generateMockEntryCollection();
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
