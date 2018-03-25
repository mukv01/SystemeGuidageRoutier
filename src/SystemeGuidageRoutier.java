import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe principale
 * 
 * @author Marine Cordani, Mouna Slimen, Vestine Mukeshimana
 *
 */

public class SystemeGuidageRoutier extends JFrame {
	private ImageIcon icon;
	private ReseauRoutier reseauRoutier;
	
	private JLabel lblNbrVehicules = new JLabel("Le nombre de véhicules");
	private JTextField txtNbrVehicules = new JTextField();
	/**
	 * Constructeur
	 */
	public SystemeGuidageRoutier() {
		//Mettre le titre de la fenêtre
		super("Système de Guidage de Routes dans un Réseau");
		setResizable(false);
		
		icon = new ImageIcon("res/icon.png");
		
		reseauRoutier = new ReseauRoutier();
		reseauRoutier.setBounds(10, 20, 614, 290);

		int widthJFrame = 640;
		int heightJFrame = 480;
		this.setSize(widthJFrame, heightJFrame);
		
		//Placer JPanel au milieu de JFrame
		int xJFrame = this.getX();
		int yJFrame = this.getY();
		
		int widthJPanel = widthJFrame - 60;
		int heightJPanel = widthJPanel * 3/4;
		heightJPanel = heightJFrame - 120;
		int xJPanel = 20;
		int yJPanel = 20;
		getContentPane().setLayout(null);
		reseauRoutier.setLayout(null);
		getContentPane().add(reseauRoutier);
		
		
		lblNbrVehicules.setBounds(10, 343, 151, 14);
		getContentPane().add(lblNbrVehicules);
		
		txtNbrVehicules.setText("5");
		txtNbrVehicules.setBounds(171, 340, 38, 20);
		getContentPane().add(txtNbrVehicules);
		txtNbrVehicules.setColumns(10);
		
		this.setIconImage(icon.getImage());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		//Création d'une fenêtre
		SystemeGuidageRoutier monSysteme = new SystemeGuidageRoutier();
		

	}
}
