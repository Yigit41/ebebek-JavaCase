package patika;

public class Notebook {

	private int id, ram, discount, storage, stock;
	private String name, brandName;
	private double screen, price;

	public Notebook(int id, String name,double price, int discount, int stock, String brandName, int ram, int storage,double screen)
	{
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
		this.name = name;
		this.brandName = brandName;
		this.ram = ram;
		this.storage = storage;
		this.screen = screen;

	}
	
	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getDiscount() {
	        return discount;
	    }

	    public void setDiscount(int discount) {
	        this.discount = discount;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public void setStock(int stockQuantity) {
	        this.stock = stockQuantity;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBrandName() {
	        return brandName;
	    }

	    public void setBrandName(String brandName) {
	        this.brandName = brandName;
	    }

	    public int getRam() {
	        return ram;
	    }

	    public void setRam(int ram) {
	        this.ram = ram;
	    }

	    public int getStorage() {
	        return storage;
	    }

	    public void setStorage(int memorySize) {
	        this.storage = storage;
	    }

	    public double getScreen() {
	        return screen;
	    }

	    public void setScreen(double screenSize) {
	        this.screen = screen;
	    }

}
