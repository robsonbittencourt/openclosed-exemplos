package open.closed.spring.desconto;

import open.closed.spring.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

@Component
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
