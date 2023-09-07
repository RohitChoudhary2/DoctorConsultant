package com.me.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docid;
	
	@Column(name="name")
	@NotBlank
	private String name;
	
	
	private String email;
	private int age;

	public Doctor() {
		super();
	}

	public Doctor(int docid, String name, String email,int age) {
		super();
		this.docid = docid;
		this.name = name;
		this.email = email;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	public int getdocid() {
		return docid;
	}

	@Override
	public int hashCode() {
		return docid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docid != other.docid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		/*
		 * if (String.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
		 * return false;
		 */
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [docid=" + docid + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
}