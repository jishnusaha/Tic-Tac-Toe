import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.*;
public class Start extends JFrame implements ActionListener
{
	JButton play,exit;
	JRadioButton r1,r2;
	
	JLabel title,choise,invalid;
	JPanel panel;
	JRadioButton x,y;
	ButtonGroup bg1;
	
	public Start()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,100,900,800);
		setTitle("Tic Tac Toe");
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title=new JLabel("TiC taC tOe");
		title.setFont(new Font("CASTELLAR",Font.BOLD,50));
		title.setBounds(170,100,500,80);
		panel.add(title);
		
		choise=new JLabel("choose your character : ");
		choise.setFont(new Font("ARIAL",Font.BOLD,15));
		choise.setBounds(180,200,200,30);
		panel.add(choise);
		/*
		String s[]={"O","X"};
		JComboBox c=new JComboBox(s);
		c.setBounds(390,210,50,20);
		panel.add(c);
	    */
		
		r1 = new JRadioButton("X");
		r1.setBounds(390,200,50,30);
		panel.add(r1);
		
		r2 = new JRadioButton("O");
		r2.setBounds(390,245,50,30);
		panel.add(r2);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		invalid=new JLabel("*choose character");
		invalid.setFont(new Font("CARIAL",Font.BOLD,15));
		invalid.setBounds(445,245,300,30);
		invalid.setForeground(Color.RED);
		invalid.setVisible(false);
		panel.add(invalid);
		
		play=new JButton("PLAY");
		play.setBounds(260,300,80,40);
		play.addActionListener(this);
		panel.add(play);
		
		
		exit=new JButton("EXIT");
		exit.setBounds(400,300,80,40);
		exit.addActionListener(this);
		panel.add(exit);

		this.add(panel);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		invalid.setVisible(false);
		if(e.getSource().equals(play))
 		{
			if(r1.isSelected())
			{
				Game game=new Game('X');
				setVisible(false);
				game.setVisible(true);
			}
			else if(r2.isSelected())
			{
				Game game=new Game('O');
				setVisible(false);
				game.setVisible(true);
			}	
			else invalid.setVisible(true);
		}
		else if(e.getSource().equals(exit)) 
		{
			System.exit(0);
		}

	}
	public static void main(String args[])
	{
		Start s=new Start();
		s.setVisible(true);
	}
	
}
			  
			  
		
		
		
		
