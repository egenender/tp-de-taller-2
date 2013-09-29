package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Celda;

public class Fila {
	private ArrayList<Celda> celdas;
	
	
	//Recibe un arrayList de strings con los valores ya validados
	//Y crea celdas con los contenidos validados de las mismas.
	public Fila(ArrayList <TipoCampo> campos,ArrayList<String> cadenas){
		celdas = new ArrayList<Celda>();
		
		if (campos.size() != cadenas.size()){
			//Lanzo Excepcion
		}
		
		Iterator<String> iter = cadenas.iterator();
		Iterator<TipoCampo> iterCampo = campos.iterator();
		while (iter.hasNext() && iterCampo.hasNext()){
			String contenido = iter.next();
			TipoCampo campo = iterCampo.next();
			Celda celda_nueva = new Celda(campo,contenido);
			celdas.add(celda_nueva);
		}
	}
	
	public boolean modificarCelda(int numCelda,TipoCampo campo,String nuevo_contenido){
		if (numCelda >= celdas.size()) return false;
		
		celdas.remove(numCelda);
		celdas.add(numCelda, new Celda(campo, nuevo_contenido));
		return true;
	}
	
	public boolean modificarCelda(int numCelda,TipoCampo campo){
		return modificarCelda(numCelda, campo, "");
	}
	
	//Devuelve una copia de los contenidos.
	public ArrayList<String> obtenerCeldas(){
		ArrayList<String> contenidos = new ArrayList<String>();
		
		Iterator<Celda> iter = celdas.iterator();
		while (iter.hasNext()){
			Celda actual = iter.next();
			String contenido = actual.getContenido();
			contenidos.add(contenido);
		}
		
		return contenidos;
	}
	
	/* Los siguientes metodos habra que implementarlos bien cuando haya una conexion
	 * con el DAO */
	
	public boolean escribirABD(){
		//Modelo de escritura:
		Iterator<Celda> iter = celdas.iterator();
		boolean ok = true;
		while (iter.hasNext() && ok){
			ok &= iter.next().escribirABD();
		}
		
		return ok;
	}
}
