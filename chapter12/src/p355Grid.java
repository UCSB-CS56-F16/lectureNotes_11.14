import javax.swing.*;
import java.awt.*;

    
/** p355 */

public class p355Grid {
    public static void main (String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	
	JLabel component1 = new JLabel("X");	
	JLabel component2 = new JLabel("_");
	JLabel component3 = new JLabel("X");
	JLabel component4 = new JLabel("_");
	final int numRows = 100;
	final int numCols = 4;
	
	JPanel panel = new JPanel( new GridLayout(0, numCols,30,30) );
	int j=0;
	for (int i=0; i < (numRows*numCols); i++) {
	    JLabel jl = new JLabel("" + j);
	    j++;
	    panel.add(jl);
	}

	JScrollPane jsp= new JScrollPane( panel );

	frame.getContentPane().add(jsp);
	frame.setSize(300,300);
	frame.setVisible(true);
    }
}
