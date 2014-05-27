package com.projekt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LogowanieServiceAsync {
	void sprawdzLogin(String login, String haslo,AsyncCallback<Boolean> callback);
}
