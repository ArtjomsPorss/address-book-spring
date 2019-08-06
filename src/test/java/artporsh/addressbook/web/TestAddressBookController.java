package artporsh.addressbook.web;

import artporsh.addressbook.AddressBookServiceImpl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

/**
 * Test using Mockito and JUnit4
 * No Mockito annotations here, the Mock is set using setter
 * @author PorssA
 *
 */
public class TestAddressBookController {

	public AddressBookController controller;
	public AddressBookServiceImpl service = mock(AddressBookServiceImpl.class);
	
	@Before
	public void init() {
		controller = new AddressBookController();
		controller.setAddressBookService(service);
	}
	
	@Test
	public void viewAllEntries() {
		// stup behavior of mock - we don't care what it supposed to do, just return mock object
		when(service.getAll()).thenReturn(Collections.emptyList());
		// actual test is of controller - that her passes on object from mock to us in same state
		assertNotNull("Entries list should not be null", controller.viewAllEntries());
		// verify the mock was called
		verify(service, times(1));
	}
	
}
