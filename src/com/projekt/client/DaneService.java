package com.projekt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.projekt.shared.models.Dane;

@RemoteServiceRelativePath("dane")
public interface DaneService extends RemoteService {
	Dane getDane();
	void setDane(Dane dane);
}
