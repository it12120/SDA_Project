import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class DimiourgiaKartelasPromitheytiFrame extends JFrame{

	private DataBase db;

	private JPanel masterPanel;
	private JPanel mainPanel;
	//private JComboBox combo;
	private JButton kataxB;
	private JLabel epwnymiaL, afmL, addressL, zipCodeL, phoneL, bankIbanL;
	private JTextField epwnymiaF, afmF, addressF, zipCodeF, phoneF, bankIbanF;


	public DimiourgiaKartelasPromitheytiFrame(DataBase db){
		super("Dimiourgia Kartelas Promitheyti");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/Chrome.png")));

		this.db = db;

		this.masterPanel = new JPanel();
		this.mainPanel = new JPanel(new GridLayout(6,2));
		mainPanel.setBounds(15, 5, 452, 132);

		String items[] = {"Pelatis", "Promitheytis"};
		masterPanel.setLayout(null);
		//this.combo = new JComboBox(items);

		this.epwnymiaL = new JLabel("Epwnymia: ");
		epwnymiaL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/hire-me.png")));
		this.epwnymiaF = new JTextField(20);
		this.afmL = new JLabel("Afm: ");
		afmL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/consulting.png")));
		this.afmF = new JTextField(20);
		this.addressL = new JLabel("Dieythinsi: ");
		addressL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/address.png")));
		this.addressF = new JTextField(20);
		this.zipCodeL = new JLabel("T.K.: ");
		zipCodeL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/world.png")));
		this.zipCodeF = new JTextField(20);
		this.phoneL = new JLabel("Thl.: ");
		phoneL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/contact.png")));
		this.phoneF = new JTextField(20);
		this.bankIbanL = new JLabel("IBAN: ");
		bankIbanL.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/bank.png")));
		this.bankIbanF = new JTextField(20);

		//this.upPanel.add(combo);

		this.mainPanel.add(this.epwnymiaL);
		this.mainPanel.add(this.epwnymiaF);
		this.mainPanel.add(this.afmL);
		this.mainPanel.add(this.afmF);
		this.mainPanel.add(this.addressL);
		this.mainPanel.add(this.addressF);
		this.mainPanel.add(this.zipCodeL);
		this.mainPanel.add(this.zipCodeF);
		this.mainPanel.add(this.phoneL);
		this.mainPanel.add(this.phoneF);
		this.mainPanel.add(this.bankIbanL);
		this.mainPanel.add(this.bankIbanF);
		this.masterPanel.add(mainPanel);

		this.kataxB = new JButton("Kataxwrisi");
		kataxB.setIcon(new ImageIcon(DimiourgiaKartelasPromitheytiFrame.class.getResource("/Icons/check.png")));
		kataxB.setBounds(184, 150, 111, 25);
		masterPanel.add(kataxB);
		this.kataxB.addActionListener(new ButtonListener());
		this.getRootPane().setDefaultButton(kataxB);

		this.setContentPane(masterPanel);

		this.setSize(500,231);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void clearFields(){
		this.epwnymiaF.setText("");
		this.afmF.setText("");
		this.addressF.setText("");
		this.zipCodeF.setText("");
		this.phoneF.setText("");
		this.bankIbanF.setText("");
	}

	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			//if(combo.getSelectedItem().equals("Promitheytis")){
			Promitheytis tempPr = new Promitheytis(epwnymiaF.getText(), afmF.getText(), addressF.getText(), zipCodeF.getText(), phoneF.getText(), bankIbanF.getText());

			String s1 = afmF.getText();
			Boolean found = false;

			if(epwnymiaF.getText().equals("")  || afmF.getText().equals("") || addressF.getText().equals("") || zipCodeF.getText().equals("")|| phoneF.getText().equals("")|| bankIbanF.getText().equals("")){
				JOptionPane.showMessageDialog(masterPanel, "Den egine kataxwrisi promitheyti  , simplirose ola ta pedia","ERROR",JOptionPane.ERROR_MESSAGE);
				found=true;
			}

			/*else if(found==false){

				for(int i=0; i<db.getPelatesList().size();i++){

					if(s1.equals(db.getPelatesList().get(i).getAfm())){ 

						JOptionPane.showMessageDialog(masterPanel, "Yparxei allos pelatis me ayto to afm","ERROR",JOptionPane.ERROR_MESSAGE);
					}	
				}
			}
			 */

			else  {

				db.addPromitheytis(tempPr);
				db.serializing();

				JOptionPane.showMessageDialog(masterPanel, "Epitixis kataxwrisi promitheyti","Epityxia",JOptionPane.INFORMATION_MESSAGE);
				clearFields();
			}

			

		}
	}
}

