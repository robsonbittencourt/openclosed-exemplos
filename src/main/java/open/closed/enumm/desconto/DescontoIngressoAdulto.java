package open.closed.enumm.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

public class DescontoIngressoAdulto implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.1;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(CategoriaCliente.ADULTO);
    }

}
