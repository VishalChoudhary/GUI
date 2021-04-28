import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ColorChooserdemo extends JFrame implements ActionListener{
	JFrame f=new JFrame();
	JButton b;
	JLabel l;
	ColorChooserdemo(){
		
		b=new JButton("Pick Color");
		b.addActionListener(this);
		b.setFocusable(false);
		
		l=new JLabel();
		l.setBackground(Color.white);
		l.setText("Reyna is too Ofie to Handle");
		
		l.setFont(new Font("MV Boli",Font.PLAIN,100));	
		l.setOpaque(true);
		
		this.add(l);
		this.add(b);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			JColorChooser ch=new JColorChooser();
			
        Color color = JColorChooser.showDialog(this, "Pick a color...I guess", Color.black);
			
			//l.setForeground(color);
			l.setBackground(color);
			
		}
		
	}
	public static void main(String args[]) {
		new ColorChooserdemo();
	}

}



