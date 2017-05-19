package arrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Test;



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

}
