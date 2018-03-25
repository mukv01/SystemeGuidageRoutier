import java.awt.Color;

/**
 * Classe pour le v�hicule
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
	 * @param couleur la nouvelle couleur du v�hicule
	 * @param position la nouvelle position du v�hicule
	 */
	public Vehicule(Color couleur, Position position ) {
		this.couleur = couleur; 
		this.position = position;
	}
	
	/**
	 * Cette m�thode permet de conna�tre la couleur du v�hicule
	 * 
	 * @return la couleur du v�hicule
	 */
	public Color getCouleur(){
		return this.couleur;
	}
	
	
	/**
	 * Cette m�thode permet de conna�tre la position du v�hicule
	 * 
	 * @return la position du v�hicule
	 */
	public Position getPosition(){
		return this.position;
	}
	
	/**
	 * Cette m�thode permet de modifier la couleur du v�hicule
	 * 
	 * @param valeur la nouvelle couleur du v�hicule
	 */
	public void setCouleur(Color valeur){
		this.couleur = valeur;
	}
	

	/**
	 * Cette m�thode permet de modifier la position du v�hicule
	 * 
	 * @param valeur la nouvelle position du v�hicule
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}
}


