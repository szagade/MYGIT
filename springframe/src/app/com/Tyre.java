package app.com;

import org.springframework.stereotype.Component;

@Component
public class Tyre implements Vehicle {
	
	public String brand;

	/*
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
*/
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Its working";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	

}
