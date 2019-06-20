import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeansExample;
import beans.IoCByType;

public class IoCAutomaticaBytype {

	public static void main(String[] args) {

		// se define el archivo donde esta configurado nuestros beans IoC Spring Bean configuration File
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoC.xml");
				
		BeansExample beansExample = null;

		beansExample = applicationContext.getBean(BeansExample.class);
		
		System.out.println(beansExample.servicio());
		
		IoCByType ioCByType = null;
		
		ioCByType = applicationContext.getBean(IoCByType.class);
		
		ioCByType.servicio("valores");
		
		//se debe cerrar el applicationContext
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
