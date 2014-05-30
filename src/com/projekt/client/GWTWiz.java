package com.projekt.client;

import com.projekt.client.LogowanieService;
import com.projekt.client.LogowanieServiceAsync;
import com.projekt.shared.models.Dane;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class GWTWiz implements EntryPoint {
	//RPC Async Service
	LogowanieServiceAsync logowanieService = GWT.create(LogowanieService.class);
	DaneServiceAsync daneService = GWT.create(DaneService.class);
	
	//http://www.gwtapps.com/doc/html/com.google.gwt.user.client.ui.DialogBox.html
	//tworzenie wyskakującego okienka
	private static class MyDialog extends DialogBox {
	    public MyDialog() {
	    	Button okBTN = new Button("OK");
	    	okBTN.setWidth("100%");
	    	okBTN.addClickHandler(new ClickHandler() {
	    		public void onClick(ClickEvent event) {
	    			MyDialog.this.hide();
	    		}
	    	});
	      setWidget(okBTN);
	    }
	}
	
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
		final Label imieLBL = new Label();
		final Label nazwiskoLBL = new Label();
		final Label emailLBL = new Label();
		final Label nazwaFirmyLBL = new Label();
		final Label ulicaLBL = new Label();
		final Label miastoLBL = new Label();
		final Label kodPocztowyLBL = new Label();
		final Label opisLBL = new Label();
		final Label telLBL = new Label();
		final Label stronaLBL = new Label();
		final Image zdjecie = new Image();
		
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
		
		//pobieramy początkowe dane
		daneService.getDane(new AsyncCallback<Dane>() {
			
			@Override
			public void onFailure(Throwable caught) {
				//obsługa błedu
			}
			
			@Override
			public void onSuccess(Dane result) {
				imieLBL.setText(result.getImie());
				nazwiskoLBL.setText(result.getNazwisko());
				emailLBL.setText(result.getEmail());
				nazwaFirmyLBL.setText(result.getNazwaFirmy());
				ulicaLBL.setText(result.getUlica());
				miastoLBL.setText(result.getMiasto());
				kodPocztowyLBL.setText(result.getKodPocztowy());
				opisLBL.setText(result.getOpis());
				telLBL.setText(result.getTel());
				stronaLBL.setText(result.getStrona());
				zdjecie.setUrl(result.getZdjecie());
			}
		});	

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
		
		//obsluga buttonu zaloguj
		zalogujBTN.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				//pobieramy stringi z textboxów
				final String login = loginTB.getText();
				final String haslo = hasloTB.getText();
				
				//za pomocą stworzonego interfejsu logowania sprawdzamy czy dane się zgadzają
				logowanieService.sprawdzLogin(login, haslo, new AsyncCallback<Boolean>(){

					@Override
					public void onFailure(Throwable caught) {
						//obsługa błędu				
					}

					@Override
					public void onSuccess(Boolean result) {
						if (result == true){
							imieTB.setText(imieLBL.getText());
							nazwiskoTB.setText(nazwiskoLBL.getText());
							emailTB.setText(emailLBL.getText());
							nazwaFirmyTB.setText(nazwaFirmyLBL.getText());
							ulicaTB.setText(ulicaLBL.getText());
							miastoTB.setText(miastoLBL.getText());
							kodPocztowyTB.setText(kodPocztowyLBL.getText());
							opisTB.setText(opisLBL.getText());
							telTB.setText(telLBL.getText());
							stronaTB.setText(stronaLBL.getText());
							zdjecieTB.setText(zdjecie.getUrl());
							DOM.getElementById("logowanieDIV").getStyle().setDisplay(Display.NONE);
							DOM.getElementById("wizytowka").getStyle().setDisplay(Display.NONE);
							DOM.getElementById("edycja").getStyle().setDisplay(Display.BLOCK);
						}
						else {
							DialogBox db = new MyDialog();
							db.center();
							db.setText("ZŁY LOGIN LUB HASŁO!");
							db.show();
						}
					}
				});
			}
		});
		
		//obsługa buttonu wyloguj
		wylogujBTN.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				//"czyścimy" textboxy logowania, wyświetlamy/chowamy odpowiednie elementy HTML
				loginTB.setText("");
				hasloTB.setText("");
				DialogBox db = new MyDialog();
				db.center();
				db.setText("WYLOGOWANO POPRAWNIE!");
				db.show();
				DOM.getElementById("wizytowka").getStyle().setDisplay(Display.BLOCK);
				DOM.getElementById("logowanieDIV").getStyle().setDisplay(Display.BLOCK);
				DOM.getElementById("edycja").getStyle().setDisplay(Display.NONE);
			}
		});
		
		zapiszBTN.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				
				//pobieramy dane z TB, które mają być zapisane
				final String imie = imieTB.getText();
				final String nazwisko = nazwiskoTB.getText();
				final String email = emailTB.getText();
				final String nazwaFirmy = nazwaFirmyTB.getText();
				final String ulica = ulicaTB.getText();
				final String miasto = miastoTB.getText();
				final String kodPocztowy = kodPocztowyTB.getText();
				final String opis = opisTB.getText();
				final String tel = telTB.getText();
				final String strona = stronaTB.getText();
				final String zdjecieUrl = zdjecieTB.getText();
				
				//tworzymy nowy obiekt z pobranymi danymi
				Dane daneDoZapisania = new Dane(imie, nazwisko, 
						email, nazwaFirmy, ulica, miasto, 
						kodPocztowy, opis, tel, strona, zdjecieUrl);

				//zapisujemy nowe dane
				daneService.setDane(daneDoZapisania, new AsyncCallback<Void>(){

					@Override
					public void onFailure(Throwable caught) {
						//obsługa błędu
					}

					@Override
					public void onSuccess(Void result) {
						//wstawiamy wcześniej pobrane dane do LBL
						imieLBL.setText(imie);
						nazwiskoLBL.setText(nazwisko);
						emailLBL.setText(email);
						nazwaFirmyLBL.setText(nazwaFirmy);
						ulicaLBL.setText(ulica);
						miastoLBL.setText(miasto);
						kodPocztowyLBL.setText(kodPocztowy);
						opisLBL.setText(opis);
						telLBL.setText(tel);
						stronaLBL.setText(strona);
						zdjecie.setUrl(zdjecieUrl);

						DialogBox db = new MyDialog();
						db.center();
						db.setText("ZAPISANO!");
						db.show();	
					}
				});	
			}
		});
	}
}