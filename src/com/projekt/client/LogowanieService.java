package com.projekt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("logowanie")
public interface LogowanieService extends RemoteService {
	Boolean sprawdzLogin(String login, String haslo);
}
