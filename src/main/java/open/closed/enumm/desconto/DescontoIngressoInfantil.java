package open.closed.enumm.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

import static open.closed.enumm.ingresso.CategoriaCliente.INFANTIL;

public class DescontoIngressoInfantil implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.5;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(INFANTIL);
    }

}
