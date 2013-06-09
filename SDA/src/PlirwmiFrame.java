import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PlirwmiFrame extends JFrame {
	
	private DataBase db;
	
	private String[] pelatesNameList;
	private JPanel contentPane;
	private JPanel masterPanel;
	private JTextField textField;
	private JList list;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EispraksiFrame frame = new EispraksiFrame(db);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public PlirwmiFrame(DataBase db) {
		
		this.db = db;
		 
		this.masterPanel=new JPanel();
		
		setTitle("Plirwmi");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EispraksiFrame.class.getResource("/Icons/Chrome.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 448, 254);
		masterPanel.setLayout(null);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		JLabel lblPelatis = new JLabel("Promitheytis:");
		lblPelatis.setIcon(new ImageIcon(EispraksiFrame.class.getResource("/Icons/hire-me.png")));
		lblPelatis.setBounds(0, 61, 95, 14);
		masterPanel.add(lblPelatis);
		
				
		this.list = new JList();
/*		DefaultListModel listModel = new DefaultListModel();
		for(Pelatis p:db.getPelatesList()){
			String name = p.getEpwnymia();
			listModel.addElement(name);
		}
		list.setModel(listModel);*/
		
		String[] entries = new String[db.getPromitheytesList().size()];
		for(int i=0;i<db.getPromitheytesList().size();i++){
			entries[i] = db.getPromitheytesList().get(i).getEpwnymia();
		}
		list = new JList(entries);
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setBounds(92, 5, 258, 130);
		
		
		list.setBounds(66, 37, 108, 95);
		masterPanel.add(listScroller);
		
		JLabel lblPoso = new JLabel("Poso:");
		lblPoso.setIcon(new ImageIcon(PlirwmiFrame.class.getResource("/Icons/issue.png")));
		lblPoso.setBounds(0, 171, 69, 14);
		masterPanel.add(lblPoso);
		
		this.setContentPane(masterPanel);
		
		textField = new JTextField();
		textField.setBounds(92, 168, 86, 20);
		masterPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		
		this.getRootPane().setDefaultButton(btnOk);
		
		
		btnOk.addActionListener(new ButtonListener2());
		btnOk.setIcon(new ImageIcon(EispraksiFrame.class.getResource("/Icons/check.png")));
		btnOk.setBounds(261, 167, 89, 23);
		masterPanel.add(btnOk);
		
		JLabel label = new JLabel("$");
		label.setBounds(188, 171, 46, 14);
		masterPanel.add(label);
		this.getRootPane().setDefaultButton(btnOk);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	class ButtonListener2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String selectedPromitheytisText = (String)list.getSelectedValue();
			double ammount = Double.parseDouble(textField.getText());
			for(Promitheytis p : db.getPromitheytesList()){
				if(p.getEpwnymia() == selectedPromitheytisText){
					p.setDebt(p.getDebt()+ammount);
					JOptionPane.showMessageDialog(masterPanel, "Epitixis Kataxwrisi Plirwmis");
					textField.setText("");
					db.serializing();
				}
			}
			
		}
		
		
	}
}
