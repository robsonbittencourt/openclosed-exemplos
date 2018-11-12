package open.closed.spring.calculadora;

import open.closed.spring.ingresso.CategoriaCliente;
import open.closed.spring.ingresso.Ingresso;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraPrecoIngressoSpringTest {

    @Autowired
    private CalculadoraPrecoIngressoSpring calculadora;

    @Test
    public void deveRetornarPrecoDoIngressoInfantil() {
        Ingresso ingresso = new Ingresso(20, CategoriaCliente.INFANTIL);
        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(10, valorFinal, 0);
    }

    @Test
    public void deveRetornarPrecoDoIngressoAdulto() {
        Ingresso ingresso = new Ingresso(20, CategoriaCliente.ADULTO);

        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(18, valorFinal, 0);
    }

    @Test
    public void deveRetornarPrecoDoIngressoIdoso() {
        Ingresso ingresso = new Ingresso(20, CategoriaCliente.IDOSO);

        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(14, valorFinal, 0);
    }

}
