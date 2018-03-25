import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Classe pour combiner tout ce qui constitue le réseau routier
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */
public class ReseauRoutier extends JPanel {
	public static final int MAX_SOMMETS = 14;
	public static final int MAX_ARETES = 22;
	
	private Sommet[] sommets;
	private Arete[] aretes;
	
	public ReseauRoutier() {
		sommets = new Sommet[MAX_SOMMETS];
		sommets[0] = new Sommet('a', new Position(100, 50));
		sommets[1] = new Sommet('b', new Position(220, 50));
		sommets[2] = new Sommet('c', new Position(340, 50));
		sommets[3] = new Sommet('d', new Position(460, 50));
		sommets[4] = new Sommet('e', new Position(100, 120));
		sommets[5] = new Sommet('f', new Position(220, 120));
		sommets[6] = new Sommet('g', new Position(340, 120));
		sommets[7] = new Sommet('h', new Position(460, 120));
		sommets[8] = new Sommet('i', new Position(100, 190));
		sommets[9] = new Sommet('j', new Position(220, 190));
		sommets[10] = new Sommet('k', new Position(340, 190));
		sommets[11] = new Sommet('l', new Position(460, 190));
		sommets[12] = new Sommet('m', new Position(100, 260));
		sommets[13] = new Sommet('n', new Position(220, 260));
		
		aretes = new Arete[MAX_ARETES];
		aretes[0] = new Arete(sommets[1], sommets[2]);
		aretes[1] = new Arete(sommets[2], sommets[3]);
		aretes[2] = new Arete(sommets[0], sommets[4]);
		aretes[3] = new Arete(sommets[1], sommets[5]);
		aretes[4] = new Arete(sommets[1], sommets[6]);
		aretes[5] = new Arete(sommets[2], sommets[6]);
		aretes[6] = new Arete(sommets[3], sommets[7]);
		aretes[7] = new Arete(sommets[4], sommets[5]);
		aretes[8] = new Arete(sommets[5], sommets[6]);
		aretes[9] = new Arete(sommets[6], sommets[7]);
		aretes[10] = new Arete(sommets[4], sommets[8]);
		aretes[11] = new Arete(sommets[5], sommets[9]);
		aretes[12] = new Arete(sommets[6], sommets[10]);
		aretes[13] = new Arete(sommets[7], sommets[10]);
		aretes[14] = new Arete(sommets[7], sommets[11]);
		aretes[15] = new Arete(sommets[8], sommets[9]);
		aretes[16] = new Arete(sommets[9], sommets[10]);
		aretes[17] = new Arete(sommets[10], sommets[11]);
		aretes[18] = new Arete(sommets[8], sommets[12]);
		aretes[19] = new Arete(sommets[9], sommets[13]);
		aretes[20] = new Arete(sommets[12], sommets[13]);
		aretes[21] = new Arete(sommets[13], sommets[10]);
	}
	
	@Override
    public void paintComponent(Graphics g)
    {
		g.setColor(Color.GRAY);	
		
		int width = this.getWidth();
		int height = this.getHeight();
		g.fillRect(0, 0, width, height);
		
		g.setColor(Color.WHITE);	
		for(int i = 0;i < MAX_SOMMETS;i++) {
			Position p = sommets[i].getPosition();
			char id = sommets[i].getId();
			g.fillOval(p.getX() - 5, p.getY() - 5, 10, 10);
			g.drawString("" + id, p.getX() + 2, p.getY() - 8);
		}
		
		for(int i = 0;i < MAX_ARETES;i++) {
			Sommet a = aretes[i].getA();
			Sommet b = aretes[i].getB();
			
			Position pa = a.getPosition();
			Position pb = b.getPosition();
			g.drawLine(pa.getX(), pa.getY(), pb.getX(), pb.getY());
			
		}
    }

}
