package edu.ucsb.cs56.W11.hfj.ch13.vladam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Vladimir Adam And Johan Henkens
 *
 */

public class GuiNoDumbQuestions implements ActionListener
{
	private JFrame frame;		
	
	private JButton button1;	
	private JButton button2;
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	
	/**
		Constructor: crates 2 buttons and assigns them to the null layout	
	*/
	public GuiNoDumbQuestions()
	{
		
		frame = new JFrame("No Dumb Questions Page 412");
		frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
		label1 = new JLabel("The first arguement is the x coordinate of the top left corner of the button ");
		label2 = new JLabel("The second arguement is the y coordinate of the top left corner of the button ");
		label3 = new JLabel("The third argument is the width of the button");
		label4 = new JLabel("The fouth argument is the height of the button");		
		
		button1 = new JButton("200,250,150,20");	
		button2 = new JButton("400,400,150,200");		
			
		frame.setSize(700,700);
		frame.setVisible(true);
		
		frame.setLayout(null);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label3);
		frame.getContentPane().add(label4);
		
		button1.setBounds(200, 250, 150, 20);
		button2.setBounds(400, 400, 150, 200);
		
		// labels added manually
		label1.setBounds(0, 0, 500, 30);
		label2.setBounds(0, 30, 500, 30);
		label3.setBounds(0, 60, 500, 30);
		label4.setBounds(0, 90, 500, 30);			
		
		initActionListeners();
	}	
	
	private void initActionListeners()
	{
		button1.addActionListener(this);
		button1.setActionCommand("north");
		
		button2.addActionListener(this);
		button2.setActionCommand("south");			
	}	
	
	/**
	 * Method from the ActionlistenerInterface, checks to see if a button pressed. It makes
	 * that button invisible. When another button is pressed the invisible button is made visible and the pressed one is made invisible
	 */
	
	public void actionPerformed(ActionEvent arg) 
	{
		if (arg.getActionCommand().equals("north"))
		{
			button1.setVisible(false);
			button2.setVisible(true);			
		}
		else if (arg.getActionCommand().equals("south"))
		{
			button1.setVisible(true);
			button2.setVisible(false);
			
		}
		else if (arg.getActionCommand().equals("center"))
		{
			button1.setVisible(true);
			button2.setVisible(true);			
		}
		else if (arg.getActionCommand().equals("east"))
		{
			button1.setVisible(true);
			button2.setVisible(true);
		}
		else if (arg.getActionCommand().equals("west"))
		{
			button1.setVisible(true);
			button2.setVisible(true);			
		}		
	}
	
	public static void main (String[] args)
	{
		GuiNoDumbQuestions gui404 = new GuiNoDumbQuestions();
	}
	
}
