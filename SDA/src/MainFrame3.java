import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTable;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;


public class MainFrame3 extends JFrame {
	
	private DataBase db;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame3 frame = new MainFrame3();
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
	public MainFrame3(final DataBase db) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame3.class.getResource("/Icons/Chrome.png")));
		
		this.db = db;
		
		setTitle("SDA - Home");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 291);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNew = new JMenu("Kartela");
		mnNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnNew.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Users-icon.png")));
		menuBar.add(mnNew);
		
		JMenu mnNewMenu_1 = new JMenu("New");
		mnNewMenu_1.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Add-icon.png")));
		mnNew.add(mnNewMenu_1);
		
		JMenuItem mntmPelatis = new JMenuItem("Pelatis");
		mntmPelatis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new DimiourgiaKartelasPelatiFrame(db);
				
				
			}
		});
		mntmPelatis.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Add-user-icon.png")));
		mnNewMenu_1.add(mntmPelatis);
		
		JMenuItem mntmPromitheytis = new JMenuItem("Promitheytis");
		mntmPromitheytis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new DimiourgiaKartelasPromitheytiFrame(db);
				
			}
		});
		mntmPromitheytis.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Add-user-icon.png")));
		mnNewMenu_1.add(mntmPromitheytis);
		
		JMenu mnAnazitisi = new JMenu("Anazitisi");
		mnAnazitisi.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Search-icon.png")));
		mnNew.add(mnAnazitisi);
		
		JMenuItem mntmPelati_1 = new JMenuItem("Pelati");
		mntmPelati_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AnazitisiPelatiFrame(db);
			}
		});
		mntmPelati_1.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/User-icon.png")));
		mnAnazitisi.add(mntmPelati_1);
		
		JMenuItem mntmPromitheyti_1 = new JMenuItem("Promitheyti");
		mntmPromitheyti_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AnazitisiPromitheytiFrame(db);
			}
		});
		mntmPromitheyti_1.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/User-icon.png")));
		mnAnazitisi.add(mntmPromitheyti_1);
		
		JMenu mnApothiki = new JMenu("Apothiki");
		mnApothiki.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnApothiki.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Home-icon.png")));
		menuBar.add(mnApothiki);
		
		JMenuItem mntmAgores = new JMenuItem("Agores");
		mntmAgores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AgoresFrame(db);
				
			}
		});
		mntmAgores.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Login-in-icon.png")));
		mnApothiki.add(mntmAgores);
		
		JMenuItem mntmPwliseis = new JMenuItem("Pwliseis");
		mntmPwliseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new PoliseisFrame(db);
				
			}
		});
		mntmPwliseis.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Login-out-icon.png")));
		mnApothiki.add(mntmPwliseis);
		
		JMenuItem mntmAnazitisi = new JMenuItem("Anazitisi");
		mntmAnazitisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnazitisiFrame f5 = new AnazitisiFrame(db);
				f5.setVisible(true);
				
			}
		});
		mntmAnazitisi.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Search-icon.png")));
		mnApothiki.add(mntmAnazitisi);
		
		JMenu mnStatistika = new JMenu("Synallages");
		mnStatistika.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnStatistika.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Copy-icon.png")));
		menuBar.add(mnStatistika);
		
		JMenuItem mntmEispraksi = new JMenuItem("Eispraksi");
		mntmEispraksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EispraksiFrame f1 = new EispraksiFrame(db);
				f1.setVisible(true);
				
			}
		});
		mntmEispraksi.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/File-add-icon.png")));
		mnStatistika.add(mntmEispraksi);
		
		JMenuItem mntmPlirwmi = new JMenuItem("Plirwmi");
		mntmPlirwmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PlirwmiFrame f2 = new PlirwmiFrame(db);
				f2.setVisible(true);
				
			}
		});
		mntmPlirwmi.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/File-delete-icon.png")));
		mnStatistika.add(mntmPlirwmi);
		
		JMenu mnHelp = new JMenu("Statistika");
		mnHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnHelp.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Percent-icon.png")));
		menuBar.add(mnHelp);
		
		JMenuItem mntmBarchart = new JMenuItem("BarChart");
		mntmBarchart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				BarChartFrame c1 = new BarChartFrame(db);
				c1.setVisible(true);
				
			}
		});
		mntmBarchart.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Pools-icon.png")));
		mnHelp.add(mntmBarchart);
		
		JMenuItem mntmPiechart = new JMenuItem("PieChart");
		mntmPiechart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PieChartFrame pc1 = new PieChartFrame(db);
				pc1.setVisible(true);
				
			}
		});
		mntmPiechart.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/pie_chart.png")));
		mnHelp.add(mntmPiechart);
		
		JMenu mnHelp_1 = new JMenu("Help");
		mnHelp_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnHelp_1.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Faq-icon.png")));
		menuBar.add(mnHelp_1);
		
		JMenuItem mntmVersionInfo = new JMenuItem("Version Info");
		mntmVersionInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VersionInfoFrame ifr = new VersionInfoFrame();
				ifr.setVisible(true);
			}
		});
		mntmVersionInfo.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Info-icon.png")));
		mnHelp_1.add(mntmVersionInfo);
		
		JMenuItem mntmSupport = new JMenuItem("Support");
		mntmSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SupportFrame sf = new SupportFrame();
				sf.setVisible(true);
			}
		});
		mntmSupport.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Telephone-icon.png")));
		mnHelp_1.add(mntmSupport);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVersion = new JLabel("Version 1.0.0");
		lblVersion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblVersion.setBounds(10, 185, 75, 21);
		contentPane.add(lblVersion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 185, 372, 8);
		contentPane.add(separator);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/Chrome.png")));
		label.setBounds(140, 27, 102, 110);
		contentPane.add(label);
		
		JLabel lblSda = new JLabel("SDA Techno Ltd.\u00A9");
		lblSda.setBounds(252, 123, 111, 14);
		contentPane.add(lblSda);
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginScreen lg = new LoginScreen();
				lg.setVisible(true);
				dispose();
			}
		});
		btnLogout.setIcon(new ImageIcon(MainFrame3.class.getResource("/Icons/logout.png")));
		btnLogout.setBounds(333, 189, 49, 25);
		contentPane.add(btnLogout);
	}
}
