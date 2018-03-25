import java.awt.Color;

/**
 * Classe pour la position des objets
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class Position{
	private int x;
	private int y;
	
	/**
	 * Constructeur de la classe Position
	 * 
	 * @param x la nouvelle position x
	 * @param y la nouvelle position y
	 */
	public Position(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	/**
	 * Cette méthode permet de connaître la position x
	 * 
	 * @return la position x 
	 */
	public int getX(){
		return this.x;
	}
	
	/**
	 * Cette méthode permet de connaître la position y
	 * 
	 * @return la position y
	 */
	public int getY(){
		return this.y;
	}
	
	/**
	 * Cette méthode permet de modifier la position x
	 * 
	 * @param valeur la nouvelle position x
	 */
	public void setX(int valeur){
		this.x = valeur;
	}
	
	
	
	/**
	 * Cette méthode permet de modifier la position y
	 * 
	 * @param valeur la nouvelle position y
	 */
	public void setY(int valeur){
		this.y = valeur;
	}
}
