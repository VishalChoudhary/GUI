import java.awt.Color;

import javax.swing.*;

public class MyFrame {
	JFrame f;
	MyFrame()
	 {
		f= new JFrame();
		f.setTitle("JFrame Basics");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(420,420);
		f.setLayout(null);
		f.setVisible(true);
		
		ImageIcon image=new ImageIcon("pic.jpg");//create an image icon
		f.setIconImage(image.getImage()); //change icon of frame
		f.getContentPane().setBackground(new Color(0,45,177));//setting bag color
	}
public static void main(String args[]) {
	new MyFrame();
}
}

