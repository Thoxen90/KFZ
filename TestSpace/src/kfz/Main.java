package kfz;
import java.util.ArrayList;
import java.util.Collections;

import Mitarbeiter.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Fahrer Ralf = new Fahrer(12,"Ralf",12,"C");
//		
//		PTF Bus = new PTF(80,200,new GPS(128.6,19.8),8);
//		
//		System.out.println(Bus.toString());		
//		System.out.println(Ralf.getId());
		
//		----------Mitarbeiter werden angelegt und anschliessend in einer ArrayList gespeichert um diese dann nach
//		----------Namenslänge zu sortieren-----------------
		Verwaltung testVerwaltung = new Verwaltung();
	
		Schichtarbeiter testSchicht = new Schichtarbeiter(2000,"Ralf",15);
		Manager testManager = new Manager(5000,"Jörg",3500,5);
		Schichtarbeiter testSchicht2 = new Schichtarbeiter(2001,"Peter",16);
		BueroArbeiter testBuero = new BueroArbeiter(5001,"Harald",3100);
		BueroArbeiter testBuero2 = new BueroArbeiter(5002,"Karl",3150);
		Schichtarbeiter testSchicht3 = new Schichtarbeiter(2002,"Paul",15.50);
		
		testVerwaltung.add(testSchicht);
		testVerwaltung.add(testManager);
		testVerwaltung.add(testSchicht2);
		testVerwaltung.add(testBuero);
		testVerwaltung.add(testBuero2);
		testVerwaltung.add(testSchicht3);
		
//		unsortierte Ausgabe der PersonalListe
		System.out.println("\nUnsortierte PersonalListe\n--------------------------\n");
		for(Mitarbeiter m : testVerwaltung.getPersonalList()) {
			System.out.println(m.getName());
		}	
		
// 		sortierte Ausgabe der PersonalListe		
		Collections.sort(testVerwaltung.getPersonalList());
		System.out.println("\nSortierte PersonalListe\n---------------");
		for(Mitarbeiter m : testVerwaltung.getPersonalList()) {
			System.out.println(m.getName());
		}		

//		---------KFZs werden angelegt,in einer ArrayList gespeichert um diese nach Auslastung zu sortieren
		PTF testPTF = new PTF(120,180,new GPS(60,60),6);
		LKW testLKW = new LKW(200,160,new GPS(70,70),200);
		LKW testLKW2 = new LKW(190,160,new GPS(80,80),200);
		
		testVerwaltung.add(testPTF);
		testVerwaltung.add(testLKW);
		testVerwaltung.add(testLKW2);
		
		Fahrer testFahrer = new Fahrer(1305,"Thomas",12,"B");
		testPTF.einsteigen(testBuero2);
		testPTF.einsteigenFahrer(testFahrer);
		testPTF.einsteigen(testSchicht);
		testPTF.einsteigen(testBuero);
		
//		Unsortierte Ausgabe der FuhrparkListe
		System.out.println("\nUnsortierte FuhrparkListe\n---------------------------\n");
		for(KFZ k : testVerwaltung.getFuhrpark()) {
			System.out.println(k.toString()+" Auslastung: "+k.auslastung());
		}
		
		System.out.println("\nPassagierListe:\n");
		
		for(Mitarbeiter m : testPTF.getPassagiere()) {
			if(m!=null)
			System.out.println(m.getName());
		}
		
		
		
		
		
//		System.out.println("\nNeu sortierte Mitarbeiterliste: \n_____________________________________\n");
//		Collections.sort(MitarbeiterListe);
//		
//		for(Mitarbeiter m : MitarbeiterListe) {
//			System.out.println(m.getName());
//		}
//		
////		Abteilung wird angelegt um dies später nach einkommen zu sortieren
//		Abteilung testAbteilung = new Abteilung("\nTolle Abteilung",testManager);
//		testAbteilung.add(testSchicht);
//		testAbteilung.add(testBuero);
//		testAbteilung.add(testSchicht2);
//		testAbteilung.add(testBuero2);
//		testAbteilung.add(testSchicht3);
//		
//		testSchicht.arbeite(200);
//		testSchicht2.arbeite(240);
//		testSchicht3.arbeite(320);		
//		
//		System.out.println(testAbteilung.gehaltsliste());
//		
////		Fahrzeuge sollen nach Auslastung sortiert werden
//		
//		Verwaltung testVerwaltung = new Verwaltung();
		
		

	}

}
