package solid;

public class Pagamento {

    private double valor;
    private MeioDePagamento boleto;

    public Pagamento(double valor, MeioDePagamento boleto) {
        this.valor = valor;
        this.boleto = boleto;
    }

    public void add(Pagamento pagamento) {
    }
}
