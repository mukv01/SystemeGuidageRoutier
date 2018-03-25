import java.awt.Color;

/**
 * Classe pour le véhicule
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class Vehicule {
	//Attributs
	private Color couleur;
	private Position position;
	
	/**
	 * Constructeur de la classe Vehicule
	 * 
	 * @param couleur la nouvelle couleur du véhicule
	 * @param position la nouvelle position du véhicule
	 */
	public Vehicule(Color couleur, Position position ) {
		this.couleur = couleur; 
		this.position = position;
	}
	
	/**
	 * Cette méthode permet de connaître la couleur du véhicule
	 * 
	 * @return la couleur du véhicule
	 */
	public Color getCouleur(){
		return this.couleur;
	}
	
	
	/**
	 * Cette méthode permet de connaître la position du véhicule
	 * 
	 * @return la position du véhicule
	 */
	public Position getPosition(){
		return this.position;
	}
	
	/**
	 * Cette méthode permet de modifier la couleur du véhicule
	 * 
	 * @param valeur la nouvelle couleur du véhicule
	 */
	public void setCouleur(Color valeur){
		this.couleur = valeur;
	}
	

	/**
	 * Cette méthode permet de modifier la position du véhicule
	 * 
	 * @param valeur la nouvelle position du véhicule
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}
}


