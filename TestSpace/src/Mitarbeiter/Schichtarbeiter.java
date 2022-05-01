package Mitarbeiter;

public class Schichtarbeiter extends Mitarbeiter {

	private double stundenSatz;
	private int anzahlStunden;

	public Schichtarbeiter(int id, String name, double stundenSatz) throws Exception {

		super(id, name);
		setStundenSatz(stundenSatz);

	}

	public double einkommen() {
		return stundenSatz * anzahlStunden;
	}

	protected void setID(int id) throws Exception {
		if (id >= 3000 && id <= 3999)
			super.setId(id);
		else
			throw new Exception("Schichtarbeiter IDs müssen positiv und vierstellig sein und mit einer 3 beginnen");
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
	
	public int getAnzahlStunden() {
		return this.anzahlStunden;
	}
	
	public void setStundenSatz(double stundenSatz) {
		this.stundenSatz = stundenSatz;
	}
	
	public void arbeite(int anzahlStunden) {
		setAnzahlStunden(getAnzahlStunden()+anzahlStunden);
	}

	
	public String toString() {
		return getId()+": "+getName()+" "+einkommen();
	}

	@Override
	public int compareTo(Mitarbeiter o) {
		return this.getName().length()-o.getName().length();
	}
}
