import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class SelectFileDemo implements ActionListener{
	JFrame f=new JFrame();
	JButton b=new JButton("Select a File");
	SelectFileDemo(){
		
		b.addActionListener(this);
		b.setFocusable(false);
		
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser fc=new JFileChooser();
	    int response=fc.showSaveDialog(null);
	    if(response==JFileChooser.APPROVE_OPTION);
		File file=new File(fc.getSelectedFile().getAbsolutePath());
		System.out.println(file);
	}
	
	public static void main(String args[]) {
		new SelectFileDemo();
	}	
}
