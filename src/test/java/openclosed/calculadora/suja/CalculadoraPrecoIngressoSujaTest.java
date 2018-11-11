package openclosed.calculadora.suja;

import openclosed.calculadora.suja.CalculadoraPrecoIngressoSuja;
import openclosed.ingresso.Ingresso;
import org.junit.Before;
import org.junit.Test;

import static openclosed.ingresso.CategoriaCliente.*;
import static org.junit.Assert.assertEquals;

public class CalculadoraPrecoIngressoSujaTest {

    private CalculadoraPrecoIngressoSuja calculadora;

    @Before
    public void setUp() {
        calculadora = new CalculadoraPrecoIngressoSuja();
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