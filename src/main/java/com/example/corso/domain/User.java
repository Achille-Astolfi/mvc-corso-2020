package com.example.corso.domain;

public class User {
	private String firstName;
	private String lastName;
	private int isoSex; // 1 = maschio, 2 = femmina, 0 = sconosciuto, 9 = non applicabile

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIsoSex() {
		return isoSex;
	}

	public void setIsoSex(int isoSex) {
		this.isoSex = isoSex;
	}
}
