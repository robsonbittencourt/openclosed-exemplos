package openclosed.calculadora.spring;

import openclosed.desconto.DescontoIngresso;
import openclosed.desconto.DescontoIngressoNulo;
import openclosed.ingresso.Ingresso;
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
