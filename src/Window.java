import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {
	
	JButton bDate, bExit;
	JLabel lShowDate; 
	
	public Window() {
		
		setSize(600,400);
		setTitle("Window");
		
		setLayout(null);
		
		bDate = new JButton(" Show current date ");
		bDate.setBounds(150, 50, 300, 50);
		add(bDate);
		bDate.addActionListener(this);
		
		bExit = new JButton(" EXIT ");
		bExit.setBounds(150, 275, 300, 50);
		add(bExit);
		bExit.addActionListener(this);
		
		
		lShowDate = new JLabel("Date: ");
		lShowDate.setBounds(200, 125, 300, 20);
		lShowDate.setForeground(Color.RED);
		
		add(lShowDate);
		
		}
	 
	public static void main(String[] args) {
	
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
				
		if (source==bDate) {
		
			lShowDate.setText("Date: " + new Date().toString());
			// System.out.println(new Date());
		}
		else if (source==bExit)
		{
			dispose();

		}
		
	}

}
