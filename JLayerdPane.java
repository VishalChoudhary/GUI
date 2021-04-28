 import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayerdPane {
	JFrame f;
	JLayeredPane jl;
	JLayerdPane() {
		
		f=new JFrame();
		
		JLabel l1=new JLabel();
		l1.setOpaque(true);
		l1.setBackground(Color.RED);
		l1.setBounds(50, 50, 200, 200);
		
		JLabel l2=new JLabel();
		l2.setOpaque(true);
		l2.setBackground(Color.GREEN);
		l2.setBounds(100, 100, 200, 200);
		
		JLabel l3=new JLabel();
		l3.setOpaque(true);
		l3.setBackground(Color.BLUE);
		l3.setBounds(150, 150, 200, 200);
		
		jl=new JLayeredPane();
		jl.setBounds(0, 0, 500,500);
		
		jl.add(l1,Integer.valueOf(0));
		jl.add(l2,Integer.valueOf(2));
		jl.add(l3,Integer.valueOf(1));
		
		f.add(jl);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new JLayerdPane();
	}
}
