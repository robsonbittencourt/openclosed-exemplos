package open.closed.suja.calculadora;

import open.closed.suja.ingresso.CategoriaCliente;
import open.closed.suja.ingresso.Ingresso;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraPrecoIngressoSujaTest {

    private CalculadoraPrecoIngressoSuja calculadora;

    @Before
    public void setUp() {
        calculadora = new CalculadoraPrecoIngressoSuja();
    }

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