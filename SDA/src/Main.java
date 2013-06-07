import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;


public class Main {


	public static void main(String[] args) {

		/*DataBase dbFromFile = new DataBase();

		try {
			FileInputStream fileIn = new FileInputStream("dataz.ser");
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
		
		
		//new MainFrame(dbFromFile);
		//new MainFrame2(dbFromFile);
		//new MainFrame3(dbFromFile);*/
		
		new LoginScreen();
		
	}
}
