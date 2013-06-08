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


public class AnazitisiPromitheytiFrame extends JFrame{

	private DataBase db;

	private JPanel masterPanel;
	private JPanel mainPanel,downPanel;
	private JLabel searchLabel;
	private JTextField searchField;
	private JButton searchButton;
	private JList list;



	public AnazitisiPromitheytiFrame(DataBase db) {
		super("Anazitisi");
		setTitle("Anazitisi Promitheyti");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AnazitisiPromitheytiFrame.class.getResource("/Icons/Chrome.png")));

		this.db = db;

		this.masterPanel = new JPanel(new BorderLayout());
		this.mainPanel = new JPanel();
		this.downPanel = new JPanel();


		String[] entries = new String[db.getPromitheytesList().size()];
		for(int i=0;i<db.getPromitheytesList().size();i++){
			entries[i] = db.getPromitheytesList().get(i).getEpwnymia();
		}
		list = new JList(entries);
		JScrollPane listScroller = new JScrollPane(list);



		this.searchLabel = new JLabel("Epwnymia:");
		searchLabel.setIcon(new ImageIcon(AnazitisiPromitheytiFrame.class.getResource("/Icons/hire-me.png")));
		this.searchField = new JTextField(15);

		this.searchButton = new JButton("Search");
		searchButton.setIcon(new ImageIcon(AnazitisiPromitheytiFrame.class.getResource("/Icons/search.png")));
		this.searchButton.addActionListener(new ButtonListener());

		this.mainPanel.add(searchLabel);
		this.mainPanel.add(searchField);
		this.mainPanel.add(searchButton);

		this.downPanel.add(listScroller);

		this.masterPanel.add(mainPanel,BorderLayout.BEFORE_FIRST_LINE);
		this.masterPanel.add(downPanel,BorderLayout.CENTER);

		this.setContentPane(this.masterPanel);

		this.setSize(500,200);
		this.getRootPane().setDefaultButton(searchButton);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}


	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			String s1 = searchField.getText();
			Boolean found = false;

			if(searchField.getText().equals("")){
				String SelectedPelatisText = (String)list.getSelectedValue();
				for(Promitheytis pro : db.getPromitheytesList()){
					if(pro.getEpwnymia() == SelectedPelatisText){
						searchField.setText(SelectedPelatisText);
						searchButton.doClick();

					}
				}
			}
			else{

				int j=0;
				while(!found && j<db.getPromitheytesList().size()){
					if(s1.equals(db.getPromitheytesList().get(j).getEpwnymia())){
						found = true;
						searchField.setText("");
						new ProvoliKartelasFrame(db.getPromitheytesList().get(j));
					}
					else
						j++;
				}

				if(!found)
					JOptionPane.showMessageDialog(null, "Den vrethike kamia kataxwrisi");
			}
		}
	}
}
