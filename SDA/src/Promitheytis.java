import java.io.Serializable;


public class Promitheytis implements Serializable{
	
	private String epwnymia;
	private String afm;
	private String address;
	private String zipCode;
	private String phone;
	private String bankIBAN;
	private double debt;
	
	public Promitheytis(String epwnymia, String afm, String address, String zipCode, String phone, String bankIBAN) {
		
		this.epwnymia = epwnymia;
		this.afm = afm;
		this.address = address;
		this.zipCode = zipCode;
		this.phone = phone;
		this.bankIBAN = bankIBAN;
		this.debt = 0;
		
	}
	
	public void pay(double ammount){
		
		this.debt -= ammount;
		
	}
	
 	
	public void buy(double ammount){
		
		this.debt += ammount;
		
	}

	public String getEpwnymia() {
		return epwnymia;
	}

	public void setEpwnymia(String epwnymia) {
		this.epwnymia = epwnymia;
	}

	public String getAfm() {
		return afm;
	}

	public void setAfm(String afm) {
		this.afm = afm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBankIBAN() {
		return bankIBAN;
	}

	public void setBankIBAN(String bankIBAN) {
		this.bankIBAN = bankIBAN;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}
	
	
	
	
	

}
