package modelo;

import excepciones.ContenidoErroneoException;

public class Celda {
	private String contenido;
	private TipoCampo tipo;
	
	public Celda(TipoCampo type, String cont){
		tipo = type;
		if (!tipo.validarEntrada(cont)){
			throw new ContenidoErroneoException("El Contenido ingresado no es valido");
		}
		contenido = new String(cont);
	}
	
	public void setContenido(String cont){
		if (!tipo.validarEntrada(cont)){
			throw new ContenidoErroneoException("El Contenido ingresado no es valido");
		}
		contenido = new String(cont);
	}
	
	//Devuelve una copia, no la misma referencia, para evitar problemas.
	public String getContenido(){
		return new String(contenido);
	}
	
	/* Los siguientes metodos tendrian que programarse una vez que haya conexion
	 * con la base de datos, o mas bien el DAO */

	//Devuelve true o false segun pudo escribir en la base de datos
	public boolean escribirABD(){
		return false;
	}
}
