package solid;

import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private String data;

	public void marcaEmissaoDeNF() {
	}

	public void marcaImpostoPF() {
	}

	public boolean isPessoaJuridica() {
		return false;
	}

	public List<Pagamento> geraPagamentos() {
		return new ArrayList<Pagamento>();
	}

	public void setData(String data) {
		this.data = data;
	}

	public void fecha() {
	}

}
