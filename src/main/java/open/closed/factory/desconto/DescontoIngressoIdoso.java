package open.closed.factory.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

import static open.closed.enumm.ingresso.CategoriaCliente.IDOSO;

final class DescontoIngressoIdoso implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.3;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(IDOSO);
    }

}
