import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLyt {
	JFrame f;
	JPanel j;
	FlowLyt() {
		f = new JFrame();
		j=new JPanel();
		
		j.setPreferredSize(new Dimension(100,300));
		j.setBackground(Color.LIGHT_GRAY);
		j.setLayout(new FlowLayout());
		
		j.add(new JButton("1"));
		j.add(new JButton("2"));
		j.add(new JButton("3"));
		j.add(new JButton("4"));
		j.add(new JButton("5"));
		j.add(new JButton("6"));
		j.add(new JButton("7"));
		j.add(new JButton("8"));
		j.add(new JButton("9"));		
		
		f.add(j);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new FlowLyt();
	}
}
