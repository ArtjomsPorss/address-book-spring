package artporsh.addressbook.entities;

public class Entry {

	private long id;
	private String name;

	public Entry(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Entry() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
