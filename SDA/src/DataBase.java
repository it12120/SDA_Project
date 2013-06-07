import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;


public class DataBase implements Serializable{

	private ArrayList<Pelatis> pelatesList;
	private ArrayList<Promitheytis> promitheytesList;
	//private ArrayList<Proion> proiontaList;
	private LinkedHashSet<Proion> proiontaSet;

	public DataBase() {

		this.pelatesList = new ArrayList<Pelatis>();
		this.promitheytesList = new ArrayList<Promitheytis>();
		//this.proiontaList = new ArrayList<Proion>();
		this.proiontaSet = new LinkedHashSet<Proion>();

	}

	public void addPelatis(Pelatis pel){
		this.pelatesList.add(pel);
	}

	public void addPromitheytis(Promitheytis pro){
		this.promitheytesList.add(pro);
	}

	
	public void addProion2(Proion pr){
		this.proiontaSet.add(pr);
	}

	public void removeProion2(Proion pr){
		this.proiontaSet.remove(pr);
	}


	public ArrayList<Pelatis> getPelatesList() {
		return pelatesList;
	}


	public void setPelatesList(ArrayList<Pelatis> pelatesList) {
		this.pelatesList = pelatesList;
	}


	public ArrayList<Promitheytis> getPromitheytesList() {
		return promitheytesList;
	}


	public void setPromitheytesList(ArrayList<Promitheytis> promitheytesList) {
		this.promitheytesList = promitheytesList;
	}

	public void serializing() {
		try {
			FileOutputStream fileOut = new FileOutputStream("DB.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		finally {
			System.out.println("DataBase Updated...");
		}
	}

	public LinkedHashSet<Proion> getProiontaSet() {
		return proiontaSet;
	}
	
	/*public DataBase deserializing() {
		DataBase db = new DataBase();

		try {
			FileInputStream fileIn = new FileInputStream("dataz.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			db = (DataBase) in.readObject();
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
			System.out.println("De-Serialization Attempted...");
			return db;
		}*/
}