import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListnerDemo implements KeyListener {

	JLabel l;
	JFrame f;
	ImageIcon i;
	
	KeyListnerDemo() {
		
		f=new JFrame();
		i=new ImageIcon("r48p.png");
		
		l=new JLabel();
		l.setBounds(0, 0, 100, 100);
		l.setIcon(i);
		
		f.getContentPane().setBackground(Color.BLACK);
		f.add(l);
		
		f.addKeyListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'w': l.setLocation(l.getX(), l.getY()-10);
		break;
		case 'a': l.setLocation(l.getX()-10, l.getY());
		break;
		case 's': l.setLocation(l.getX(), l.getY()+10);
		break;
		case 'd': l.setLocation(l.getX()+10, l.getY());
		break;
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 38: l.setLocation(l.getX(), l.getY()-10);
		break;
		case 37: l.setLocation(l.getX()-10, l.getY());
		break;
		case 40: l.setLocation(l.getX(), l.getY()+10);
		break;
		case 39: l.setLocation(l.getX()+10, l.getY());
		break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Your realeased Key: "+e.getKeyChar());
		System.out.println("Your realeased Key: "+e.getKeyCode());
	}

	public static void main(String args[]) {
		new KeyListnerDemo();
	}
}
