package open.closed.enumm.calculadora;

import open.closed.enumm.ingresso.Ingresso;
import org.junit.Before;
import org.junit.Test;

import static open.closed.enumm.ingresso.CategoriaCliente.ADULTO;
import static open.closed.enumm.ingresso.CategoriaCliente.IDOSO;
import static open.closed.enumm.ingresso.CategoriaCliente.INFANTIL;
import static org.junit.Assert.*;

public class CalculadoraPrecoIngressoEnumTest {

    private CalculadoraPrecoIngressoEnum calculadora;

    @Before
    public void setUp() {
        calculadora = new CalculadoraPrecoIngressoEnum();
    }

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