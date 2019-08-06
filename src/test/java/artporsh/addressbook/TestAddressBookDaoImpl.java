package artporsh.addressbook;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import artporsh.addressbook.AddressBookDAO;
import artporsh.addressbook.AddressBookDAOImpl;

public class TestAddressBookDaoImpl {
	
	public AddressBookDAO dao;
	
	@Before
	public void init() {
		dao = new AddressBookDAOImpl();
	}
	
	@Test
	public void getAll() {
		assertNotNull("List cannot be null", dao.getAll());
	}
	
	
}
