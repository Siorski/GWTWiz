package com.projekt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.projekt.client.LogowanieService;

public class LogowanieServiceImpl extends RemoteServiceServlet implements LogowanieService {

	private static final long serialVersionUID = 1L;
	String nazwaUzytkownika = "admin";
	String hasloUzytkownika = "admin";
	
	@Override
	public Boolean sprawdzLogin(String login, String haslo) {
		return ( nazwaUzytkownika.equals(login) && hasloUzytkownika.equals(haslo) );
	}
}
