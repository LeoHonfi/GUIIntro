package data;

public class Adress {
	String Vorname;
	String Nachname;
	String Plz;
	String Ort;
	String Straße;

	public String getVorname() {
		return Vorname;

	}

	public void setVorname(String neuer_Vorname) {
		this.Vorname = neuer_Vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String neuer_Nachname) {
		this.Nachname = neuer_Nachname;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String neuer_Ort) {
		this.Ort = neuer_Ort;
	}

	public String getStraße() {
		return Straße;

	}

	public void setStraße(String neuer_Straße) {
		this.Straße = neuer_Straße;
	}
	
	public String getPlz() {
		return Plz;

	}

	public void setPlz(String neuer_Plz) {
		this.Plz = neuer_Plz;
	}

}
