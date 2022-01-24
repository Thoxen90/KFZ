package kfz;

import java.util.ArrayList;

public class PTF extends KFZ {

	private ArrayList<Mitarbeiter> passagiere = new ArrayList<Mitarbeiter>();
	private int sitze;

	public PTF(double tankGroesse, double maxSpeed, GPS aktuellePosition, int sitze) throws Exception {
		super(tankGroesse, maxSpeed, aktuellePosition);
	}

	public double auslastung() {
		double test = 0;
		return test;
	}

	public void setSitze(int sitze) {
		this.sitze = sitze;
	}

	public boolean einsteigen(Mitarbeiter passagier) {
		if (this.passagiere.size() < sitze) {
			this.passagiere.add(passagier);
			return true;
		} else {
			return false;
		}
	}

	public boolean einsteigenFahrer(Fahrer fahrer) {

		if (fahrer.getFuehrerschein() != "")
			return true;
		else
			return false;
	}

}

