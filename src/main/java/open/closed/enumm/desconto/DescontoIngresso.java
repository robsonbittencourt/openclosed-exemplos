package open.closed.enumm.desconto;

import open.closed.enumm.ingresso.CategoriaCliente;

public interface DescontoIngresso {

    double percentualDesconto();

    boolean accept(CategoriaCliente categoriaCliente);

}
