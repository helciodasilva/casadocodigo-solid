package solid;

import java.util.List;

import javax.ws.rs.Path;

public class ContratoController {

	@Path("/notaFiscal/nova")
	public void fecha(Contrato contrato) {
		contrato.setData("23/01/2015");
		contrato.fecha();
		List<Pagamento> pagamentos = contrato.geraPagamentos();
		if (contrato.isPessoaJuridica()) {
			contrato.marcaEmissaoDeNF();
		} else {
			contrato.marcaImpostoPF();
		}
	}

}
