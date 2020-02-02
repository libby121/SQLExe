package dao;

import java.util.ArrayList;

public class Company {





	private int id;// no set for id
	private String name;
	private String email;
	private String password;


	public Company(String name, String email, String password) {
		
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Company(){};

	public Company(int id, String name, String email, String password
			) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;

	}




	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + "]";
	}

	public String getAllinformation() {
		return "Company info [id=" + id + ", name=" + name + ", email=" + email
				+ ", password=" + password + "]";
	}

}


