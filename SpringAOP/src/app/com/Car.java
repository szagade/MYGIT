package app.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Tyre tyre;

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	
	
	
	public void run() {
		System.out.println("Carke Drive");
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}
	
	

}
