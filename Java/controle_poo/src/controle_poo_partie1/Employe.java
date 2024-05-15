package controle_poo_partie1;

public class Employe extends Personne {
	
	public String poste;
	public double salaire;
	

	public Employe(String nom, String prenom, int id,String poste,double salaire) {
		super(nom, prenom, id);
		// TODO Auto-generated constructor stub
		this.poste = poste;
		this.salaire = salaire;
	}
	
	// get 
	
	public Double getSalaire(String salaire) {
		return this.salaire;
	}
	
	public String getPoste(String poste) {
		return this.poste;
	}

	//set 
	
	public Double setSalaire(Double salaire) {
		return this.salaire = salaire ;
	}
	
	public String setPoste(String poste) {
		return this.poste = poste;
	}
	
	
	
	public void afficherDetails () {
		
		System.out.println("nom employée:"+ this.nom );
		System.out.println("prenom employée:"+ this.prenom );
		System.out.println("id employée:"+ this.id );
		System.out.println("poste employée:"+ this.poste );
		System.out.println("salaire employée:"+ this.salaire );
	}
}

