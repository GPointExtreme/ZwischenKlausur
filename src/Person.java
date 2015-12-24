
public class Person {

	private static int counter = 0;
	private String vorname;
	private String nachname;
	private int koerpergroesse;
	private byte aktivitaetslevel;
	private int id;
	
	public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
		counter++;
		id = counter;
		this.vorname = vorname;
		this.nachname = nachname;
		this.koerpergroesse = koerpergroesse;
		this.aktivitaetslevel = aktivitaetslevel;
	}
	
	public String rechneBMI(int gewicht) {
		double bmi = gewicht / ((koerpergroesse / 100.0) * (koerpergroesse / 100.0));
		String ausgabe = "";
		
		if (bmi >= 0 && bmi < 18.5) {
			ausgabe = "Untergewicht";
		}
		else if (bmi >= 18.5 && bmi < 25) {
			ausgabe = "Normalgewicht";
		}
		else if (bmi >= 25 && bmi < 30) {
			ausgabe = "Übergewicht";
		}
		else {
			ausgabe = "Adipositas";
		}
		return ausgabe;
	}
	
	public void printPerson(int gewicht) {
		switch (aktivitaetslevel) {
		case 1:
			System.out.println(vorname + " " + nachname + ", Couch Potato, " + rechneBMI(gewicht));
			break;
		case 2:
			System.out.println(vorname + " " + nachname + ", Gelegenheitssportler, " + rechneBMI(gewicht));
			break;
		case 3:
			System.out.println(vorname + " " + nachname + ", Sportler, " + rechneBMI(gewicht));
			break;
		case 4:
			System.out.println(vorname + " " + nachname + ", Profisportler, " + rechneBMI(gewicht));
			break;
		default:
			break;
		}
	}

	public int getKoerpergroesse() {
		return koerpergroesse;
	}

	public void setKoerpergroesse(int koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
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

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

}
