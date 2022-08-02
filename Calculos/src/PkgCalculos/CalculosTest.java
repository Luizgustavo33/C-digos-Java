package PkgCalculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculosTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void Deveriatestarcalcularmaiorvalor1() {
		assertEquals( 4, Calculos.findMax(new int[] { 2, 1, 5, 6, 4 }));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor2() {
		assertEquals(50, Calculos.findMax(new int[] { 10, 11, 50, 6, 3 }));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor3() {
		assertEquals(16, Calculos.findMax(new int[] { 12, 15, 16, 1,7 }));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor4() {
		assertEquals(27, Calculos.cube(3));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor5() {
		assertEquals(15, Calculos.cube(5));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor6() {
		assertEquals(64, Calculos.cube(4));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor7() {
		assertEquals("asac", Calculos.reverseWord("Casa"));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor8() {
		assertEquals("zilef uoS", Calculos.reverseWord("Sou feliz"));
	}

	@Test
	void Deveriatestarcalcularmaiorvalor9() {
		assertEquals("odut idnerpa ejoH", Calculos.reverseWord("Hoje aprendi tudo"));
	}
}
