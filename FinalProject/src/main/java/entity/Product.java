package entity;

public class Product {

	private int id;
	private String name;
	private int price;
	private String imgName;
	private boolean isNew;
	private int quantity;
	private String description;
	
	
	

	public Product(int id, String name, int price, String imgName, boolean isNew, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgName = imgName;
		this.isNew = isNew;
		this.quantity = quantity;
		this.description = description;
	}

	public Product() {
	}

	public Product(int id, String name, int price, String imgName, boolean isNew) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgName = imgName;
		this.isNew = isNew;
	}

	public Product(int id, String name, int price, String imgName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgName = imgName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
