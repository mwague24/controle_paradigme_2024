package controle_poo_partie1;

public class Membre extends Personne{

	public int dateAdhesion;
	public String statut ;
	
	
	public Membre(String nom, String prenom, int id,int dateAdhesion,String statut) {
		super(nom, prenom, id);
		// TODO Auto-generated constructor stub
		
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
		
	}
	
	
	
	
public void afficherDetails() {
		
		System.out.println("nom: " + this.nom);
		System.out.println("Prenom: " + this.prenom);
		System.out.println("Id: " + this.id);
		System.out.println("dateAdhesion: " + this.dateAdhesion);
		System.out.println("statut: " + this.statut);
		
		
	}

}
