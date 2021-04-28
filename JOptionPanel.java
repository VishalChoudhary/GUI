import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPanel {
	JFrame f;
	public JOptionPanel() {
		
		//JOptionPane.showInternalMessageDialog(f, "This is a message dialog box", "title", JOptionPane.PLAIN_MESSAGE);;
		//JOptionPane.showMessageDialog(f, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(f, "really?", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(f, "Your computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(f, "CALL TECH SUPPORT OR ELSE!", "title", JOptionPane.ERROR_MESSAGE);
	
		/*int ans=JOptionPane.showConfirmDialog(f, "code?");
		System.out.println(ans);*/
		
		/*String name=JOptionPane.showInputDialog(f,"Name?");
		System.out.println("Hello "+name);*/
		
		ImageIcon img=new ImageIcon("p1.jpeg");
		String[] response= {"No, you are!","thank you!","*blush*"};
		int ans=JOptionPane.showOptionDialog(f, "You are the best xD", 
				"Msg",JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, 
				img, response, 0);
		
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JOptionPanel();
	}

}
