import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class AnazitisiFrame extends JFrame{

	private DataBase db;
	private JPanel masterPanel;
	private JLabel searchLabel;
	private JTextField searchField;
	private JButton b1;



	public AnazitisiFrame(DataBase db) {
		super("Anazitisi");
		setTitle("Anazitisi Proiontos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AnazitisiFrame.class.getResource("/Icons/Chrome.png")));


		this.db = db;
		//this.db.setPelatesList(this.pelatesList);

		this.masterPanel = new JPanel();

		this.searchLabel = new JLabel("Barcode:");
		searchLabel.setIcon(new ImageIcon(AnazitisiFrame.class.getResource("/Icons/credit-card.png")));
		searchLabel.setBounds(76, 10, 77, 14);
		this.searchField = new JTextField(15);
		searchField.setBounds(158, 7, 126, 20);

		this.b1 = new JButton("Search");
		b1.setBounds(289, 5, 107, 25);
		b1.setIcon(new ImageIcon(AnazitisiFrame.class.getResource("/Icons/search.png")));
		this.b1.addActionListener(new ButtonListener());
		masterPanel.setLayout(null);

		this.masterPanel.add(searchLabel);
		this.masterPanel.add(searchField);
		this.masterPanel.add(b1);


		this.setContentPane(this.masterPanel);

		this.setSize(500,149);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getRootPane().setDefaultButton(b1);


	}


	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			String s1 = searchField.getText();
			boolean  flag=false;
			
			
			
			for(Proion pr : db.getProiontaSet()){
				if(pr.getBarcode().equals(s1)){
					flag=true;
					//System.out.println(pr.toString());
					JOptionPane.showMessageDialog(masterPanel, ""+pr.toString());
					
				}
				
			}
			if(flag==false){
			JOptionPane.showMessageDialog(masterPanel, "Den uparxei to proion:"+s1);
			}

			
		}
		
		
	}


}


