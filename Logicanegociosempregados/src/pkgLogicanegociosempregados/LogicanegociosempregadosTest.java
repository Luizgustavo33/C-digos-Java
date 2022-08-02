package pkgLogicanegociosempregados;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogicanegociosempregadosTest {

	Empregados empreg = new Empregados();
	Logicanegociosempregados Logicanegociosempregado = new Logicanegociosempregados();

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	void Deveriatestarcalcularcustos() {
		empreg.setnome("alguma coisa");
		empreg.setidade(1);
		empreg.setsalariodomes(1000);
		double custos = Logicanegociosempregado.calcularCustos(empreg);
		assertEquals("Caso 1", 500, custos, 0.0);
	}

	@Test
	void Deveriatestarcalcularcustos1() {
		empreg.setnome("alguma coisa");
		empreg.setidade(1);
		empreg.setsalariodomes(800);
		double custos = Logicanegociosempregado.calcularCustos(empreg);
		assertEquals("Caso 2", 2000, custos, 0.0);
	}

	@Test
	void Deveriatestarcalcularcustos2() {
		empreg.setnome("alguma coisa");
		empreg.setidade(1);
		empreg.setsalariodomes(1000);
		double custos = Logicanegociosempregado.calcularCustos(empreg);
		assertEquals("Caso 3", 1000, custos, 0.0);
	}
}
