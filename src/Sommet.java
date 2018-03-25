/**
 * Classe pour représenter l'intersection de portion de route
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class Sommet {
	private char id;
	private Position position;
	
	/**
	 * Constructeur de la classe Sommet
	 * 
	 * @param id le nouveau id du Sommet
	 * @param position la nouvelle position du Sommet
	 */
	public Sommet(char id, Position position) {
		this.id = id; 
		this.position = position;
	}
	/**
	 * Cette méthode permet de connaître le id d'un sommet
	 * 
	 * @return le id d'un sommet 
	 */
	public char getId(){
		return this.id;
	}
	
	/**
	 * Cette méthode permet de connaître la position du sommet
	 * 
	 * @return la position du sommet
	 */
	public Position getPosition(){
		return this.position;
	}
	

	/**
	 * Cette méthode permet de modifier le id du sommet
	 * 
	 * @param valeur le nouveau id du sommet 
	 */
	public void setId(char valeur){
		this.id = valeur;
	}
	
	/**
	 * Cette méthode permet de modifier la position du sommet
	 * 
	 * @param valeur la nouvelle position du sommet
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}
	
}
