package com.projekt.shared.models;

import java.io.Serializable;

public class Dane implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String imie;
	private String nazwisko;
	private String email;
	private String nazwaFirmy;
	private	String ulica;
	private	String miasto;
	private	String kodPocztowy;
	private	String opis;
	private	String tel;
	private	String strona;
	private	String zdjecie;
	
	public Dane(){};
	
	public Dane(String imie, String nazwisko, String email, String nazwaFirmy, 
			String ulica, String miasto, String kodPocztowy, 
			String opis, String tel, String strona, String zdjecie) {
			this.imie = imie;
			this.nazwisko = nazwisko;
			this.email = email;
			this.nazwaFirmy = nazwaFirmy;
			this.ulica = ulica;
			this.miasto = miasto;
			this.kodPocztowy = kodPocztowy;
			this.opis = opis;
			this.tel = tel;
			this.strona = strona; 
			this.zdjecie = zdjecie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNazwaFirmy() {
		return nazwaFirmy;
	}

	public void setNazwaFirmy(String nazwaFirmy) {
		this.nazwaFirmy = nazwaFirmy;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getStrona() {
		return strona;
	}

	public void setStrona(String strona) {
		this.strona = strona;
	}

	public String getZdjecie() {
		return zdjecie;
	}

	public void setZdjecie(String zdjecie) {
		this.zdjecie = zdjecie;
	}
}