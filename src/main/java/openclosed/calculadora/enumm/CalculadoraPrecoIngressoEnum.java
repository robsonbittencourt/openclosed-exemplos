package openclosed.calculadora.enumm;

import openclosed.desconto.DescontoIngresso;

public class CalculadoraPrecoIngressoEnum  {

    public double calcular(IngressoComEstrategia ingresso) {
        DescontoIngresso descontoIngresso = ingresso.getCategoriaCliente().getDescontoIngresso();

        double valorDesconto = ingresso.getValor() * descontoIngresso.percentualDesconto();

        return ingresso.getValor() - valorDesconto;
    }

}
