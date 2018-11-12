package open.closed.enumm.calculadora;

import open.closed.enumm.desconto.DescontoIngresso;
import open.closed.enumm.ingresso.Ingresso;

public class CalculadoraPrecoIngressoEnum  {

    public double calcular(Ingresso ingresso) {
        DescontoIngresso descontoIngresso = ingresso.getCategoriaCliente().getDescontoIngresso();

        double valorDesconto = ingresso.getValor() * descontoIngresso.percentualDesconto();

        return ingresso.getValor() - valorDesconto;
    }

}
