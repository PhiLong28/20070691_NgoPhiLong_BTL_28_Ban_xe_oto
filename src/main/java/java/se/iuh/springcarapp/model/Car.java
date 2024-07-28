package java.se.iuh.springcarapp.model;

public class Car {
	String carID;
	String carName;
	double price;
	int modelYear;
	String carDescription;
	String imageURL;
	
	public Car() {
		super();
	}
	
	public Car(String carID, String carName, double price, int modelYear, String carDescription, String imageURL) {
		super();
		this.carID = carID;
		this.carName = carName;
		this.price = price;
		this.modelYear = modelYear;
		this.carDescription = carDescription;
		this.imageURL = imageURL;
	}
	
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getCarDescription() {
		return carDescription;
	}
	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
}
