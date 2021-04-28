import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{
	
	JFrame f;
	JSlider s;
	JPanel p;
	JLabel l;
	
	SliderDemo(){
		f=new JFrame("Slider Demo");
		p=new JPanel();
		l=new JLabel();
		s=new JSlider(JSlider.VERTICAL,0,150,75);
		
		s.setPreferredSize(new Dimension(400,200));
		s.setPaintTicks(true);
		s.setMinorTickSpacing(10);
		s.setMajorTickSpacing(25);
		s.setPaintLabels(true);
		s.setFocusable(false);
		
		s.setFont(new Font("MC Boli",Font.PLAIN,15));
		l.setFont(new Font("MC Boli",Font.PLAIN,25));
		
		s.addChangeListener(this);
		l.setText("°C="+s.getValue());
		
		p.add(s);
		p.add(l);
		f.add(p);
		
		
		f.setSize(420,420);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		l.setText("°C="+s.getValue());
	}

	public static void main(String[] args) {
		new SliderDemo();

	}

}
