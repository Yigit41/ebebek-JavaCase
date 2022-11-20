package patika;

public class Filter {
	private int id, ram, discount, storage, stock,battery;
	private String name, brandName,color;
	private double screen, price;


	public Filter(int id, String name,double price, int discount, int stock, String brandName, int ram, int storage,double screen,int battery,String color)
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
		this.battery = battery;
		this.color = color;

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

	    public void setStorage(int Storage) {
	        this.storage = storage;
	    }

	    public double getScreen() {
	        return screen;
	    }

	    public void setScreen(double screenSize) {
	        this.screen = screen;
	    }
	    public double getBattery() {
	        return battery;
	    }

	    public void setBattery(double Battery) {
	        this.battery = battery;
	    }
	    public String getColor() {
	        return color;
	    }

	    public void setColor(double Color) {
	        this.color = color;
	    }
}
