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

public class GuiPage404 implements ActionListener
{
	private JFrame frame;		
	private JButton north;
	private JButton east;
	private JButton west;
	private JButton south;
	private JButton center;
	
	/**
		Constructor: crates 5 buttons and assigns them to the BorderLayout	
	*/
	public GuiPage404()
	{
		frame = new JFrame("Page 404 Borderlayout");
		frame. setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE) ;
		north = new JButton("North");
		east = new JButton("East");
		west = new JButton("West");
		south = new JButton("South");
		center = new JButton("Center");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.WEST, west);
		
		frame.setSize(500,500);
		frame.setVisible(true);	
		
		initActionListeners();
	}	
	
	private void initActionListeners()
	{
		north.addActionListener(this);
		north.setActionCommand("north");
		
		south.addActionListener(this);
		south.setActionCommand("south");
		
		center.addActionListener(this);
		center.setActionCommand("center");
		
		west.addActionListener(this);
		west.setActionCommand("west");
		
		east.addActionListener(this);
		east.setActionCommand("east");		
	}	
	
	/**
	 * Method from the ActionlistenerInterface, checks to see if a button pressed. It makes
	 * that button invisible. When another button is pressed the invisible button is made visible and the pressed one is made invisible
	 */
	
	public void actionPerformed(ActionEvent arg) 
	{
		if (arg.getActionCommand().equals("north"))
		{
			north.setVisible(false);
			south.setVisible(true);
			east.setVisible(true);
			west.setVisible(true);
			center.setVisible(true);
		}
		else if (arg.getActionCommand().equals("south"))
		{
			north.setVisible(true);
			south.setVisible(false);
			east.setVisible(true);
			west.setVisible(true);
			center.setVisible(true);
		}
		else if (arg.getActionCommand().equals("center"))
		{
			north.setVisible(true);
			south.setVisible(true);
			east.setVisible(true);
			west.setVisible(true);
			center.setVisible(false);
		}
		else if (arg.getActionCommand().equals("east"))
		{
			north.setVisible(true);
			south.setVisible(true);
			east.setVisible(false);
			west.setVisible(true);
			center.setVisible(true);
		}
		else if (arg.getActionCommand().equals("west"))
		{
			north.setVisible(true);
			south.setVisible(true);
			east.setVisible(true);
			west.setVisible(false);
			center.setVisible(true);
		}		
	}
	
	public static void main (String[] args)
	{
		GuiPage404 gui404 = new GuiPage404();
	}
	
}
