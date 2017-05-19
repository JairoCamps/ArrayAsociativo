package arrayAsociativo;

import java.util.NoSuchElementException;

public class ArrayAsociativo {
	//Clases internas
	private class Nodo{
		private String clave;
		private String valor;
		private Nodo sig; //siguiente nodo
		
		public Nodo(String c, String v, Nodo s){
			clave = c;
			valor = v;
			sig = s;
		}
	}
	
	//Variables de instancia
	private Nodo primero;
	
	
	//Constructores
	public ArrayAsociativo(){
		primero = null;
	}
	
	public ArrayAsociativo(String[] claves, String[] valores){
		this();
		if (claves.length > 0){
			primero = new Nodo(claves[0], valores[0],null);
			for (int i = 1; i< claves.length; i++){
				Nodo nuevo = new Nodo(claves[i], valores[i],primero);
				primero = nuevo;
			}
		}
	}
	
	//Métodos de instancia
	
	public int size (){
		if (primero == null){
			return 0;
		}else{
			Nodo act = primero;
			int cont = 0;
			while (act != null){
				cont++;
				act = act.sig;
			}
			return cont;
		}
	}
	
	public String get(String clave){
		if (primero == null){
			throw new NoSuchElementException();
		}else{
			Nodo act = primero;
			boolean encontrado = false;
			String valor = null;
			while (act != null && !encontrado){
				if (act.clave.equals(clave)){
					encontrado = true;
					valor = act.valor;
				}
				act = act.sig;
			}
			if (valor == null){
				throw new NoSuchElementException();
			}else{
				return valor;
			}
		}
	}
	
	public void put(String clave, String valor){
		
	}
	
	
}
