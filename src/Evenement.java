import java.awt.Color;

/**
 * Classe pour l'�tat de la route
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
	 * Cette m�thode permet de conna�tre le nom d'un �v�nement 
	 * 
	 * @return le nom d'un �v�nement 
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * Cette m�thode permet de conna�tre la position d'un �v�nement
	 * 
	 * @return la position d'un �v�nement 
	 */
	public Position getPotion(){
		return this.position;
	}
	

	/**
	 * Cette m�thode permet de modifier le nom d'un �v�nement
	 * 
	 * @param valeur le nouveau nom d'un �v�nement 
	 */
	public void setNom(String valeur){
		this.nom = valeur;
	}
	
	/**
	 * Cette m�thode permet de modifier la position d'un �v�nement
	 * 
	 * @param valeur la nouvelle position d'un �v�nement
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}

}
