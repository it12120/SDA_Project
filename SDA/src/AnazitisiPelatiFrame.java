import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class AnazitisiPelatiFrame extends JFrame{

	private DataBase db;

	private JPanel masterPanel;
	private JPanel mainPanel,downPanel;
	private JLabel searchLabel;
	private JTextField searchField;
	private JButton searchButton;
	private JList list;



	public AnazitisiPelatiFrame(DataBase db) {
		super("Anazitisi");
		setTitle("Anazitisi Pelati");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AnazitisiPelatiFrame.class.getResource("/Icons/Chrome.png")));

		this.db = db;

		this.masterPanel = new JPanel(new BorderLayout());
		this.mainPanel = new JPanel();
		this.downPanel = new JPanel();


		String[] entries = new String[db.getPelatesList().size()];
		for(int i=0;i<db.getPelatesList().size();i++){
			entries[i] = db.getPelatesList().get(i).getEpwnymia();
		}
		list = new JList(entries);
		JScrollPane listScroller = new JScrollPane(list);



		this.searchLabel = new JLabel("Epwnymia:");
		searchLabel.setIcon(new ImageIcon(AnazitisiPelatiFrame.class.getResource("/Icons/hire-me.png")));
		this.searchField = new JTextField(15);

		this.searchButton = new JButton("Search");
		searchButton.setIcon(new ImageIcon(AnazitisiPelatiFrame.class.getResource("/Icons/search.png")));
		this.searchButton.addActionListener(new ButtonListener());

		this.mainPanel.add(searchLabel);
		this.mainPanel.add(searchField);
		this.mainPanel.add(searchButton);

		this.downPanel.add(listScroller);

		this.masterPanel.add(mainPanel,BorderLayout.BEFORE_FIRST_LINE);
		this.masterPanel.add(downPanel,BorderLayout.CENTER);

		this.setContentPane(this.masterPanel);

		this.setSize(500,260);
		this.getRootPane().setDefaultButton(searchButton);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}


	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			if(searchField.getText().equals("")){
				String SelectedPelatisText = (String)list.getSelectedValue();
				for(Pelatis p : db.getPelatesList()){
					if(p.getEpwnymia() == SelectedPelatisText){
						searchField.setText(SelectedPelatisText);
						searchButton.doClick();

					}
				}
			}
			else{
				String s1 = searchField.getText();
				Boolean found = false;

				int i=0;
				while(!found && i<db.getPelatesList().size()){
					if(s1.equals(db.getPelatesList().get(i).getEpwnymia())){
						found = true;
						//searchField.setText("");
						new ProvoliKartelasFrame(db.getPelatesList().get(i));
					}
					else
						i++;
				}
				if(!found)
					JOptionPane.showMessageDialog(masterPanel, "Den vrethike kamia kataxwrisi");
			}
		}
	}
}


