import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SupportFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupportFrame frame = new SupportFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SupportFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SupportFrame.class.getResource("/Icons/Chrome.png")));
		setTitle("Support");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 236, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDieythinsiEgnatias = new JLabel("Dieythinsi: Egnatias 156");
		lblDieythinsiEgnatias.setIcon(new ImageIcon(SupportFrame.class.getResource("/Icons/address.png")));
		lblDieythinsiEgnatias.setBounds(12, 67, 184, 16);
		contentPane.add(lblDieythinsiEgnatias);
		
		JLabel lblThl = new JLabel("Thl: 2310 - 455.673");
		lblThl.setIcon(new ImageIcon(SupportFrame.class.getResource("/Icons/contact.png")));
		lblThl.setBounds(12, 98, 137, 16);
		contentPane.add(lblThl);
		
		JLabel lblSdaTechnoLtd = new JLabel("SDA Techno Ltd.");
		lblSdaTechnoLtd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSdaTechnoLtd.setBounds(38, 13, 122, 16);
		contentPane.add(lblSdaTechnoLtd);
		
		JLabel lblNewLabel = new JLabel("FAX: 2310 - 455.682");
		lblNewLabel.setIcon(new ImageIcon(SupportFrame.class.getResource("/Icons/category.png")));
		lblNewLabel.setBounds(12, 127, 148, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailSupportsdagr = new JLabel("e-mail: support@sda.gr");
		lblEmailSupportsdagr.setIcon(new ImageIcon(SupportFrame.class.getResource("/Icons/email.png")));
		lblEmailSupportsdagr.setBounds(12, 156, 171, 16);
		contentPane.add(lblEmailSupportsdagr);
		
		JButton btnNewButton = new JButton("Ok");
		
		this.getRootPane().setDefaultButton(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(SupportFrame.class.getResource("/Icons/check.png")));
		btnNewButton.setBounds(52, 195, 97, 25);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 42, 171, 12);
		contentPane.add(separator);
		
		
	}
}
