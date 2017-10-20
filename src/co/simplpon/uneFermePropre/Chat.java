package co.simplpon.uneFermePropre;

public class Chat {
	 
	private String nom;
	private int age;
	private int nombreDePrises;
	private Zones zoneAttribue;
	
	
	
	
	public Chat(String nom, int age, int nombreDePrises) {
		super();
		this.nom = nom;
		this.age = age;
		this.nombreDePrises = nombreDePrises;
	}





	public static void Chasser() {
		// nombre de souris à attraper
		
		
	}





	public String getNom() {
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public int getNombreDePrises() {
		return nombreDePrises;
	}





	public void setNombreDePrises(int nombreDePrises) {
		this.nombreDePrises = nombreDePrises;
	}

}
