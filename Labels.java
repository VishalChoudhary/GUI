import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border; 
public class Labels {
	JFrame f;
	JLabel l1;
	Labels(){
		f= new JFrame();
		l1=new JLabel();
		Border border=BorderFactory.createLineBorder(Color.RED, 3);
		l1.setText("Stickerly Image");
		ImageIcon image=new ImageIcon("p1.jpeg");
		l1.setIcon(image);
		l1.setHorizontalTextPosition(JLabel.CENTER);
		l1.setVerticalTextPosition(JLabel.TOP);;
		l1.setForeground(new Color(45,124,56));
		l1.setFont(new Font("MV Boli",Font.ITALIC,50));
		l1.setIconTextGap(10);
		l1.setBackground(Color.black);
		l1.setOpaque(true);
		l1.setBorder(border);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.CENTER);
		//l1.setBounds(1, 1, 500,600);
		f.add(l1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,1000);
		//f.setLayout(null);
		f.setVisible(true);
		f.pack();
		}
	public static void main(String args[]) {
		new Labels();
	}
}
