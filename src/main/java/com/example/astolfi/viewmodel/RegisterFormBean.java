package com.example.astolfi.viewmodel;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterFormBean {
	// le annotation di javax.validation e hibernate.validation si mettono (per
	// nostra comodità) sui campi
	// Per esempio, voglio che il nome e il cognome abbiano almeno un carattere
	// significativo
	// Ripasso: @NotNull -> ho un valore
	//          @NotEmpty -> ho almeno un carattere
	//          @NotBlank -> ho almeno un carattere significativo (non whitespace)
	@NotEmpty(message = "Dato obbligatorio")
	private String firstName;
	@NotEmpty(message = "Dato obbligatorio")
	private String lastName;
	private int isoSex;
	@NotEmpty(message = "Dato obbligatorio")
	@Email
	private String emailAddress;
	@NotNull
	// la password deve avere almeno 8 caratteri
	@Size(min = 8, message = "Devi inserire almeno 8 caratteri")
	private String password;
	private String passwordCheck;
	// puoi registrarti solo se accetti le condizioni di servizio
	@AssertTrue(message = "Devi accettare le condizioni di servizio")
	private boolean privacyConsent;

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public boolean isPrivacyConsent() {
		return privacyConsent;
	}

	public void setPrivacyConsent(boolean privacyConsent) {
		this.privacyConsent = privacyConsent;
	}

}
