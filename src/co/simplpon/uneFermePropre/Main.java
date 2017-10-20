package co.simplpon.uneFermePropre;

import java.util.ArrayList;

public class Main {//Fermier
	
	static ArrayList<Souris>listeDeSouris = new ArrayList<Souris>();
	
	
	public static void generationDeSouris() {
		for(int i =1; i<1500; i++) {
		Souris newSouris = new Souris(true,"jerry"+i,Math.round(Math.random()*3+1));
		System.out.println(newSouris.getNomDeZone());
		listeDeSouris.add(newSouris);
		}
		
	}

	public static void main(String[] args) {

		Chat nemo = new Chat("Nemo", 5, 0);
		Chat garfield = new Chat("Garfield", 1, 0);
		Chat fripouille = new Chat("Fripouille", 15, 0);
		Chat princesse = new Chat("Princesse", 2, 0);
		Chat mimine = new Chat ("Mimine", 7, 0);
		
		Zones zoneA = new Zones();
		Zones zoneB = new Zones();
		Zones zoneC = new Zones();
		Zones zoneD = new Zones();
		
		
		
		
		generationDeSouris();
//	    seRepartirDansLesZones();
//		Souris.changerDeZone();
//		
//		Fermier.attribuerLesChatsAuxZones();
//		Fermier.creeOdreDePassageDesChats();
//		
//		Chat.chasserLesSouris();
//		Chat.afficherPalmaresQutidien();
//		Chat.afficherPalmaresFinal();
		
	}
}
	
