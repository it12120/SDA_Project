import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VersionInfoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VersionInfoFrame frame = new VersionInfoFrame();
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
	public VersionInfoFrame() {
		setTitle("VersionInfo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VersionInfoFrame.class.getResource("/Icons/Chrome.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 252, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVersion = new JLabel("Version: 1.0.0");
		lblVersion.setIcon(new ImageIcon(VersionInfoFrame.class.getResource("/Icons/billing.png")));
		lblVersion.setBounds(12, 39, 119, 16);
		contentPane.add(lblVersion);
		
		JLabel lblReleased = new JLabel("Released: 20/05/13");
		lblReleased.setIcon(new ImageIcon(VersionInfoFrame.class.getResource("/Icons/calendar.png")));
		lblReleased.setBounds(12, 61, 136, 16);
		contentPane.add(lblReleased);
		
		JLabel lblCategoryGeneralUse = new JLabel("Category: General Use");
		lblCategoryGeneralUse.setIcon(new ImageIcon(VersionInfoFrame.class.getResource("/Icons/delicious.png")));
		lblCategoryGeneralUse.setBounds(12, 84, 170, 16);
		contentPane.add(lblCategoryGeneralUse);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setIcon(new ImageIcon(VersionInfoFrame.class.getResource("/Icons/check.png")));
		btnOk.setBounds(34, 125, 97, 25);
		contentPane.add(btnOk);
		
		this.getRootPane().setDefaultButton(btnOk);
	}

}
