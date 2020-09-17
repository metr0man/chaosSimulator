package chaosSimulator;

import java.awt.Dimension;
import javax.swing.JFrame;
 
public class Main extends JFrame{
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final Dimension screensize = new Dimension(WIDTH,HEIGHT);
		
	public Main() {
		//creates a the DisplayPanel
		DisplayPanel dp = new DisplayPanel();
		
		//creates the JFrame with these parameters
		this.setTitle("This is magnets");
		this.setSize(screensize);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		//adds the JPanel(Display Panel)
		this.add(dp);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new Main();
	}
}
