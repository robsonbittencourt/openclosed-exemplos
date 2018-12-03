package open.closed.enumm.desconto;

public class DescontoIngressoNulo implements DescontoIngresso {

    @Override
    public double percentualDesconto() {
        return 0;
    }

}
