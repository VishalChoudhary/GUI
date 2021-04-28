import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLyt {

	JFrame f;

	GridLyt() {
		f=new JFrame();
		
		f.add(new JButton("1"));
		f.add(new JButton("2"));
		f.add(new JButton("3"));
		f.add(new JButton("4"));
		f.add(new JButton("5"));
		f.add(new JButton("6"));
		f.add(new JButton("7"));
		f.add(new JButton("8"));
		f.add(new JButton("9"));
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLayout(new GridLayout(3,3,1,1));
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new GridLyt();
	}
}
