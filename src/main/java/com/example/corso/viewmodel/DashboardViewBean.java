package com.example.corso.viewmodel;

import com.example.corso.domain.User;

/**
 * View Bean della view dashboard.
 * 
 * @author Achille
 *
 */
public class DashboardViewBean {
	// Il ViewBean è di solito un JavaBean, più precisamente è un Data Transfer
	// Object (DTO).
	// Per DTO si intente una class JavaBean che comprende (quasi) esclusivamente
	// campi con i rispettivi getter e setter.

	// qui posso mettere per esempio un riferimento all'utente identificato
	// normalmente sarebbe un tipo strutturato come User, Role, ecc.
	// cambio di specifica: non cambia né tipo né nome, cambia solo la semantica
	private String userName;
	// esempio: un titolo per il mio cruscotto
	private String title;
	// e qui posso andare avanti, per esempio List<Portlet> o cose del genere
	// per indicare un elenco di riquadri da inserire nel cruscotto
	// nuova specifica; creo il nuovo campo e genero getter e setter
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
