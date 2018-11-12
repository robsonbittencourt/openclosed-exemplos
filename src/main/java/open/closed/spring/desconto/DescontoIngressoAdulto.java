package open.closed.spring.desconto;

import open.closed.spring.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static open.closed.spring.ingresso.CategoriaCliente.ADULTO;

@Component
public class DescontoIngressoAdulto implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.1;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(ADULTO);
    }

}
