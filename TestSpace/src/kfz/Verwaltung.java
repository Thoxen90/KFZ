package kfz;

import java.util.ArrayList;
import Mitarbeiter.*;

public class Verwaltung {

	private ArrayList<KFZ> fuhrpark = new ArrayList<KFZ>();
	private ArrayList<Mitarbeiter> personal = new ArrayList<Mitarbeiter>();
	private ArrayList<Schichtarbeiter> malocher = new ArrayList<Schichtarbeiter>();
	private ArrayList<Abteilung> abteilungen = new ArrayList<Abteilung>();

	public Verwaltung() {

	}

	public void add(KFZ neues) {
		fuhrpark.add(neues);
	}

	public void remove(KFZ altes) {
		fuhrpark.remove(altes);
	}

	public ArrayList<KFZ> getFuhrpark() {
		return this.fuhrpark;
	}

	public void add(Mitarbeiter neuen) {
		personal.add(neuen);
	}

	public void remove(Mitarbeiter welcher) {
		personal.remove(welcher);
	}

	public ArrayList<Mitarbeiter> getPersonalList() {
		return this.personal;
	}

	public void add(Schichtarbeiter neuen) {
		malocher.add(neuen);
		personal.add(neuen);
	}

	public void remove(Schichtarbeiter welcher) {
		malocher.remove(welcher);
		personal.remove(welcher);
	}

	public void add(Abteilung neue) {
		abteilungen.add(neue);
	}

	public void remove(Abteilung welche) {
		abteilungen.remove(welche);
	}

	public void arbeitsTag() {
		for (Schichtarbeiter sa : malocher) {
			sa.arbeite(8);
		}
	}
}
