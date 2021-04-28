import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class RadioButtonEg extends JFrame implements ActionListener{

	JRadioButton noodles;
	JRadioButton burger;
	JRadioButton pizza;
	
	RadioButtonEg() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizza=new JRadioButton("Pizza");
		burger=new JRadioButton("burger");
		noodles=new JRadioButton("noodles");
		pizza.setFocusable(false);
		burger.setFocusable(false);
		noodles.setFocusable(false);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(pizza);
		bg.add(burger);
		bg.add(noodles);
		
		pizza.addActionListener(this);
		burger.addActionListener(this);
		noodles.addActionListener(this);
		
		this.add(pizza);
		this.add(burger);
		this.add(noodles);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza) {
			JOptionPane.showMessageDialog(this,"Pizza");
		}
		if(e.getSource()==burger) {
			JOptionPane.showMessageDialog(this,"Burger");
		}
		if(e.getSource()==noodles) {
			JOptionPane.showMessageDialog(this,"Noodles");
		}
		
	}
	
	public static void main(String args[]) {
		new RadioButtonEg();
	}

}
