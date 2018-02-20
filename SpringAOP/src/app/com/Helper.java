package app.com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Helper {

	@Before("execution()public String toString()")
	public void show() {
		System.out.println("Show called");
	}
}
