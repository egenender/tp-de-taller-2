package modelo;

public class CampoTexto extends TipoCampo {
	
	public CampoTexto(boolean perm){
		super(perm);
	}
	
	public CampoTexto(){
		super(true);
	}
	
	@Override
	public boolean validarEntrada(String stream) {
		//Habria que ver si hay que evitar ciertos caracteres especiales
		if (stream.trim().isEmpty() && !permiteVacio()) return false;
		
		
		return true;
	}

}
