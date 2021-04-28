import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {

	JFrame f=new JFrame();
	JProgressBar bar=new JProgressBar(0,100);
	ProgressBarDemo(){
		
		bar.setBounds(0,150,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		f.add(bar);
		f.setSize(420,420);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int c=0;
		while(c<=100) {
			bar.setValue(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c+=1;
		}
		bar.setString("Done :)");
	}
	
	public static void main(String[] args) {
		new ProgressBarDemo();
	}

}
