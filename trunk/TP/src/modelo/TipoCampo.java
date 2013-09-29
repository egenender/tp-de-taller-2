package modelo;

public abstract class TipoCampo {
	
	boolean permVacio;
	
	protected TipoCampo(boolean perm){
		permVacio = perm;
	}
	
	public abstract boolean validarEntrada(String stream);
	
	public boolean permiteVacio(){
		return permVacio;
	}
}
