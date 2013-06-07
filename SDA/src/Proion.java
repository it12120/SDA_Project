import java.io.Serializable;

import javax.swing.JOptionPane;

public class Proion implements Serializable{

	private String name;
	private String barcode;
	private double price;
	private double posotita;
	private double synolikesPwliseis;

	public Proion(String name, String barcode, double price) {
		this.name = name;
		this.barcode = barcode;
		this.price = price;
	}

	public double getPosotita() {
		return posotita;
	}

	public void setPosotita(double posotita) {
		this.posotita = posotita;
	}

	public Proion(String barcode, double posotita){
		this.barcode = barcode;
		this.posotita = posotita;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSynolikesPwliseis() {
		return synolikesPwliseis;
	}

	public void updatePwliseis(double polish){

		double oldPosotita = posotita;
		if(polish<=oldPosotita){
			setPosotita(oldPosotita-polish);
			synolikesPwliseis += polish;
		}
		else
			JOptionPane.showMessageDialog(null, "Den yparxei ayti i posotita se apothema");

	}

	public String toString()
	{
		return this.barcode + ", Posotita: "+posotita;
	}

	public boolean equals(Object o){
		if(o instanceof Proion){
			Proion other = (Proion)o;
			return this.barcode.equals(other.barcode);
		}
		else
			return false;
	}

}
