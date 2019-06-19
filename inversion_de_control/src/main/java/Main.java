

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeansExample;

public class Main {

	public static void main(String[] args) {

		// se define el archivo donde esta configurado nuestros beans IoC Spring Bean configuration File
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoC.xml");
		
		BeansExample beansExample = null;
		
		//1. getBean con ID y Casting
		//beansExample = (BeansExample) applicationContext.getBean("beans_example");

		//2. getBean con ID y Tipo | class
		//beansExample = applicationContext.getBean("beans_example", BeansExample.class);
		
		//3. getBean con tipo | class retorna una exception cuando hay mas de un bean usandolo
		beansExample = applicationContext.getBean(BeansExample.class);
		
		System.out.println(beansExample.servicio());
		
		//se debe cerrar el applicationContext
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
