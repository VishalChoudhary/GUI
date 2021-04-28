import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Panels {
	
	JFrame f;
	JLabel l1;
	Panels(){
		f=new JFrame();
		l1=new JLabel();
		l1.setText("Panel Check");
		//l1.setBounds(0, 0, 100, 30);
		l1.setVerticalAlignment(JLabel.TOP);
		l1.setHorizontalAlignment(JLabel.LEFT);
		l1.setFont(new Font("MV Boli",Font.ITALIC,20));
		
		JPanel redpanel=new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0, 0, 250,250);
		//redpanel.setLayout(null);
		
		JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250, 0, 250,250);
		//bluepanel.setLayout(null);
		
		JPanel greenpanel=new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 250, 500,250);
		//greenpanel.setLayout(null);
		
		
		f.add(redpanel);
		f.add(bluepanel);
		f.add(greenpanel);
		redpanel.add(l1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(750,750);
		f.setLayout(null);
		f.setVisible(true);
	}	
	public static void main(String args[]) {
		new Panels();
	}
}

