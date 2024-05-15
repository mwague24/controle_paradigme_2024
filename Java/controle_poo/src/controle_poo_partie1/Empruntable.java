package controle_poo_partie1;

public interface Empruntable {
	
	public Livre emprunter (String titre,String auteur,String isbn,boolean disponible);
	
	public Livre retourner ( String titre,String auteur,String isbn,boolean disponible);

}
