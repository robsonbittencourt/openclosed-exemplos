package open.closed.factory.calculadora;

import open.closed.factory.desconto.DescontoIngresso;
import open.closed.factory.desconto.DescontoIngressoFactory;
import open.closed.factory.ingresso.Ingresso;

public class CalculadoraPrecoIngressoFactory {

    public double calcular(Ingresso ingresso) {
        DescontoIngresso descontoIngresso = DescontoIngressoFactory.get(ingresso.getCategoriaCliente());

        double valorDesconto = ingresso.getValor() * descontoIngresso.percentualDesconto();

        return ingresso.getValor() - valorDesconto;
    }

}
