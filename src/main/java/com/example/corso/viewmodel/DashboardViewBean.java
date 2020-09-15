package com.example.corso.viewmodel;

public class DashboardViewBean {
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
