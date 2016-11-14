
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/* orig: TwoButtons */

public class p379AnonAndLambda {
    JFrame frame;
    JLabel label;
    public static void main (String[] args) {
		p379AnonAndLambda gui = new p379AnonAndLambda ();
		gui.go();
    }
    public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener
			(
			 new ActionListener() { 
				 public void actionPerformed(ActionEvent event) {
					 label.setText("Ouch!");
					 
				 }
			 }
			 );
		JButton colorButton = new JButton("Change Circle");
		colorButton.addActionListener((e) -> frame.repaint());
		label = new JLabel("I’m a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300,300);
		frame.setVisible(true);
    }
	
    /** From p. 371 and p. 367 */
    
    public class MyDrawPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			Color startColor = new Color(red, green, blue);
			red = (int) (Math.random() * 256);
			green = (int) (Math.random() * 256);
			blue = (int) (Math.random() * 256);
			Color endColor = new Color(red, green, blue);
			GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
			g2d.setPaint(gradient);
			g2d.fillOval(70,70,100,100);
		}
		
    }
	
}
