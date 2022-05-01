package kfz;

import Mitarbeiter.Fahrer;
import Mitarbeiter.Mitarbeiter;

public class PTF extends KFZ {

	private int sitze;
	private Mitarbeiter[] passagiere;

	public PTF(double tankGroesse, double maxSpeed, GPS aktuellePosition, int sitze) throws Exception {
		super(tankGroesse, maxSpeed, aktuellePosition);		
		setSitze(sitze);
		passagiere=new Mitarbeiter[sitze];
	}

	public double auslastung() {
		double tempCounter = 0;	
			for (Mitarbeiter m : passagiere) {
				if(m!=null)
					tempCounter += 1;
			}
			System.out.println("tempCounter: "+tempCounter);
		
			return (sitze / tempCounter);
	
	}

	public void setSitze(int sitze) {
		this.sitze = sitze;
	}

	public boolean einsteigen(Mitarbeiter passagier) {
		if (passagiere == null)
			passagiere[0] = passagier;

		for (int i = 0; i < sitze; i++) {
			if (passagiere[i] == null) {
				passagiere[i] = passagier;
				return true;
			}
		}

		return false;

	}

	public boolean einsteigenFahrer(Fahrer fahrer) {
		if (fahrer.getFuehrerschein().equals( "B" )|| fahrer.getFuehrerschein().equals("D")){
			if (passagiere == null) {
				passagiere[0] = fahrer;
			}
			for (int i = 0; i < sitze; i++) {
				if (passagiere[i] == null) {
					passagiere[i] = fahrer;
					return true;
				}
			}
		}
		return false;
	}

	public Mitarbeiter aussteigen(int vonSitzplatz) {
		Mitarbeiter tempMitarbeiter = passagiere[vonSitzplatz];
		passagiere[vonSitzplatz] = null;
		return tempMitarbeiter;
	}

	public void parken() {
		for (int i = 0; i < passagiere.length; i++)
			passagiere[i] = null;
		super.setMotorAn(false);
	}

	public int compareTo(KFZ o) {
		return (int) (this.auslastung() - o.auslastung());
	}

	public Mitarbeiter[] getPassagiere() {
		return passagiere;
	}

}
