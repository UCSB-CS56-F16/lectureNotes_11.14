import javax.swing.*;
import java.awt.event.*;

/** originally SimpleGui1B */

public class p360 implements ActionListener {
    JButton button;
    public static void main (String[] args) {
		p360 gui = new p360();
		gui.go();
    }
    public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
		button.setText("I’ve been clicked!");
    }
}
