package openclosed.calculadora.factory;

import openclosed.desconto.DescontoIngresso;
import openclosed.ingresso.Ingresso;

public class CalculadoraPrecoIngressoFactory {

    public double calcular(Ingresso ingresso) {
        DescontoIngresso descontoIngresso = DescontoIngressoFactory.get(ingresso.getCategoriaCliente());

        double valorDesconto = ingresso.getValor() * descontoIngresso.percentualDesconto();

        return ingresso.getValor() - valorDesconto;
    }

}
