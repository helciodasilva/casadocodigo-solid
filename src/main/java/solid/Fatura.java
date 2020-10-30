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
}
