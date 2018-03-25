import java.awt.Color;

/**
 * Classe pour l'état de la route
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class Evenement {
	private String nom;
	private Position position;
	
	/**
	 * Constructeur de la classe Evenement
	 * 
	 * @param nom le nouveau nom d'un Evenement
	 * @param position la nouvelle position d'un Evenement
	 */
	public Evenement(String nom, Position position) {
		this.nom = nom; 
		this.position = position;
	}
	
	/**
	 * Cette méthode permet de connaître le nom d'un événement 
	 * 
	 * @return le nom d'un événement 
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * Cette méthode permet de connaître la position d'un événement
	 * 
	 * @return la position d'un événement 
	 */
	public Position getPotion(){
		return this.position;
	}
	

	/**
	 * Cette méthode permet de modifier le nom d'un événement
	 * 
	 * @param valeur le nouveau nom d'un événement 
	 */
	public void setNom(String valeur){
		this.nom = valeur;
	}
	
	/**
	 * Cette méthode permet de modifier la position d'un événement
	 * 
	 * @param valeur la nouvelle position d'un événement
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}

}
