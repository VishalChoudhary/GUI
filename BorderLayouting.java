import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayouting {
	
	JFrame f;
	BorderLayouting(){
		
		JPanel j1=new JPanel();
		JPanel j2=new JPanel();
		JPanel j3=new JPanel();
		JPanel j4=new JPanel();
		JPanel j5=new JPanel();

		j1.setBackground(Color.red);
		j2.setBackground(Color.green);
		j3.setBackground(Color.yellow);
		j4.setBackground(Color.magenta);
		j5.setBackground(Color.blue);
		
		j1.setPreferredSize(new Dimension(100,100));
		j2.setPreferredSize(new Dimension(100,100));
		j3.setPreferredSize(new Dimension(100,100));
		j4.setPreferredSize(new Dimension(100,100));
		j5.setPreferredSize(new Dimension(100,100));
		
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setLayout(new BorderLayout(10,10));
		f.setVisible(true);
		f.add(j1,BorderLayout.NORTH);
		f.add(j2,BorderLayout.WEST);
		f.add(j3,BorderLayout.EAST);
		f.add(j4,BorderLayout.SOUTH);
		f.add(j5,BorderLayout.CENTER);
		
	}
		public static void main(String args[]) {
		new BorderLayouting();
	}
}
