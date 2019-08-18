package artporsh.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import artporsh.addressbook.entities.Entry;

//@Profile("test")
@Repository
public class AddressBookDAOImpl implements AddressBookDAO {
	
	private JdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	

	public List<Entry> getAll() {
		return template.query("SELECT * FROM tdab_entries", entryMapper);
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
