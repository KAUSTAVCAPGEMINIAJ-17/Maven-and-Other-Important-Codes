package com.capgemini.author.personalDetails.models;

/**
 * 
 * @program for author details
 *
 */
public class AuthorModel {
	private String name;
	private String email;
	private char gender;
	
	/**
	 * Constructor of author class by genesis
	 */
	public AuthorModel() {
		super();
	}


	public AuthorModel(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorModel other = (AuthorModel) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}


	public void validateName() {
		if(this.name.isBlank())
			throw new RuntimeException("Please put a Valid input for Name..");
	}


	public void validateEmail() {
		if(!this.email.contains("@"))
			throw new RuntimeException("Email should contain a @");
	}


	public void validateGender() {
		if(this.gender!='m' || this.gender!='f'|| this.gender!='u')
			throw new RuntimeException("Gender should be male female or unknown ");	
	}
	
	
}