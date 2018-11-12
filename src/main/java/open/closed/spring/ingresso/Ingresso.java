package open.closed.spring.ingresso;

public class Ingresso {

    private final double valor;
    private final CategoriaCliente categoriaCliente;

    public Ingresso(int valor, CategoriaCliente categoriaCliente) {
        this.valor = valor;
        this.categoriaCliente = categoriaCliente;
    }

    public double getValor() {
        return valor;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }

}
