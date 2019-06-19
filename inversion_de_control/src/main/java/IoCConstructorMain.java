import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.IoCConstructor;
import beans.IocSetter;

public class IoCConstructorMain {

	public static void main(String[] args) {

		// se define el archivo donde esta configurado nuestros beans IoC Spring Bean configuration File
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoC.xml");
		
		IoCConstructor ioCConstructor = null;
				
		//3. getBean con tipo | class retorna una exception cuando hay mas de un bean usandolo
		ioCConstructor = applicationContext.getBean(IoCConstructor.class);
		
		System.out.println(ioCConstructor.servicio());
		
		//se debe cerrar el applicationContext
		((ClassPathXmlApplicationContext) applicationContext).close();
			
		
	}

}
