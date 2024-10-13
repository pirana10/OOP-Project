package crudtable.model;

/**
 * User.java
 * This is a model class represents a User entity
 *
 */
public class User {
	protected int id;
	protected String name;
	protected String mobile;
	protected String email;
	protected String position;
	protected String address;
	
	public User() {
	}
	
	public User(String name, String mobile, String email, String position, String address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.position = position;
		this.address = address;
	}
	
	public User(int id, String name, String mobile, String email, String position, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.position = position;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
