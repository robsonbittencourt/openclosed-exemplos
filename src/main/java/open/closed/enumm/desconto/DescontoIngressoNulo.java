package open.closed.enumm.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

public class DescontoIngressoNulo implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return false;
    }

}
