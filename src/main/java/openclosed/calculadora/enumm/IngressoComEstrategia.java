package openclosed.calculadora.enumm;

import openclosed.ingresso.CategoriaCliente;

public class IngressoComEstrategia {

    private final double valor;
    private final CategoriaClienteComEstrategia categoriaCliente;

    public IngressoComEstrategia(int valor, CategoriaClienteComEstrategia categoriaCliente) {
        this.valor = valor;
        this.categoriaCliente = categoriaCliente;
    }

    public double getValor() {
        return valor;
    }

    public CategoriaClienteComEstrategia getCategoriaCliente() {
        return categoriaCliente;
    }

}
