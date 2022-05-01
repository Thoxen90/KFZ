package Mitarbeiter;
import kfz.*;
public class Fahrer extends Schichtarbeiter {

	private String fuehrerscheinKlasse;
	
	public Fahrer(int id,String name,double stundenSatz, String fuehrerscheinKlasse) throws Exception {
		super(id,name,stundenSatz);
		setFuehrerscheinKlasse(fuehrerscheinKlasse);
	}
	
	public void fahrenZu(KFZ fahrzeug,GPS Ziel) {
		fahrzeug.setAktuellePosition(Ziel);
	}

	
	public void setFuehrerscheinKlasse(String fuehrerscheinKlasse) {
		String[] zulaessigeFuehrerscheine = {"B","C","D"};
		for(String s : zulaessigeFuehrerscheine) {
			if(fuehrerscheinKlasse==s)
				this.fuehrerscheinKlasse = fuehrerscheinKlasse;
		}		
	}
	
	public String getFuehrerschein() {
		return this.fuehrerscheinKlasse;
	}
	
	public int getId() {
		return super.getId();
	}
	
}
