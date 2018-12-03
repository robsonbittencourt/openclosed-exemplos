package open.closed.factory.desconto;

final class DescontoIngressoInfantil implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.5;
    }

}
