package open.closed.factory.desconto;

final class DescontoIngressoNulo implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0;
    }

}
