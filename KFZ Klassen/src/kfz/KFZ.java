package kfz;

public class KFZ {

	private double tankGroesse;
	private double tankInhalt;
	private Fahrer fahrer;
	private boolean motorAn;
	private GPS aktuellePosition;
	private double maxSpeed;

	public KFZ(double tankGroesse, double maxSpeed, GPS aktuellePosition) {
		setTankGroesse(tankGroesse);
		setMaxSpeed(maxSpeed);
		setAktuellePosition(aktuellePosition);
	}

	public void fahrenZu(GPS ziel) {
		setAktuellePosition(ziel);
	}

	public void parken() {
		aussteigen();
	}

	public double tanken(double liter) {
		double Überfluss;

		Überfluss = tankInhalt - tankGroesse + liter;
		if (Überfluss >= 0)
			setTankInhalt(tankGroesse);
			return Überfluss;
		else
			setTankInhalt(tankInhalt+liter);
			return 0;
	}
	
	public boolean einsteigenFahrer(Fahrer fahrer) {
		
		if(fahrer.getFuehrerschein()=="") {
			setFahrer(fahrer);
			return true;
		}else {
			return false;
		}
	}
	
	public void setAktuellePosition(GPS position) {
		this.aktuellePosition = position;
	}
	
	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}

	
	public Mitarbeiter aussteigen() {
		return fahrer;
	}
}
