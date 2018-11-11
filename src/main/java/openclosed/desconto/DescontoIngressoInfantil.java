package openclosed.desconto;

import openclosed.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static openclosed.ingresso.CategoriaCliente.INFANTIL;

@Component
public class DescontoIngressoInfantil implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.5;
    }

    @Override
    public boolean accept(CategoriaCliente categoriaCliente) {
        return categoriaCliente.equals(INFANTIL);
    }

}
