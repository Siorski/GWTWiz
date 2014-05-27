package com.projekt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class GWTWiz implements EntryPoint {
	
	public void onModuleLoad() {
		//ukrywamy formularz edycji wizytówki
		DOM.getElementById("edycja").getStyle().setDisplay(Display.NONE);
		
		//tworzymy buttony
		final Button zalogujBTN = new Button("Zaloguj");
		final Button wylogujBTN = new Button("Wyloguj");
		final Button zapiszBTN = new Button("Zapisz");
		
		//dodajemy buttony do strony
		RootPanel.get("zalogujBTN").add(zalogujBTN);
		RootPanel.get("wylogujBTN").add(wylogujBTN);
		RootPanel.get("zapiszBTN").add(zapiszBTN);
		
		//tworzymy labele, w których wyświetlane będa dane na wizytówce
		final Label imieLBL = new Label("Kacper");
		final Label nazwiskoLBL = new Label("Siora");
		final Label emailLBL = new Label("adres@wp.pl");
		final Label nazwaFirmyLBL = new Label("FC MiSieNieChce");
		final Label ulicaLBL = new Label("ul. Ulica");
		final Label miastoLBL = new Label("Gdzieś");
		final Label kodPocztowyLBL = new Label("88-888");
		final Label opisLBL = new Label("zawód piłkarz");
		final Label telLBL = new Label("123-456-789");
		final Label stronaLBL = new Label("www.cos.pl");
		final Image zdjecie = new Image();
		zdjecie.setUrl("http://img1.wikia.nocookie.net/__cb20081103220142/witcher/images/9/9a/People_Professor_wanted.png");
		
		//dodajemy labele do strony
		RootPanel.get("imieLBL").add(imieLBL);
		RootPanel.get("nazwiskoLBL").add(nazwiskoLBL);
		RootPanel.get("emailLBL").add(emailLBL);
		RootPanel.get("nazwaFirmyLBL").add(nazwaFirmyLBL);
		RootPanel.get("ulicaLBL").add(ulicaLBL);
		RootPanel.get("miastoLBL").add(miastoLBL);
		RootPanel.get("kodPocztowyLBL").add(kodPocztowyLBL);
		RootPanel.get("opisLBL").add(opisLBL);
		RootPanel.get("telLBL").add(telLBL);
		RootPanel.get("stronaLBL").add(stronaLBL);
		RootPanel.get("zdjecieDIV").add(zdjecie);		
		
		//tworzymy textboxy do logowania
		final TextBox loginTB = new TextBox();
		final PasswordTextBox hasloTB = new PasswordTextBox();
		loginTB.setWidth("150px");
		hasloTB.setWidth("150px");
		
		//dodajemy textboxy logujace na strone
		RootPanel.get("loginTB").add(loginTB);
		RootPanel.get("hasloTB").add(hasloTB);
		
		//tworzymy textboxy do edycji wizytówki
		final TextBox imieTB = new TextBox();
		final TextBox nazwiskoTB = new TextBox();
		final TextBox emailTB = new TextBox();
		final TextBox nazwaFirmyTB = new TextBox();
		final TextBox ulicaTB = new TextBox();
		final TextBox miastoTB = new TextBox();
		final TextBox kodPocztowyTB = new TextBox();
		final TextBox opisTB = new TextBox();	
		final TextBox telTB = new TextBox();
		final TextBox stronaTB = new TextBox();
		final TextBox zdjecieTB = new TextBox();
				
		//dodajemy textboxy na strone
		RootPanel.get("imieTB").add(imieTB);
		RootPanel.get("nazwiskoTB").add(nazwiskoTB);
		RootPanel.get("emailTB").add(emailTB);
		RootPanel.get("nazwaFirmyTB").add(nazwaFirmyTB);
		RootPanel.get("ulicaTB").add(ulicaTB);
		RootPanel.get("miastoTB").add(miastoTB);
		RootPanel.get("kodPocztowyTB").add(kodPocztowyTB);
		RootPanel.get("opisTB").add(opisTB);
		RootPanel.get("telTB").add(telTB);
		RootPanel.get("stronaTB").add(stronaTB);
		RootPanel.get("zdjecieTB").add(zdjecieTB);
	}
}
