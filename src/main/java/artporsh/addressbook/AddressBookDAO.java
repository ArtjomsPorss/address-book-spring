package artporsh.addressbook;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import artporsh.addressbook.entities.Entry;

public interface AddressBookDAO {
	
	public static final RowMapper<Entry> entryMapper = (rs, rowNum) -> {
		Entry e = new Entry();
		e.setId(rs.getInt("en_id"));
		e.setName(rs.getString("en_name"));
		e.setSurname(rs.getString("en_surname"));
		return e;
	};

	public List<Entry> getAll();
	
	public Entry get(long id);
	
	public int update(Entry entry);
	
	public int delete(long id);
}
