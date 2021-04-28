import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Textfields implements ActionListener{

	JFrame f;
	JTextField tf;
	JButton b;
	Textfields() {
		f=new JFrame();
		
		b=new JButton();
		b.setText("Click Me!");
		b.setFocusable(false);
		b.setBounds(90, 200, 120, 30);
		b.addActionListener(this);
		
		tf=new JTextField();
		tf.setBounds(90, 50, 150, 30);
		tf.setFont(new Font("Consolas",Font.ITALIC,20));
		tf.setForeground(Color.green);
		tf.setBackground(Color.gray);
		tf.setCaretColor(Color.white);
		tf.setText("Name?");
		
		f.add(b);
		f.add(tf);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			System.out.println("Welcome "+tf.getText());
			b.setEnabled(false);
			tf.setEditable(false);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Textfields();
	}

}
