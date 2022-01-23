package kfz;

public class GPS {

	private double laengengrad;
	private double breitengrad;
	
	public GPS(double laengengrad,double breitengrad) {
		
	}
	
	public void setLaengenGrad(double laengengrad) {
		this.laengengrad = laengengrad;
	}
	
	public void setBreitenGrad(double breitengrad) {
		this.breitengrad = breitengrad;
	}
	
	public double getLaengenGrad() {
		return this.laengengrad;
	}
	
	public double getBreitenGrad() {
		return this.breitengrad;
	}
	
}
