package artporsh.addressbook;

import java.util.List;

import artporsh.addressbook.entities.Entry;

public interface AddressBookDAO {

	public List<Entry> getAll();
	
	public Entry get(long id);
	
	public int update(Entry entry);
	
	public int delete(long id);
}
