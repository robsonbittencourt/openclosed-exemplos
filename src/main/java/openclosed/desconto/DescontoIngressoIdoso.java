package openclosed.desconto;

import openclosed.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static openclosed.ingresso.CategoriaCliente.IDOSO;

@Component
public class DescontoIngressoIdoso implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.3;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(IDOSO);
    }

}
