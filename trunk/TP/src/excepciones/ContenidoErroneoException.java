package excepciones;

public class ContenidoErroneoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;//un warning pide esto
	
	public ContenidoErroneoException(String mensaje){
		super(mensaje);
	}
}
