package openclosed.calculadora.enumm;

import openclosed.desconto.DescontoIngresso;
import openclosed.desconto.DescontoIngressoAdulto;
import openclosed.desconto.DescontoIngressoIdoso;
import openclosed.desconto.DescontoIngressoInfantil;

public enum CategoriaClienteComEstrategia {

    INFANTIL(new DescontoIngressoInfantil()),
    ADULTO(new DescontoIngressoAdulto()),
    IDOSO(new DescontoIngressoIdoso());

    private DescontoIngresso descontoIngresso;

    CategoriaClienteComEstrategia(DescontoIngresso descontoIngresso) {
        this.descontoIngresso = descontoIngresso;
    }

    public DescontoIngresso getDescontoIngresso() {
        return descontoIngresso;
    }
}
