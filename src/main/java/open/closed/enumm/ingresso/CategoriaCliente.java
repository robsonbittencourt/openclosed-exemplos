package open.closed.enumm.ingresso;

import open.closed.enumm.desconto.DescontoIngressoInfantil;
import open.closed.enumm.desconto.DescontoIngresso;
import open.closed.enumm.desconto.DescontoIngressoAdulto;
import open.closed.enumm.desconto.DescontoIngressoIdoso;

public enum CategoriaCliente {

    INFANTIL(new DescontoIngressoInfantil()),
    ADULTO(new DescontoIngressoAdulto()),
    IDOSO(new DescontoIngressoIdoso());

    private DescontoIngresso descontoIngresso;

    CategoriaCliente(DescontoIngresso descontoIngresso) {
        this.descontoIngresso = descontoIngresso;
    }

    public DescontoIngresso getDescontoIngresso() {
        return descontoIngresso;
    }

}
