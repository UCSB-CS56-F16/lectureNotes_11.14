import javax.swing.*;
import java.awt.event.*;

/** originally SimpleGui1B */

public class p360b  {

    JButton button;
    public static void main (String[] args) {
		p360b gui = new p360b();
		gui.go();
    }
    public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button
			.addActionListener
			(
			 (e) -> {
				 System.out.println("You clicked!");
				 button.setText("oooh functional"+e.toString());
				 System.out.println("I love you!");
			 }
			  /*
			 new ActionListener() {
				 public void actionPerformed(ActionEvent event) {
					 button.setText("Anonymous class");
				 }
			 }*/

			 );
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
    }

}
