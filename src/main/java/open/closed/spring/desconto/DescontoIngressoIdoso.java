package open.closed.spring.desconto;

import open.closed.spring.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

import static open.closed.spring.ingresso.CategoriaCliente.IDOSO;

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
