import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LoginScreen extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private DataBase dbFromFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		
		
		dbFromFile = new DataBase();
		try {
			FileInputStream fileIn = new FileInputStream("DB.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			dbFromFile = (DataBase) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("Loading Data Attempted...");
		}
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginScreen.class.getResource("/Icons/Chrome.png")));
		setTitle("SDA - LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setToolTipText("Enter your Username");
		lblUsername.setIcon(new ImageIcon(LoginScreen.class.getResource("/Icons/User-icon.png")));
		lblUsername.setBounds(36, 24, 89, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setToolTipText("Enter your Password");
		lblPassword.setIcon(new ImageIcon(LoginScreen.class.getResource("/Icons/Key-icon.png")));
		lblPassword.setBounds(36, 51, 89, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(135, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 51, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnOk = new JButton("LogIn");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("Admin")&& passwordField.getText().equals("1234")){
					
					new MainFrame3(dbFromFile);
					setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(contentPane, "Wrong Password OR Username!", "Error!", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnOk.setIcon(new ImageIcon(LoginScreen.class.getResource("/Icons/Accept-icon.png")));
		btnOk.setBounds(132, 106, 89, 23);
		contentPane.add(btnOk);
		this.getRootPane().setDefaultButton(btnOk);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon(LoginScreen.class.getResource("/Icons/Lock-icon.png")));
		lblNewLabel.setBounds(58, 69, 50, 76);
		contentPane.add(lblNewLabel);
		this.setVisible(true);
	}
}
