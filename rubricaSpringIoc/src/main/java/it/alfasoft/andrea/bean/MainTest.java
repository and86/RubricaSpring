package it.alfasoft.andrea.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		   Rubrica r=(Rubrica) context.getBean("rubrica");
		   
		   r.stampaVoci();
		   
	}

}
