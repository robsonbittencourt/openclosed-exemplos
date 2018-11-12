package open.closed.spring.desconto;

import open.closed.spring.ingresso.CategoriaCliente;

public interface DescontoIngresso {

    double percentualDesconto();

    boolean accept(CategoriaCliente categoriaCliente);

}
