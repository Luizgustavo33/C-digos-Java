package pkgIMC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IMCTest {

	IMC imc;
	@BeforeEach
	void setUp() throws Exception {
		imc = new IMC();
	}
//IMC
	@Test
	void testIMCcaAbaixodopeso() {
		assertTrue(imc.IMCcal(70, 1.70) < 20  );
	}
	@Test
	void testIMCcalPesoNormal() {
		assertTrue(imc.IMCcal(70, 1.70) <= 25 && imc.IMCcal(70, 1.70) >= 20 );
	}
	@Test
	void testIMCcalSobrePeso() {
		assertTrue(imc.IMCcal(95, 1.80) <= 30 && imc.IMCcal(95, 1.80) >= 26 );
	}
	@Test
	void testIMCcalObeso() {
		assertTrue(imc.IMCcal(100, 1.70) <= 40 && imc.IMCcal(100, 1.70) >= 31 );
	}
	@Test
	void testIMCcalObesomorbido() {
		assertTrue(imc.IMCcal(150, 1.70) > 40  );
	}
//Peso ideal
	@Test
	void testPesokids() {	
		assertEquals(17, imc.Pesokids(4), 0.0  );
	}

	@Test
	void testPesoAdulto() {
		assertEquals(68.04, imc.PesoAdultoM(1.80), 0.0  );}
	@Test
		void testPesoAdulto1() {
		assertEquals(71.28, imc.PesoAdultoH(1.80), 0.0  );
	}

	@Test
	void testPesoidosoM() {
		assertEquals(85.86, imc.PesoidosoM(1.80, 66), 0.0  );}
	@Test
	void testPesoidosoM1() {
		assertEquals(85.212, imc.PesoidosoM(1.80, 71), 0.0  );}
	@Test
	void testPesoidosoM2() {
		assertEquals(84.56400000000001, imc.PesoidosoM(1.80, 76), 0.0  );}
	
	@Test
	void testPesoidosoM3() {
		assertEquals(82.62, imc.PesoidosoM(1.80, 82), 0.0  );}
	
	@Test
	void testPesoidosoM4() {
		assertEquals(76.46400000000001, imc.PesoidosoM(1.80, 90), 0.0  );}

	@Test
	void testPesoidosoH() {
		assertEquals(78.73200000000001	, imc.PesoidosoH(1.80, 65), 0.0  );}
	@Test
	void testPesoidosoH1() {
		assertEquals(81.32400000000001, imc.PesoidosoH(1.80, 71), 0.0  );}
	@Test
	void testPesoidosoH2() {
		assertEquals(77.436, imc.PesoidosoH(1.80, 76), 0.0  );}
	@Test
	void testPesoidosoH3() {
		assertEquals(76.788, imc.PesoidosoH(1.80, 82), 0.0  );}
	@Test
	void testPesoidosoH4() {
		assertEquals(74.84400000000001, imc.PesoidosoH(1.80, 90), 0.0  );}
	

}
