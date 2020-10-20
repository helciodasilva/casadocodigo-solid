package solid;

public class NotaFiscal {

	private double valor;
	private double impostoSimplesSobreO;
	private double imposto;

	public NotaFiscal(double valor, double impostoSimplesSobreO) {
		this.valor = valor;
		this.impostoSimplesSobreO = impostoSimplesSobreO;
	}

	public void duplicaImpostos() {
	}

	public boolean ultrapassaValorLimite() {
		return false;
	}

	public Usuario getUsuario() {
		return new Usuario();
	}

	public boolean ehValida() {
		return false;
	}

	public boolean ehDeSaoPaulo() {
		return false;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
