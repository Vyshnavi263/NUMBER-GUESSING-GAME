//Importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//created a Guess class
public class Guess 
{
	//Initializing the components
	JTextField t,t1,t2;
	JLabel l,l1;
	ButtonListener bl;
	int rand = (int)(Math.random()*100);
    int count = 0;
    
    public Guess()
    {
    	//creating a JFrame
    	JFrame f = new JFrame("Guessing Game");
    	f.setLayout(new FlowLayout());
    	f.setBackground(Color.WHITE);
    	
    	//creating a Label
    	JLabel L1 = new JLabel("Enter a number between 1 to 100");
    	L1.setSize(250,20);
    	
    	//creating a TextField to enter a number
    	t = new JTextField(20);
    	t1 = new JTextField(20);
        t1.setEditable(false);
        
        //creating a TextField for stars
        t2 = new JTextField(10);
        
    	//creating Label for displaying count
        l1 = new JLabel();
        
    
    	//creating label to display message
    	JLabel l = new JLabel("Try and Guess again");
    
    	//creating a button for guess
    	JButton b = new JButton("Guess");
    	b.setSize(30,30);
    	bl=new ButtonListener();        
        b.addActionListener(bl);
        
        //adding all components in the frame
        f.add(L1);
        f.add(t);
        f.add(l);
        f.add(b);
        f.add(t1);
        f.add(t2);
        f.add(l1);
        
        //setting a title
        f.setTitle("Gussing my number");
        //setting a size of frame
        f.setLayout(new FlowLayout(FlowLayout.LEFT,50,55));
        f.setSize(530,500);
        f.setVisible(true);
    }
    private class ButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		int num = Integer.parseInt(t.getText());
    		count = count+1;
    		if(num < rand)
    		{
    			t1.setText("Number is too low,try again");
    		}
    		else if(num > rand)
    		{
    			t1.setText("Number is too high,try again");
    		}
    		else
    		{
    			t1.setText("YAHOOO,YOU WIN");
    			if(count==1)
    			{
    				t2.setText("*****");
    				l1.setText("Wowwww! you guessed in single count");
    			}
    			else if(count==2)
    			{
    				t2.setText("****");
    				l1.setText("Hey Hey !! you guessed in 2nd count");
    			}
    			else if(count==3)
    			{
    				t2.setText("***");
    				l1.setText("Hey buddy !! you guessed in 3rd count");
    			}
    			else
    			{
    			    t2.setText("*");
    			    l1.setText("Hey buddy! you guessed in many counts");
    			}
    		}
    		//setting RequestFocus on input text
    		t.requestFocus();
    		t.selectAll();
    	}
    }
        
    public static void main(String[] args)
    {
		new Guess();

	}

}
