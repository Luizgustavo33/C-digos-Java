package pkgIMC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GastoEnerTest {
	GastoEner gast;

	@BeforeEach
	void setUp() throws Exception {
		gast = new GastoEner();

	}

	@Test
	void testCalcularTBMM() {
		assertEquals(1587.8, gast.CalcularTBM(12, 69, "Mulher"));
	}
	@Test
	void testCalcularTBMM1() {
		assertEquals(1510.3, gast.CalcularTBM(25, 69, "Mulher"));
	}
	@Test
	void testCalcularTBMM2() {
		assertEquals(1429.3, gast.CalcularTBM(31, 69, "Mulher"));
	}
	@Test
	void testCalcularTBMM3() {
		assertEquals(1320.5, gast.CalcularTBM(68, 69, "Mulher"));
	}
	@Test
	void testCalcularTBMH() {
		assertEquals(1858.5, gast.CalcularTBM(12, 69, "Homem"));
	}
	@Test
	void testCalcularTBMH1() {
		assertEquals(1734.7, gast.CalcularTBM(25, 69, "Homem"));
	}
	@Test
	void testCalcularTBMH2() {	
		assertEquals(1479.3, gast.CalcularTBM(31, 69, "Homem"));
	}
	@Test
	void testCalcularTBMH3() {
		assertEquals(1418.5, gast.CalcularTBM(68, 69, "Homem"));
	
	}
	@Test
	void CalcularNDE1() {
		assertEquals(1715.1599999999999, gast.CalcularNDE(1429.3, 1));}
	@Test
	void CalcularNDE2() {
		assertEquals(1858.09, gast.CalcularNDE(1429.3, 2));}
	@Test
	void CalcularNDE3() {
		assertEquals(2072.4849999999997, gast.CalcularNDE(1429.3, 3));}
	@Test
	void CalcularNDE4() {
		assertEquals(2143.95, gast.CalcularNDE(1429.3, 4));}
	@Test
	void CalcularNDE5() {
		assertEquals(2429.81, gast.CalcularNDE(1429.3, 5));}
	@Test
	void CalcularNDE6() {
		assertEquals(2001.0199999999998, gast.CalcularNDE(1429.3, 6));}
	@Test
	void CalcularNDE7() {
		assertEquals(2143.95, gast.CalcularNDE(1429.3, 7));}
	@Test
	void CalcularNDE8() {
		assertEquals(2286.88, gast.CalcularNDE(1429.3, 8));}
	@Test
	void CalcularNDE9() {
		assertEquals(2572.74, gast.CalcularNDE(1429.3, 9));}
	
	
	
	


}
