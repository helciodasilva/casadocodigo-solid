package solid;

import java.util.List;

public class Fatura {

	private double valorMensal;
	private List<Pagamento> pagamentos;
	private double valor;
	private boolean pago;

	public double getValorMensal() {
		return valorMensal;
	}

    public double getValor() {
		return valor;
    }

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if (valorTotalDosPagamentos() > this.valor) {
			this.pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		double total = 0;
		for (Pagamento p : pagamentos) {
			total += p.getValor();
		}
		return total;
	}

}
