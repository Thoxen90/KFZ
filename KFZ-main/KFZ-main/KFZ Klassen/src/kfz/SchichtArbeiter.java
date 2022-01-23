package kfz;

public class SchichtArbeiter extends Mitarbeiter{

	private double stundenSatz;
	private int anzahlStunden;
	
	public SchichtArbeiter(int id,String name,double stundenSatz) {
		
		super(id,name);
	
	}
	
	public double einkommen() {
		return stundenSatz*anzahlStunden;
	}
	
	
	protected void setID(int id) {
		super.setId(id);
	}
	
	public int getId() {
		return super.getId();
	}
	
	protected void setAnzahlStunden(int std) {
		this.anzahlStunden = std;
	}
	
	public double getStundenSatz() {
		return this.stundenSatz;
	}
	
	
}
	
	
