package openclosed.calculadora.enumm;

import openclosed.calculadora.factory.CalculadoraPrecoIngressoFactory;
import openclosed.ingresso.CategoriaCliente;
import openclosed.ingresso.Ingresso;
import org.junit.Before;
import org.junit.Test;

import static openclosed.calculadora.enumm.CategoriaClienteComEstrategia.ADULTO;
import static openclosed.calculadora.enumm.CategoriaClienteComEstrategia.IDOSO;
import static openclosed.calculadora.enumm.CategoriaClienteComEstrategia.INFANTIL;
import static openclosed.ingresso.CategoriaCliente.*;
import static org.junit.Assert.assertEquals;

public class CalculadoraPrecoIngressoEnumTest {

    private CalculadoraPrecoIngressoEnum calculadora;

    @Before
    public void setUp() {
        calculadora = new CalculadoraPrecoIngressoEnum();
    }

    @Test
    public void deveRetornarPrecoDoIngressoInfantil() {
        IngressoComEstrategia ingresso = new IngressoComEstrategia(20, INFANTIL);

        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(10, valorFinal, 0);
    }

    @Test
    public void deveRetornarPrecoDoIngressoAdulto() {
        IngressoComEstrategia ingresso = new IngressoComEstrategia(20, ADULTO);

        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(18, valorFinal, 0);
    }

    @Test
    public void deveRetornarPrecoDoIngressoIdoso() {
        IngressoComEstrategia ingresso = new IngressoComEstrategia(20, IDOSO);

        double valorFinal = calculadora.calcular(ingresso);

        assertEquals(14, valorFinal, 0);
    }

}