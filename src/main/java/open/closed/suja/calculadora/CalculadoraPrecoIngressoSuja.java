package open.closed.suja.calculadora;

import open.closed.suja.ingresso.CategoriaCliente;
import open.closed.suja.ingresso.Ingresso;

public class CalculadoraPrecoIngressoSuja {

    public double calcular(Ingresso ingresso) {
        if (ingresso.getCategoriaCliente().equals(CategoriaCliente.INFANTIL)) {
            double valorDesconto = ingresso.getValor() * 0.5;

            return ingresso.getValor() - valorDesconto;
        }

        if (ingresso.getCategoriaCliente().equals(CategoriaCliente.ADULTO)) {
            double valorDesconto = ingresso.getValor() * 0.1;

            return ingresso.getValor() - valorDesconto;
        }

        if (ingresso.getCategoriaCliente().equals(CategoriaCliente.IDOSO)) {
            double valorDesconto = ingresso.getValor() * 0.3;

            return ingresso.getValor() - valorDesconto;
        }

        return 0;
    }
}
