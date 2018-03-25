
/**
 * Classe pour repr�senter une portion de route 
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
	 * @param a le nouveau sommet a de l'ar�te
	 * @param b le nouveau sommet b de l'ar�te
	 */
	public Arete(Sommet a, Sommet b) {
		this.a = a; 
		this.b = b;
	}
	
	/**
	 * Cette m�thode permet de conna�tre le sommet a de l'ar�te
	 * 
	 * @return le sommet a de l'ar�te
	 */
	public Sommet getA(){
		return this.a;
	}
	
	/**
	 * Cette m�thode permet de conna�tre le sommet b de l'ar�te
	 * 
	 * @return le sommet b de l'ar�te
	 */
	public Sommet getB(){
		return this.b;
	}
	
	/**
	 * Cette m�thode permet de modifier le sommet a de l'ar�te
	 * 
	 * @param valeur le nouveau sommet a de l'ar�te
	 */
	public void setA(Sommet valeur){
		this.a = valeur;
	}
	
	/**
	 * Cette m�thode permet de modifier le sommet b de l'ar�te
	 * 
	 * @param valeur le nouveau sommet b de l'ar�te
	 */
	public void setB(Sommet valeur){
		this.b = valeur;
	}

}
