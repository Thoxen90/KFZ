package kfz;

public class Fahrer extends SchichtArbeiter {

	private String fuehrerscheinKlasse;
	
	public Fahrer(int id,String name,double stundenSatz, String fuehrerscheinKlasse) {
		super(id,name,stundenSatz);
	}
	
	public void fahrenZu(KFZ fahrzeug,GPS Ziel) {
		fahrzeug.setAktuellePosition(Ziel);
	}

	
	public void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
		this.fuehrerscheinKlasse = fuehrerscheinKlasse;
	}
	
	public String getFuehrerschein() {
		return this.fuehrerscheinKlasse;
	}
	
	
}
