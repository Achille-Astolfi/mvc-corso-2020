package com.example.corso.viewmodel;

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
	private String userName;
	// esempio: un titolo per il mio cruscotto
	private String title;
	// e qui posso andare avanti, per esempio List<Portlet> o cose del genere
	// per indicare un elenco di riquadri da inserire nel cruscotto

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
