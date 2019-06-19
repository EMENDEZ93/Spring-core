package beans;

public class IoCConstructor {

	private String message;
	
	public IoCConstructor(String message) {
		this.message = message;
	}
	
	public String servicio() {
		return (message == null) ? "No tiene un mensaje": this.message;
	}
	
}
