package Mitarbeiter;

public abstract class Mitarbeiter implements Comparable<Mitarbeiter>{

	private int id;
	private String name;
	
	public Mitarbeiter(int id, String name) throws Exception {
		setId(id);
		setName(name);
//		setStundenSatz(stundenSatz);
	}
	
	protected void setId(int id) throws Exception {
		if(id>=1000&&id<=9999)
		this.id=id;
		else throw new Exception("ID muss positiv und vierstellig sein");
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
	
	public String toString() {
		return this.getId()+" "+this.name;
	}
	
	public abstract double einkommen();


}


