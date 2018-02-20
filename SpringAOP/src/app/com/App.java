package app.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App  {

	public static void main(String [] args) {
		
		//Vehicle obj=new Bike();
		//obj.run();
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		/*Vehicle objv=(Vehicle) context.getBean("bike");
		objv.run();
		
		Vehicle objt=(Vehicle) context.getBean("tyre");
		System.out.println(objt);
		*/
		
		Car car= (Car) context.getBean("car");
		System.out.println("Auto "+car);
	
	}
}
