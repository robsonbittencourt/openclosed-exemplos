package open.closed.factory.desconto;

import open.closed.factory.ingresso.CategoriaCliente;

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
