package controle_poo;

public abstract class Personne {
	
	public String nom ; 
	public String prenom;
	public int id;



	public Personne (String nom,String prenom,int id) {
	
	this.nom = nom;
	this.prenom = prenom;
	this.id= id;
	
	}
// fonction afficherDetails
	
	public void afficherDetails() {
		
	}
	
	// get 
	
	public String getNom(String Nom) {
		return this.nom;
	}
	
	public String getPrenom(String Prenom) {
		return this.prenom;
	}
	
	public int getid(int id) {
		return this.id;
	}
	
	// set 
	
	public String setNom(String nom) {
		return this.nom = nom;
	
	}
	public String setPrenom(String Prenom) {
		return this.prenom = Prenom;
	
	}
	
	public int setId(int Id) {
		return this.id = Id;
	
	}
	
	}