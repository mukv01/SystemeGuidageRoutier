/**
 * Classe pour repr�senter l'intersection de portion de route
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
	 * Cette m�thode permet de conna�tre le id d'un sommet
	 * 
	 * @return le id d'un sommet 
	 */
	public char getId(){
		return this.id;
	}
	
	/**
	 * Cette m�thode permet de conna�tre la position du sommet
	 * 
	 * @return la position du sommet
	 */
	public Position getPosition(){
		return this.position;
	}
	

	/**
	 * Cette m�thode permet de modifier le id du sommet
	 * 
	 * @param valeur le nouveau id du sommet 
	 */
	public void setId(char valeur){
		this.id = valeur;
	}
	
	/**
	 * Cette m�thode permet de modifier la position du sommet
	 * 
	 * @param valeur la nouvelle position du sommet
	 */
	public void setPosition(Position valeur){
		this.position = valeur;
	}
	
}
