package kfz;

public abstract class Mitarbeiter {

	private int id;
	private String name;
	//private double stundenSatz;
	//private double anzahlStunden;
	
	public Mitarbeiter(int id, String name) {
		setId(id);
		setName(name);
//		setStundenSatz(stundenSatz);
	}
	
	protected void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
//	public void setStundenSatz(double stundenSatz) {
//		this.stundenSatz=stundenSatz;
//	}
//	
	public String toString() {
		return this.getId()+" "+this.name;//+" "+this.stundenSatz;
	}
	
	public abstract double einkommen();


}


