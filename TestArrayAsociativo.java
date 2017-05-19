package arrayAsociativo;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;




public class TestArrayAsociativo {

	@Test
	public void testArrayVacio() {
		ArrayAsociativo aVacio = new ArrayAsociativo();
		assertTrue (aVacio.size() == 0);
	}
	
	@Test
	public void testArrayNoVacio2Elementos(){
		String[] keys = {"clave1", "clave2"};
		String[] values ={"valor1", "valor 2"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		assertTrue (array.size() == 2);
		
	}
	
	@Test
	public void testArrayNoVacio3Elementos(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor 2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		assertTrue (array.size() == 3);
	}
	
	@Test
	public void testArrayNoVacio(){
		Random rnd = new Random();
		String cad = "";
		int num = rnd.nextInt(100)+1;
		String [] keys = new String [num];
		String [] values = new String [num];
		for (int i=0; i<num; i++){
			keys[i] = cad;
			values[i] = cad;
		}
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		assertTrue (array.size() == num);
	}
	
	
	@Test (expected = NoSuchElementException.class)
	public void testBuscarClaveVacio(){
		ArrayAsociativo aVacio = new ArrayAsociativo();
		aVacio.get("clave1");
	}
	
	@Test
	public void testBuscarClaveExistente(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		assertTrue (array.get("clave2") == "valor2");
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testBuscarClaveNoExistente(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		array.get("clave4");
	}
	
	@Test
	public void testInsertarEnArrayVacio(){
		ArrayAsociativo array = new ArrayAsociativo ();
		array.put("clave1", "valor1");
		assertTrue (array.get("clave1") == "valor1");
	}
	
	@Test
	public void testInsertarEnArrayNoVacio(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		array.put("clave4", "valor4");
		assertTrue (array.get("clave4") == "valor4");
	}
	
	@Test
	public void testInsertarExistenteEnArrayNoVacio(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		array.put("clave3", "nuevo3");
		assertTrue (array.get("clave3") == "nuevo3");
	}
	
	@Test
	public void testGetOrElseVacio(){
		ArrayAsociativo array = new ArrayAsociativo ();
		assertTrue (array.getOrElse("clave1", "hola") == "hola");
	}

	@Test
	public void testGetOrElseExiste(){
		String[] keys = {"clave1", "clave2", "clave3"};
		String[] values ={"valor1", "valor2", "valor3"};
		ArrayAsociativo array = new ArrayAsociativo (keys, values);
		assertTrue (array.getOrElse("clave3", "hola") == "valor3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
