import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class PoliseisFrame extends JFrame{

	private DataBase db;

	private JPanel masterPanel;
	private JLabel lblBarcode;
	private JLabel lblPosotita;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	//private JComboBox combo;
	//private static int x;

	public PoliseisFrame(DataBase db){
		super("Pwliseis Proiontwn");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PoliseisFrame.class.getResource("/Icons/Chrome.png")));

		this.db = db;

		this.masterPanel = new JPanel();



		this.setContentPane(this.masterPanel);
		masterPanel.setLayout(null);

		lblBarcode = new JLabel("Barcode:");
		lblBarcode.setIcon(new ImageIcon(PoliseisFrame.class.getResource("/Icons/credit-card.png")));
		lblBarcode.setBounds(27, 11, 95, 14);
		masterPanel.add(lblBarcode);

		lblPosotita = new JLabel("Posotita:");
		lblPosotita.setIcon(new ImageIcon(PoliseisFrame.class.getResource("/Icons/database.png")));
		lblPosotita.setBounds(132, 11, 76, 14);
		masterPanel.add(lblPosotita);

		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ButtonListener27());
		btnNewButton.setIcon(new ImageIcon(PoliseisFrame.class.getResource("/Icons/check.png")));
		btnNewButton.setBounds(119, 186, 89, 23);
		masterPanel.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(33, 36, 86, 20);
		masterPanel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(132, 36, 86, 20);
		masterPanel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(33, 67, 86, 20);
		masterPanel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(132, 67, 86, 20);
		masterPanel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(33, 98, 86, 20);
		masterPanel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(132, 98, 86, 20);
		masterPanel.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(33, 129, 86, 20);
		masterPanel.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(132, 129, 86, 20);
		masterPanel.add(textField_7);
		textField_7.setColumns(10);
		this.setSize(275,290);
		this.getRootPane().setDefaultButton(btnNewButton);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	class ButtonListener27 implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			String s,s1,s2,s3,s4,s5,s6,s7;
			s=textField.getText();
			s1=textField_1.getText();

			s2=textField_2.getText();
			s3=textField_3.getText();

			s4=textField_4.getText();
			s5=textField_5.getText();

			s6=textField_6.getText();
			s7=textField_7.getText();

			boolean flag = false;

			if ((s.equals("")) && (s1.equals(""))){
				JOptionPane.showMessageDialog(masterPanel,"Parakalw simplirose ta pedia gia kataxwrisi");
				flag=true;
			}

			if((!(s.equals(""))&& s1.equals("")) || (s.equals("")&& !s1.equals(""))){
				JOptionPane.showMessageDialog(masterPanel, "Parakalw simplirwste ola ta pedia sto 1o proion");
				flag = true;
			}

			if(((!(s2.equals(""))&& s3.equals(""))) || ((s2.equals("")&& !s3.equals(""))) ) {
				JOptionPane.showMessageDialog(masterPanel, "Parakalw simplirwste posotita sto 2o proion");
				flag = true;
			}

			if((!(s4.equals(""))&& s5.equals("")) || (s4.equals("")&& !s5.equals(""))){
				JOptionPane.showMessageDialog(masterPanel, "Parakalw simplirwste posotita sto 3o proion");
				flag = true;
			}

			if((!(s6.equals(""))&& s7.equals("")) || (s6.equals("")&& !s7.equals(""))) {
				JOptionPane.showMessageDialog(masterPanel, "Parakalw simplirwste posotita sto 4o proion");
				flag = true;
			}

			
				for(Proion pr : db.getProiontaSet()){
					if(pr.getBarcode().equals(s)){
						double polish = Double.parseDouble(s1);
						pr.updatePwliseis(polish);
						//db.serializing();
						//JOptionPane.showMessageDialog(masterPanel, "Epitixis pwlisi Proiontwn");
					}
				}

				for(Proion pr : db.getProiontaSet()){
					if(pr.getBarcode().equals(s2)){
						double polish = Double.parseDouble(s3);
						pr.updatePwliseis(polish);
						//db.serializing();
						//JOptionPane.showMessageDialog(masterPanel, "Epitixis pwlisi Proiontwn");
					}
				}

				for(Proion pr : db.getProiontaSet()){
					if(pr.getBarcode().equals(s4)){
						double polish = Double.parseDouble(s5);
						pr.updatePwliseis(polish);
						//db.serializing();
						//JOptionPane.showMessageDialog(masterPanel, "Epitixis pwlisi Proiontwn");
					}
				}

				for(Proion pr : db.getProiontaSet()){
					if(pr.getBarcode().equals(s6)){
						double polish = Double.parseDouble(s7);
						pr.updatePwliseis(polish);
						//db.serializing();
						//JOptionPane.showMessageDialog(masterPanel, "Epitixis pwlisi Proiontwn");
					}
				}
				if(flag==false){
				db.serializing();
				JOptionPane.showMessageDialog(masterPanel, "Epitixis pwlisi Proiontwn");

				textField.setText("");
				textField_1.setText("");

				textField_2.setText("");
				textField_3.setText("");

				textField_4.setText("");
				textField_5.setText("");

				textField_6.setText("");
				textField_7.setText("");
				}
		}
	}
}