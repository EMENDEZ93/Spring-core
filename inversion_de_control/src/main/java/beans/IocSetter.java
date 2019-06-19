package beans;

public class IocSetter {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String servicio() {
		return (message == null) ? "No hay un mensaje" : this.message;
	}
	
}
