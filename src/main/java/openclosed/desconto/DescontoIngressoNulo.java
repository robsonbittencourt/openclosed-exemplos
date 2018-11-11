package openclosed.desconto;

import openclosed.ingresso.CategoriaCliente;
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
