package org.gpoint.zw;

public class Person {
	
	private int id;
	private static int counter = 0;
	
	private String vorname;
	private String nachname;
	private int koepergroesse;
	private byte aktivitaetslevel;
	
	public Person(String vorname, String nachname, int koepergroesse, byte aktivitaetslevel) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.koepergroesse = koepergroesse;
		this.aktivitaetslevel = aktivitaetslevel;
		counter++;
		id = counter;
	}

	public int getKoepergroesse() {
		return koepergroesse;
	}

	public void setKoepergroesse(int koepergroesse) {
		this.koepergroesse = koepergroesse;
	}

	public byte getAktivitaetslevel() {
		return aktivitaetslevel;
	}

	public void setAktivitaetslevel(byte aktivitaetslevel) {
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String rechneBMI(int gewicht) {
		double bmi = gewicht / ((koepergroesse / 100.0) * (koepergroesse / 100.0));
		String ausgabe = "";
		
		if(bmi < 18.5) {
			ausgabe = "Untergewichtig";
		}
		if(bmi >= 18.5 && bmi < 25) {
			ausgabe = "Normalgewicht";
		}
		if(bmi >= 25 && bmi < 30) {
			ausgabe = "Übergewicht";
		}
		if(bmi >= 30) {
			ausgabe = "Adipositas";
		}
		return ausgabe;
	}
	
	public void printPerson(int gewicht) {
		switch (aktivitaetslevel) {
		case 1:
			System.out.println(getNachname() + " " + getVorname() + ", Couch Potato, " + rechneBMI(gewicht));
			break;
		case 2:
			System.out.println(getNachname() + " " + getVorname() + ", Gelegenheitssportler, " + rechneBMI(gewicht));
			break;
		case 3:
			System.out.println(getNachname() + " " + getVorname() + ", Sportler, " + rechneBMI(gewicht));
			break;
		case 4:
			System.out.println(getNachname() + " " + getVorname() + ", Profisportler, " + rechneBMI(gewicht));
			break;
		default:
			break;
		}
	}
}
