package artporsh.addressbook;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import artporsh.addressbook.AddressBookDAO;
import artporsh.addressbook.AddressBookDAOImpl;
import artporsh.addressbook.AddressBookService;
import artporsh.addressbook.AddressBookServiceImpl;

/**
 * Test using Mockito and JUnit4
 * Test uses annotations, Mocks are injected
 * @author PorssA
 *
 */
public class TestAddressBookService {

	@Mock
	public AddressBookDAO dao; // can be interface
	@InjectMocks
	public AddressBookServiceImpl service;  // has to be class - implementation type
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getAll() {
		when(dao.getAll()).thenReturn(Collections.emptyList());
		
		assertNotNull("Returned list is not null", service.getAll());
		
		verify(dao).getAll();
	}
}
