import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramaTest {

	@Test
	public void anagramaIncorrecto() {
		Anagrama a = new Anagrama("lelo", "lila");
		assertFalse(a.CadenasSinConsola());
	}
	
	@Test
	public void anagramaCorrecto() {
		Anagrama a = new Anagrama("jajaje", "aaejjj");
		assertTrue(a.CadenasSinConsola());
	}
	
	@Test
	public void anagramaInCorrectoLongitud() {
		Anagrama a = new Anagrama("Shakespeare", "PedroSanche");
		assertFalse(a.CadenasSinConsola());
	}
}