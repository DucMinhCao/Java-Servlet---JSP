package Mypack;

public class Users {
	private String name;
	private String work;
	private String address;
	
	public Users() {}
	
	public Users(String name, String work, String address) {
		this.name = name;
		this.work = work;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWork() {
		return work;
	}
	
	public void setWork(String work) {
		this.work = work;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
