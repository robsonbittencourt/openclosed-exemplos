package open.closed.factory.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

final class DescontoIngressoNulo implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return false;
    }

}
