

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UniqueTestClass {

	@Test
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	public void testDePruebaDeMaterias() {
		Materia unaMat = new Materia("Algebra");
		assertEquals(unaMat.getNombre(), "Algebra");
	}
}
