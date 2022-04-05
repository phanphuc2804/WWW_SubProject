package SpringMVC.SubProject.model;

public class Product {
	private int productID;
	private String productName;
	private String produtInfo;
	private float price;
	private int quantity;
	private String supplierId;
	
	public Product() {
		super();
	}

	public Product(String productName, String produtInfo, float price, int quantity, String supplierId) {
		super();
		this.productName = productName;
		this.produtInfo = produtInfo;
		this.price = price;
		this.quantity = quantity;
		this.supplierId = supplierId;
	}

	public Product(int productID, String productName, String produtInfo, float price, int quantity, String supplierId) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.produtInfo = produtInfo;
		this.price = price;
		this.quantity = quantity;
		this.supplierId = supplierId;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProdutInfo() {
		return produtInfo;
	}

	public void setProdutInfo(String produtInfo) {
		this.produtInfo = produtInfo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", produtInfo=" + produtInfo
				+ ", price=" + price + ", quantity=" + quantity + ", supplierId=" + supplierId + "]";
	}
}