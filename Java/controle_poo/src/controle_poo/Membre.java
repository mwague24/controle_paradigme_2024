package controle_poo;

public class Membre extends Personne{

	public int dateAdhesion;
	public String statut ;
	
	
	public Membre(String nom, String prenom, int id,int dateAdhesion,String statut) {
		super(nom, prenom, id);
		// TODO Auto-generated constructor stub
		
		this.dateAdhesion = dateAdhesion;
		this.statut = statut;
		
	}
	
	
	
	
	

}
