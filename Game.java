import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.*;
public class Game extends JFrame implements ActionListener
{
	Random random=new Random();
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,restart,exit;
	JLabel win,loss,draw,w,l;
	JRadioButton r1,r2;
	JComboBox combo;
	JPanel panel;
	char playerchar,systemchar;
	int winpositon[][]={{0,2},{3,5},{6,8},{0,6},{1,7},{2,8},{0,8},{2,6}};
	char buttonchar[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
	int winvalue=0,lossvalue=0;
	public Game(char cc)
	{
		
		if(cc=='O') 
		{
			playerchar='O';
			systemchar='X';
		}
		else 
		{
			playerchar='X';
			systemchar='O';
		}
		
		//playerchar='O';
		//systemchar='X';
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,100,900,800);
		setTitle("Tic Tac Toe");
		
		panel = new JPanel();
		panel.setLayout(null);
	    
		win=new JLabel("YOU WIN");
		win.setFont(new Font("CASTELLAR",Font.BOLD,50));
		win.setForeground(Color.GREEN);
		win.setBounds(550,150,300,80);
		win.setVisible(false);
		panel.add(win);
		
		loss=new JLabel("YOU LOSE");
		loss.setFont(new Font("CASTELLAR",Font.BOLD,50));
		loss.setForeground(Color.RED);
		loss.setBounds(550,150,300,80);
		loss.setVisible(false);
		panel.add(loss);
		
		draw=new JLabel("DRAW");
		draw.setFont(new Font("CASTELLAR",Font.BOLD,50));
		draw.setForeground(Color.YELLOW);
		draw.setBounds(550,150,300,80);
		draw.setVisible(false);
		panel.add(draw);
		
		w=new JLabel("WIN : 0");
		w.setFont(new Font("CASTELLAR",Font.BOLD,50));
		w.setForeground(Color.BLACK);
		w.setBounds(550,250,300,80);
		panel.add(w);
		
		l=new JLabel("LOSS : 0");
		l.setFont(new Font("CASTELLAR",Font.BOLD,50));
		l.setForeground(Color.BLACK);
		l.setBounds(550,340,300,80);
		panel.add(l);
		
		
		b0=new JButton();
		b0.setBounds(200,100,100,100);
		b0.addActionListener(this);
		b0.setFont(new Font("ARIAL",Font.BOLD,40));
		panel.add(b0);
		
		b1=new JButton();
		b1.setBounds(300,100,100,100);
		b1.setFont(new Font("ARIAL",Font.BOLD,40));
		b1.addActionListener(this);
		panel.add(b1);
		
		b2=new JButton();
		b2.setBounds(400,100,100,100);
		b2.setFont(new Font("ARIAL",Font.BOLD,40));
		b2.addActionListener(this);
		panel.add(b2);
		
		b3=new JButton();
		b3.setBounds(200,200,100,100);
		b3.setFont(new Font("ARIAL",Font.BOLD,40));
		b3.addActionListener(this);
		panel.add(b3);
		
		b4=new JButton();
		b4.setBounds(300,200,100,100);
		b4.setFont(new Font("ARIAL",Font.BOLD,40));
		b4.addActionListener(this);
		panel.add(b4);
		
		b5=new JButton();
		b5.setBounds(400,200,100,100);
		b5.setFont(new Font("ARIAL",Font.BOLD,40));
		b5.addActionListener(this);
		panel.add(b5);
		
		b6=new JButton();
		b6.setBounds(200,300,100,100);
		b6.setFont(new Font("ARIAL",Font.BOLD,40));
		b6.addActionListener(this);
		panel.add(b6);
		
		b7=new JButton();
		b7.setBounds(300,300,100,100);
		b7.setFont(new Font("ARIAL",Font.BOLD,40));
		b7.addActionListener(this);
		panel.add(b7);
		
		b8=new JButton();
		b8.setBounds(400,300,100,100);
		b8.setFont(new Font("ARIAL",Font.BOLD,40));
		b8.addActionListener(this);
		panel.add(b8);
		
		restart=new JButton();
		restart.setBounds(200,500,100,50);
		restart.addActionListener(this);
		restart.setText("RESTART");
		panel.add(restart);
		
		exit=new JButton();
		exit.setBounds(400,500,100,50);
		exit.addActionListener(this);
		exit.setText("EXIT");
		panel.add(exit);
		
		
		updateButton();
		
		
		this.add(panel);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource().equals(b0))
 		{
			if(b0.getText().equals(" "))
			{
				System.out.println("b0 clicked");
				clicked(b0,0);
				
				
			}
		}
		else if(e.getSource().equals(b1))
 		{
			if(b1.getText().equals(" "))
			{
				System.out.println("b1 clicked");
				clicked(b1,1);
			}
			
		}
		else if(e.getSource().equals(b2))
 		{
			if(b2.getText().equals(" "))
			{
				System.out.println("b2 clicked");
				clicked(b2,2);
			}
		}
		else if(e.getSource().equals(b3))
 		{
			if(b3.getText().equals(" "))
			{
				System.out.println("b3 clicked");
				clicked(b3,3);
			}
		}
		else if(e.getSource().equals(b4))
 		{ 
			if(b4.getText().equals(" "))
			{
				System.out.println("b4 clicked");
				clicked(b4,4);
			}
		}
		else if(e.getSource().equals(b5))
 		{
			if(b5.getText().equals(" "))
			{
				System.out.println("b5 clicked");
				clicked(b5,5);
			}
		}
		else if(e.getSource().equals(b6))
 		{
			if(b6.getText().equals(" "))
			{
				System.out.println("b6 clicked");
				clicked(b6,6);
			}
		}
		else if(e.getSource().equals(b7))
 		{
			if(b7.getText().equals(" "))
			{
				System.out.println("b7 clicked");
				clicked(b7,7);
			}
		}
		else if(e.getSource().equals(b8))
 		{
			if(b8.getText().equals(" "))
			{
				System.out.println("b8 clicked");
				clicked(b8,8);
			}
		}
		else if(e.getSource().equals(restart))
 		{
			win.setVisible(false);
			loss.setVisible(false);
			draw.setVisible(false);
			for(int i=0;i<9;i++) buttonchar[i]=' ';
			updateButton();
			buttonEnable();
		}
		else if(e.getSource().equals(exit))
 		{
			System.exit(0);
		}
		

	}
	public void clicked(JButton bclicked,int p)
	{
		bclicked.setText(Character.toString(playerchar));
		buttonchar[p]=playerchar;
				
		if( checkwin(playerchar))
		{
			winvalue++;
			updateWinLoss();
			win.setVisible(true);
			buttonDisable();
			//System.out.println("win");		
		}
		else if(checkdraw())
		{
			draw.setVisible(true);
			buttonDisable();
			//here disable button not done yet
			//show draw massage
			System.out.println("draw");	
					
		}
		else 
		{
					
			SystemInput();
			updateButton();
			if( checkwin(systemchar))
			{
				lossvalue++;
				loss.setVisible(true);
				updateWinLoss();
				buttonDisable();
				//here disable button not done yet
				//show win massage
				System.out.println("win");	
			}
			else if(checkdraw())
			{
				draw.setVisible(true);
				buttonDisable();
				updateWinLoss();
				//here disable button not done yet
				//show draw massage
				System.out.println("draw");		
				
			}
		}
	}
	public boolean checkwin(char check)
	{
		for (int i=0; i<8; i++)
		{
			if( buttonchar[winpositon[i][0]]==check && buttonchar[winpositon[i][1]]==check && buttonchar[(winpositon[i][0]+winpositon[i][1])/2]==check) return true;
			
		}
		return false;	
	}
	public boolean checkdraw()
	{
		for (int i=0; i<9; i++)
		{
			if(buttonchar[i]==' ') return false;				
		}
		return true;
	}
	public void SystemInput()
	{
		
		int best=findbestinput(systemchar);  
		if (best<0) best=findbestinput(playerchar); 
		if (best<0) 
		{
			best=random.nextInt(9);
			while (buttonchar[best]!=' ')
			{
				best=random.nextInt(9);
			}
		}
		buttonchar[best]=systemchar;
	}
	public int findbestinput(char check)
	{
		for (int i=0; i<8; i++)
		{
			int a=winpositon[i][0];
			int b=winpositon[i][1];
			int c=(a+b)/2;  
			if(buttonchar[a]==check && buttonchar[b]==check && buttonchar[c]==' ') return c;
			if(buttonchar[a]==check && buttonchar[c]==check && buttonchar[b]==' ') return b;
			if (buttonchar[b]==check && buttonchar[c]==check && buttonchar[a]==' ') return a;
		
		}
		return -1;
    }
	public void updateButton()
	{
		b0.setText(Character.toString(buttonchar[0]));
		b1.setText(Character.toString(buttonchar[1]));
		b2.setText(Character.toString(buttonchar[2]));
		b3.setText(Character.toString(buttonchar[3]));
		b4.setText(Character.toString(buttonchar[4]));
		b5.setText(Character.toString(buttonchar[5]));
		b6.setText(Character.toString(buttonchar[6]));
		b7.setText(Character.toString(buttonchar[7]));
		b8.setText(Character.toString(buttonchar[8]));
		
		
	}
	public void buttonDisable()
	{
		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		
	}
	public void buttonEnable()
	{
		b0.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		
	}
	public void updateWinLoss()
	{
		w.setText("WIN : "+Integer.toString(winvalue));
		l.setText("LOSS : "+Integer.toString(lossvalue));
	}
}

			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		
		
		
		
