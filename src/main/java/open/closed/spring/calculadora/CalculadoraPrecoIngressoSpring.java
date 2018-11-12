package open.closed.spring.calculadora;

import open.closed.spring.desconto.DescontoIngresso;
import open.closed.spring.desconto.DescontoIngressoNulo;
import open.closed.spring.ingresso.Ingresso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculadoraPrecoIngressoSpring {

    @Autowired
    private List<DescontoIngresso> descontosIngresso;

    public double calcular(Ingresso ingresso) {
        double valorDesconto = ingresso.getValor() * getDesconto(ingresso);

        return ingresso.getValor() - valorDesconto;
    }

    public double getDesconto(Ingresso ingresso) {
        return descontosIngresso.stream()
                .filter(d -> d.accept(ingresso.getCategoriaCliente()))
                .findFirst()
                .orElse(new DescontoIngressoNulo())
                .percentualDesconto();
    }

}
