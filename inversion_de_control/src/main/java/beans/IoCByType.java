package beans;

public class IoCByType {

	private BeansExample beansExample; 
	
	public void setBeansExample(BeansExample beansExample) {
		this.beansExample = beansExample;
	} 
	
	public void servicio(String value) {
		System.out.println("key -> " + value);
		System.out.println("Value -> " + this.beansExample.servicio());
	}	
	
}
