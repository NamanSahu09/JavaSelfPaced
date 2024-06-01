import javax.swing.JOptionPane;

public class gui_first {

	public static void main(String[] args)
	{
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
		JOptionPane.showMessageDialog(null, "Hello " + name);
		JOptionPane.showMessageDialog(null, "Age is : " + age);
		
		
	}

}
