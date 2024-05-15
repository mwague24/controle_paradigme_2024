package controle_poo_partie1;

public class Livre {
	public String titre;
	public String auteur;
	public String isbn;
	public boolean disponible ; 
	
	public Livre (String titre,String auteur,String isbn,boolean disponible) {
		this.titre = titre ;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;
		
	}

	//get 
	
	public String getTitre(String titre) {
		return this.titre;
	}
	
	public String getAuteur(String auteur) {
		return this.auteur;
	}
	
	public String getIsbn(String isbn) {
		return this.isbn;
	}
	
	public boolean getDisponible(String disponible) {
		return this.disponible;
	}
	
	
	// set 
	
	public String setTitre(String titre) {
		return this.titre = titre;
	
	}
	
	public String setAuteur(String auteur) {
		return this.auteur = auteur;
	
	}
	

	public String setIsbn(String isbn) {
		return this.isbn = isbn;
	
	}
	
	public boolean setDisponible(boolean disponible) {
		return this.disponible = disponible;
	
	}
	
	// méthode afficherDetails
	
	public void AfficheDetails() {
		
		System.out.println("titre du livre " + this.titre);
		System.out.println("l'auteur est : "+ this.auteur);
		System.out.println("L'isbn est :" + this.isbn);
		System.out.println("le est disponible: "+ this.disponible);
	}
	
}
