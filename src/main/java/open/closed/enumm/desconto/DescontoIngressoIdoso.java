package open.closed.enumm.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

public class DescontoIngressoIdoso implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.3;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(CategoriaCliente.IDOSO);
    }

}
