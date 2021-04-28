import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComboBoxEg implements ActionListener{

	JComboBox cb;
	JFrame f;
	ComboBoxEg() {
		
		f=new JFrame();
		cb=new JComboBox();
		
		String[] animal= {"hathi","ghora","uth","billi"};
		
		cb=new JComboBox(animal);
		cb.addActionListener(this);
		
		//cb.setEditable(true);
		//cb.setSelectedIndex(0);
		cb.addItem("kutta");
		cb.insertItemAt("ullu",0);
		
		f.add(cb);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.pack();
		f.setVisible(true);
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb) {
			JOptionPane.showMessageDialog(f,cb.getSelectedItem());
		}
	}

	public static void main(String[] args) {
		new ComboBoxEg();
	}
}
