package SpringMVC.SubProject.model;

public class Supplier {
	private int supplierID;
	private String supplierName;
	private String supplierEmail;
	
	public Supplier() {
		super();
	}

	public Supplier(String supplierName, String supplierEmail) {
		super();
		this.supplierName = supplierName;
		this.supplierEmail = supplierEmail;
	}

	public Supplier(int supplierID, String supplierName, String supplierEmail) {
		super();
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierEmail = supplierEmail;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
}