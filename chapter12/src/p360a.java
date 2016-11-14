import javax.swing.*;
import java.awt.event.*;

/** originally SimpleGui1B */

public class p360a {
    JButton button;
    public static void main (String[] args) {
		p360a gui = new p360a();
		gui.go();
    }
    public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button
			.addActionListener
			(
			 // (e) ->  
			 // button.setText("oooh functional"+e.toString());
			 new ActionListener() {
				 public void actionPerformed(ActionEvent event) {
					 button.setText("Anonymous class");
				 }
			 }
			 );
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
    }

}
