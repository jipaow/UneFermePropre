package co.simplpon.uneFermePropre;



public class Souris {
	  private boolean vivant = true;
	  protected static int nombreDeSouris = 1500;
	  private String nom;
	  private double nomDeZone;
	  

	  
	  
	  
	public Souris(boolean vivant, String nom, double nomDeZone) {
		super();
		this.vivant = vivant;
		this.nom = nom;
		this.nomDeZone = nomDeZone;
	}
	public boolean isVivant() {
		return vivant;
	}
	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}
	public static int getNombreDeSouris() {
		return nombreDeSouris;
	}
	public static void setNombreDeSouris(int nombreDeSouris) {
		Souris.nombreDeSouris = nombreDeSouris;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNomDeZone() {
		return nomDeZone;
	}
	public void setNomDeZone(double nomDeZone) {
		this.nomDeZone = nomDeZone;
	}



	 
	 
 
		
	
	
	

	
	
   

}
