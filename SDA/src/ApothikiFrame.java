import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ApothikiFrame extends JFrame{
	
	private JPanel masterPanel;
	private JLabel searchLabel;
	private JTextField searchField;
	private JButton b1;
	
	public ApothikiFrame() {
		super("APOTHIKI");
		
		this.masterPanel = new JPanel();
		
		this.searchLabel = new JLabel("Anazitisi:");
		this.searchField = new JTextField(15);
		
		this.b1 = new JButton("Search");
		this.b1.addActionListener(new ButtonListener());
		
		this.masterPanel.add(searchLabel);
		this.masterPanel.add(searchField);
		this.masterPanel.add(b1);
		
		
		this.setContentPane(this.masterPanel);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			
			
			
		}
		
		
		
	}
	

}
