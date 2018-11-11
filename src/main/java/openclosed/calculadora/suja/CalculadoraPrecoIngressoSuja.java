package openclosed.calculadora.suja;

import openclosed.ingresso.CategoriaCliente;
import openclosed.ingresso.Ingresso;

import static openclosed.ingresso.CategoriaCliente.ADULTO;
import static openclosed.ingresso.CategoriaCliente.IDOSO;
import static openclosed.ingresso.CategoriaCliente.INFANTIL;

public class CalculadoraPrecoIngressoSuja {

    public double calcular(Ingresso ingresso) {
        if (ingresso.getCategoriaCliente().equals(INFANTIL)) {
            double valorDesconto = ingresso.getValor() * 0.5;

            return ingresso.getValor() - valorDesconto;
        }

        if (ingresso.getCategoriaCliente().equals(ADULTO)) {
            double valorDesconto = ingresso.getValor() * 0.1;

            return ingresso.getValor() - valorDesconto;
        }

        if (ingresso.getCategoriaCliente().equals(IDOSO)) {
            double valorDesconto = ingresso.getValor() * 0.3;

            return ingresso.getValor() - valorDesconto;
        }

        return 0;
    }
}
