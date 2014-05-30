package com.projekt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.projekt.client.DaneService;
import com.projekt.shared.models.Dane;

public class DaneServiceImpl extends RemoteServiceServlet implements DaneService {

	private static final long serialVersionUID = 1L;
	
	//ustawianie wartości początkowych
	Dane dane = new Dane("Kacper", "Siora", "adres@wp.pl", "FC MiSieNieChce", "ul. Ulica", 
			"Gdzieś", "88-888", "zawód piłkarz", "123-456-789", "www.cos.pl",
			"http://img1.wikia.nocookie.net/__cb20081103220142/witcher/images/9/9a/People_Professor_wanted.png");
	
	@Override
	public Dane getDane() {
		return dane;
	}

	@Override
	public void setDane(Dane daneDoZapisania) {
		dane.setImie(daneDoZapisania.getImie());
		dane.setNazwisko(daneDoZapisania.getNazwisko());
		dane.setEmail(daneDoZapisania.getEmail());
		dane.setNazwaFirmy(daneDoZapisania.getNazwaFirmy());
		dane.setUlica(daneDoZapisania.getUlica());
		dane.setMiasto(daneDoZapisania.getMiasto());
		dane.setKodPocztowy(daneDoZapisania.getKodPocztowy());
		dane.setOpis(daneDoZapisania.getOpis());
		dane.setTel(daneDoZapisania.getTel());
		dane.setStrona(daneDoZapisania.getStrona());	
		dane.setZdjecie(daneDoZapisania.getZdjecie());	
	}
}