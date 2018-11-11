package openclosed.calculadora.spring;

import openclosed.calculadora.spring.CalculadoraPrecoIngressoSpring;
import openclosed.ingresso.Ingresso;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static openclosed.ingresso.CategoriaCliente.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraPrecoIngressoSpringTest {

	@Autowired
	private CalculadoraPrecoIngressoSpring calculadora;

	@Test
	public void deveRetornarPrecoDoIngressoInfantil() {
		Ingresso ingresso = new Ingresso(20, INFANTIL);

		double valorFinal = calculadora.calcular(ingresso);

		assertEquals(10, valorFinal, 0);
	}

	@Test
	public void deveRetornarPrecoDoIngressoAdulto() {
		Ingresso ingresso = new Ingresso(20, ADULTO);

		double valorFinal = calculadora.calcular(ingresso);

		assertEquals(18, valorFinal, 0);
	}

	@Test
	public void deveRetornarPrecoDoIngressoIdoso() {
		Ingresso ingresso = new Ingresso(20, IDOSO);

		double valorFinal = calculadora.calcular(ingresso);

		assertEquals(14, valorFinal, 0);
	}

}
