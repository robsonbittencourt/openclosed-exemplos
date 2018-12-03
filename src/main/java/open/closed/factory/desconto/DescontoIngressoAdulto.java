package open.closed.factory.desconto;

final class DescontoIngressoAdulto implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0.1;
    }

}
