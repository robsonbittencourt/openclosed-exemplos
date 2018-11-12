package open.closed.factory.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

import static open.closed.enumm.ingresso.CategoriaCliente.ADULTO;

final class DescontoIngressoAdulto implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.1;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(ADULTO);
    }

}
