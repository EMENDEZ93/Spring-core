import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.IocSetter;

public class IoCSetterMain {

	public static void main(String[] args) {

		// se define el archivo donde esta configurado nuestros beans IoC Spring Bean configuration File
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoC.xml");
		
		IocSetter iocSetter = null;
				
		//3. getBean con tipo | class retorna una exception cuando hay mas de un bean usandolo
		iocSetter = applicationContext.getBean(IocSetter.class);
		
		System.out.println(iocSetter.servicio());
		
		//se debe cerrar el applicationContext
		((ClassPathXmlApplicationContext) applicationContext).close();
		
		
	}

}
