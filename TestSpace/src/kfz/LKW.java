package kfz;

import Mitarbeiter.Fahrer;

public class LKW extends KFZ {

	private double ladeFlaeche;
	private double ladung;

	public LKW(double tankGroesse, double maxSpeed, GPS aktuellePosition, double ladeFlaeche) throws Exception {
		super(tankGroesse, maxSpeed, aktuellePosition);
	}

	public void beladen(double menge) {
		if (ladung + menge <= ladeFlaeche)
			ladung += menge;
		else
			ladung = ladeFlaeche;
	}

	public void entladen(double menge) {
		if (ladung - menge >= 0)
			ladung -= menge;
		else
			ladung = 0;
	}

	public boolean einsteigenFahrer(Fahrer fahrer) {
		if (fahrer.getFuehrerschein() == "M") {
			super.einsteigenFahrer(fahrer);
			return true;
		} else
			return false;
	}

	public double auslastung() {
		if (ladung != 0)
			return ladung / ladeFlaeche;
		else
			return 0;
	}

	@Override
	public int compareTo(KFZ o) {
		return (int) (this.auslastung() - o.auslastung());
	}

}
