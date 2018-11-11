package openclosed.desconto;

import openclosed.ingresso.CategoriaCliente;

public interface DescontoIngresso {

    double percentualDesconto();

    boolean accept(CategoriaCliente categoriaCliente);

}
