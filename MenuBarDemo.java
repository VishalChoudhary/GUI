import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarDemo implements ActionListener{
	
	JMenuBar mb;
	JMenu fm;
	JMenu em;
	JMenu hm;
	JMenuItem load;
	JMenuItem save;
	JMenuItem exit;
	JFrame f=new JFrame();
	
	MenuBarDemo(){
		
		mb=new JMenuBar();
		
		fm=new JMenu("File");
		em=new JMenu("Edit");
		hm=new JMenu("Help");
		
		load=new JMenuItem("Load");
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		
		fm.setMnemonic(KeyEvent.VK_F);
		em.setMnemonic(KeyEvent.VK_E);
		hm.setMnemonic(KeyEvent.VK_H);
		load.setMnemonic(KeyEvent.VK_L);
		save.setMnemonic(KeyEvent.VK_S);
		exit.setMnemonic(KeyEvent.VK_E);
		
		load.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		
		fm.add(load);
		fm.add(save);
		fm.add(exit);
		
		mb.add(fm);
		mb.add(em);
		mb.add(hm);
		
		f.setJMenuBar(mb);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(420,420);
		f.setLayout(new FlowLayout());;
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==load) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==save) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new MenuBarDemo();
	}
}
