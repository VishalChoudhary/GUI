import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEg implements ActionListener{

	JLabel l;
	JCheckBox cb1, cb2, cb3;
	JButton b;
	JFrame f;

	CheckBoxEg() {
		f = new JFrame();
		l = new JLabel("Food Ordering System");
		l.setBounds(50, 50, 300, 20);
		cb1 = new JCheckBox("Pizza @ 100");
		cb1.setFocusable(false);
		cb1.setBounds(100, 100, 150, 20);
		cb2 = new JCheckBox("Burger @ 30");
		cb2.setFocusable(false);
		cb2.setBounds(100, 150, 150, 20);
		cb3 = new JCheckBox("Tea @ 10");
		cb3.setFocusable(false);
		cb3.setBounds(100, 200, 150, 20);
		b = new JButton("Order");
		b.setFocusable(false);
		b.setBounds(100, 250, 80, 30);
		
		b.addActionListener(this);
		f.add(l);f.add(cb1);f.add(cb2);f.add(cb3);f.add(b); 
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		float amt=0;
		String msg=" ";
		if(cb1.isSelected()) {
			amt+=100;
			msg+="Pizza: 100\n"; 
		}
		if(cb2.isSelected()) {
			amt+=30;
			msg+="Burger: 30\n"; 
		}
		if(cb3.isSelected()) {
			amt+=10;
			msg+="Tea: 10\n"; 
		}
		msg+="-------------------------\n";
		JOptionPane.showMessageDialog(f, msg+"Total: "+amt); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEg();
	}

	

}
