import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons implements ActionListener{
	
	JFrame f;
	JLabel l1;
	JButton b;
	Buttons(){
		
		ImageIcon i1=new ImageIcon("80.png");
		ImageIcon i2=new ImageIcon("p1.jpeg");
		
		l1=new JLabel();
		l1.setIcon(i2);
		l1.setBounds(150, 250, 150, 150);
		l1.setVisible(false);
		
		b=new JButton();
		b.setBounds(100, 100, 250, 120);
		b.addActionListener(this);
		b.setText("Hey There!!");
		
	    b.setFocusable(false);
	    b.setIcon(i1);
	    b.setHorizontalTextPosition(JButton.CENTER);
	    b.setVerticalTextPosition(JButton.BOTTOM);
	    b.setIconTextGap(-7);
	    b.setForeground(Color.red);
	    b.setFont(new Font("Comic Sans",Font.BOLD,20));
	    b.setBackground(Color.green);
	    b.setBorder(BorderFactory.createEtchedBorder());
		
		f=new JFrame();
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(b);
		f.add(l1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			System.out.println("Successful");
			l1.setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		new Buttons();
	}

}
