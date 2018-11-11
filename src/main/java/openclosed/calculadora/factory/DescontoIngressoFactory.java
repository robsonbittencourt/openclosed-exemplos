package openclosed.calculadora.factory;

import openclosed.desconto.*;
import openclosed.ingresso.CategoriaCliente;
import org.springframework.stereotype.Component;

@Component
public class DescontoIngressoFactory {

    public static DescontoIngresso get(CategoriaCliente categoriaCliente) {
        switch (categoriaCliente) {
            case INFANTIL:
                return new DescontoIngressoInfantil();
            case ADULTO:
                return new DescontoIngressoAdulto();
            case IDOSO:
                return new DescontoIngressoIdoso();
            default:
                return new DescontoIngressoNulo();
        }
    }

}
