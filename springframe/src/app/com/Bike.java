package app.com;

import org.springframework.stereotype.Component;

@Component
public  class Bike implements Vehicle{
	
	public void run() {
		System.out.println("Bike ride");
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}

}
