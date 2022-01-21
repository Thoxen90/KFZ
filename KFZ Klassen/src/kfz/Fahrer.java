package kfz;

public class Fahrer {

	private String fuehrerscheinKlasse;
	private int id;
	private String name;
	
	public Fahrer(int id,String name, String fuehrerscheinKlasse) {
		
	}
	
	public void fahrenZu(KFZ fahrzeug,GPS Ziel) {
		fahrzeug.setAktuellePosition(Ziel);
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
		this.fuehrerscheinKlasse = fuehrerscheinKlasse;
	}
	
	public String getFuehrerschein() {
		return this.fuehrerscheinKlasse;
	}
	
}
