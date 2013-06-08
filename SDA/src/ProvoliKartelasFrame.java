import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class ProvoliKartelasFrame extends JFrame{

	private DataBase db1;

	private JPanel masterPanel;
	private JPanel mainPanel;

	private JLabel epwnymiaL, afmL, addressL, zipCodeL, phoneL, bankIbanL,ypoloipoL;
	private JTextField epwnymiaF, afmF, addressF, zipCodeF, phoneF, bankIbanF,ypoloipoF;


	/**
	 * @wbp.parser.constructor
	 */
	public ProvoliKartelasFrame(Pelatis pel){
		super("Kartela Pelati");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProvoliKartelasFrame.class.getResource("/Icons/Chrome.png")));

		db1 = new DataBase();

		this.masterPanel = new JPanel();
		masterPanel.setLayout(null);
		this.mainPanel = new JPanel(new GridLayout(7,2));
		mainPanel.setBounds(15, 5, 452, 154);

		this.epwnymiaL = new JLabel("Epwnymia: ");
		epwnymiaL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/hire-me.png")));
		this.epwnymiaF = new JTextField(20);
		this.epwnymiaF.setText(pel.getEpwnymia());
		
		this.afmL = new JLabel("Afm: ");
		afmL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/consulting.png")));
		this.afmF = new JTextField(20);
		this.afmF.setText(pel.getAfm());
		
		this.addressL = new JLabel("Dieythinsi: ");
		addressL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/address.png")));
		this.addressF = new JTextField(20);
		this.addressF.setText(pel.getAddress());
		
		this.zipCodeL = new JLabel("T.K.: ");
		zipCodeL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/world.png")));
		this.zipCodeF = new JTextField(20);
		this.zipCodeF.setText(pel.getZipCode());
		
		this.phoneL = new JLabel("Thl.: ");
		phoneL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/contact.png")));
		this.phoneF = new JTextField(20);
		this.phoneF.setText(pel.getPhone());
		
		this.bankIbanL = new JLabel("IBAN: ");
		bankIbanL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/bank.png")));
		this.bankIbanF = new JTextField(20);
		this.bankIbanF.setText(pel.getBankIBAN());
		
		this.ypoloipoL= new JLabel("YPOLOIPO: ");
		ypoloipoL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/database.png")));
		this.ypoloipoF = new JTextField(20);
		this.ypoloipoF.setText(Double.toString(pel.getDebt()));
		

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
		this.mainPanel.add(this.ypoloipoL);
		this.mainPanel.add(this.ypoloipoF);
		this.masterPanel.add(mainPanel);

		this.setContentPane(masterPanel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/check.png")));
		btnOk.setBounds(370, 177, 97, 25);
		masterPanel.add(btnOk);

		this.setSize(500,260);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getRootPane().setDefaultButton(btnOk);
	}
	
	public ProvoliKartelasFrame(Promitheytis pro){
		super("Kartela Promitheyti");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProvoliKartelasFrame.class.getResource("/Icons/Chrome.png")));

		db1 = new DataBase();

		this.masterPanel = new JPanel();
		masterPanel.setLayout(null);
		this.mainPanel = new JPanel(new GridLayout(7,2));
		mainPanel.setBounds(15, 5, 452, 154);

		this.epwnymiaL = new JLabel("Epwnymia: ");
		epwnymiaL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/hire-me.png")));
		this.epwnymiaF = new JTextField(20);
		this.epwnymiaF.setText(pro.getEpwnymia());
		
		this.afmL = new JLabel("Afm: ");
		afmL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/consulting.png")));
		this.afmF = new JTextField(20);
		this.afmF.setText(pro.getAfm());
		
		this.addressL = new JLabel("Dieythinsi: ");
		addressL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/address.png")));
		this.addressF = new JTextField(20);
		this.addressF.setText(pro.getAddress());
		
		this.zipCodeL = new JLabel("T.K.: ");
		zipCodeL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/world.png")));
		this.zipCodeF = new JTextField(20);
		this.zipCodeF.setText(pro.getZipCode());
		
		this.phoneL = new JLabel("Thl.: ");
		phoneL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/contact.png")));
		this.phoneF = new JTextField(20);
		this.phoneF.setText(pro.getPhone());
		
		this.bankIbanL = new JLabel("IBAN: ");
		bankIbanL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/bank.png")));
		this.bankIbanF = new JTextField(20);
		this.bankIbanF.setText(pro.getBankIBAN());
		
		this.ypoloipoL= new JLabel("YPOLOIPO: ");
		ypoloipoL.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/database.png")));
		this.ypoloipoF = new JTextField(20);
		this.ypoloipoF.setText(Double.toString(pro.getDebt()));
		

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
		this.mainPanel.add(this.ypoloipoL);
		this.mainPanel.add(this.ypoloipoF);
		this.masterPanel.add(mainPanel);

		this.setContentPane(masterPanel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setIcon(new ImageIcon(ProvoliKartelasFrame.class.getResource("/Icons/check.png")));
		btnOk.setBounds(370, 177, 97, 25);
		masterPanel.add(btnOk);

		this.setSize(500,260);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getRootPane().setDefaultButton(btnOk);
	}
}


