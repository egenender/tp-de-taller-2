package modelo;

public class CampoNumerico extends TipoCampo {
	
	public CampoNumerico(boolean perm){
		super(perm);
	}
	
	public CampoNumerico(){
		super(true);
	}
	
	@Override
	public boolean validarEntrada(String stream) {
		if (stream.trim().isEmpty()  && permiteVacio())
			return true;
		
		try{
			Integer.parseInt(stream);
			return true;
		}catch (NumberFormatException e){
			return false;
		}
	}

}
