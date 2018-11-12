package open.closed.spring.desconto;

import open.closed.spring.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static open.closed.spring.ingresso.CategoriaCliente.INFANTIL;

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
