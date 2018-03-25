
/**
 * Classe pour représenter une portion de route 
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class Arete {
	private Sommet a;
	private Sommet b;
	
	/**
	 * Constructeur de la classe Arete
	 * 
	 * @param a le nouveau sommet a de l'arête
	 * @param b le nouveau sommet b de l'arête
	 */
	public Arete(Sommet a, Sommet b) {
		this.a = a; 
		this.b = b;
	}
	
	/**
	 * Cette méthode permet de connaître le sommet a de l'arête
	 * 
	 * @return le sommet a de l'arête
	 */
	public Sommet getA(){
		return this.a;
	}
	
	/**
	 * Cette méthode permet de connaître le sommet b de l'arête
	 * 
	 * @return le sommet b de l'arête
	 */
	public Sommet getB(){
		return this.b;
	}
	
	/**
	 * Cette méthode permet de modifier le sommet a de l'arête
	 * 
	 * @param valeur le nouveau sommet a de l'arête
	 */
	public void setA(Sommet valeur){
		this.a = valeur;
	}
	
	/**
	 * Cette méthode permet de modifier le sommet b de l'arête
	 * 
	 * @param valeur le nouveau sommet b de l'arête
	 */
	public void setB(Sommet valeur){
		this.b = valeur;
	}

}
