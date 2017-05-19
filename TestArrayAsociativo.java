package arrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestArrayAsociativo {

	@Test
	public void testArrayVacio() {
		ArrayAsociativo aVacio = new ArrayAsociativo();
		assertTrue (aVacio.size() == 0);
	}

}
