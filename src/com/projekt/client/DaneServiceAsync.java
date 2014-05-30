package com.projekt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.projekt.shared.models.Dane;

public interface DaneServiceAsync {
	void getDane(AsyncCallback<Dane> callback);
	void setDane(Dane dane, AsyncCallback<Void> callback);
}