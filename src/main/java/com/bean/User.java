package servlet_crud.src.main.java.com.bean;

import java.util.List;

public class User {
	private String FirstName,LastName,Email;
	private int id,age;
	private long mobile;
	
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, int id, int age, long mobile) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.id = id;
		this.age = age;
		this.mobile = mobile;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", id=" + id + ", age="
				+ age + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
	

}
