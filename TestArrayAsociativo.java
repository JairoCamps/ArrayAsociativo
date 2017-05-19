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

}