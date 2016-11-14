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

public class GuiPage408 implements ActionListener
{
	private JFrame frame;		
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	private JButton reset;
	
	
	private JPanel panel;
	
	/**
		Constructor: crates 5 buttons and assigns them to the FlowLayout	
	*/
	public GuiPage408()
	{
		frame = new JFrame("Page 408, FlowLayout");
		frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
		panel = new JPanel();
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		reset = new JButton("Reset");
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);		
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,reset);
		
		frame.setSize(300,500);
		frame.setVisible(true);	
		
		initActionListeners();
	}	
	
	private void initActionListeners()
	{
		button1.addActionListener(this);
		button1.setActionCommand("1");
		
		button2.addActionListener(this);
		button2.setActionCommand("2");	
		
		button3.addActionListener(this);
		button3.setActionCommand("3");
		
		button4.addActionListener(this);
		button4.setActionCommand("4");
		
		button5.addActionListener(this);
		button5.setActionCommand("5");
		
		reset.addActionListener(this);
		reset.setActionCommand("reset");
		
	
		
		
	}	
	
	/**
	 * Method from the ActionlistenerInterface, checks to see if a button pressed. It makes
	 * that button invisible. When another button is pressed the invisible button is made visible and the pressed one is made invisible
	 */
	
	public void actionPerformed(ActionEvent arg) 
	{
		if (arg.getActionCommand().equals("1"))
		{
			button1.setVisible(false);			
		}
		else if (arg.getActionCommand().equals("2"))
		{
			button2.setVisible(false);
					}
		else if (arg.getActionCommand().equals("3"))
		{			
			button3.setVisible(false);			
		}
		else if (arg.getActionCommand().equals("4"))
		{
			button4.setVisible(false);
		}
		else if (arg.getActionCommand().equals("5"))
		{
			button5.setVisible(false);
		}	
		else if (arg.getActionCommand().equals("reset"))
		{
			button1.setVisible(true);
			button2.setVisible(true);
			button3.setVisible(true);
			button4.setVisible(true);
			button5.setVisible(true);
		}	
	}
	
	public static void main (String[] args)
	{
		GuiPage408 gui404 = new GuiPage408();
	}
	
}
