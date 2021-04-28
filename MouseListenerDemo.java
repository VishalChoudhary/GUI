import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MouseListenerDemo extends JFrame implements MouseListener{

	JLabel l;
	MouseListenerDemo(){
		
		l=new JLabel();
		l.setBounds(0, 0, 100, 100);
		l.setBackground(Color.red);
		l.setOpaque(true);	
		l.addMouseListener(this);
		
		this.add(l);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(400,400);
		this.setVisible(true);	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Pressed the mouse");
		l.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Released the mouse");
		l.setBackground(Color.blue);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Entered the component");
		l.setBackground(Color.green);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Exited the component");
		l.setBackground(Color.red);
	}
	
	public static void main(String args[]) {
		new MouseListenerDemo();
	}
	
}
