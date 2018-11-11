package openclosed.desconto;

import openclosed.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static openclosed.ingresso.CategoriaCliente.ADULTO;

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
