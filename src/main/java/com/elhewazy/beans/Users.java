package com.elhewazy.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false)
	private int id;

	private String name;

	private String email;

	private int age;

	@OneToOne(cascade = CascadeType.ALL)

	private AddressU address;

	public Users() {
		super();
	}

	public Users(String name, String email, int age, AddressU address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressU getAddress() {
		return address;
	}

	public void setAddress(AddressU address) {
		this.address = address;
	}

}
