package solid;

import javax.ws.rs.Path;

public class NotaFiscalController {

	@Path("/notaFiscal/nova")
	public String cadastraNotaFiscal(NotaFiscal nf) {
		if (nf.ehValida()) {
			// regras de negocio, bem divididas
			// em classes
			RegrasDeCadastro regras = new DuplicaImpostoParaSaoPaulo(new EmailSeUltrapassaValorLimite());
			regras.aplica(nf);
			// persiste no banco de dados
			NotaFiscalDao dao = new NotaFiscalDao();
			dao.salva(nf);
			// envia nf pra um webservice qualquer
			WebService ws = new WebServiceDoERPInterno();
			ws.envia(nf);
			// exibe pagina de sucesso
			return view("sucesso.jsp");
		} else {
			// exibe pagina de erro
			return view("erro-de-valicacao.jsp");
		}

	}

	private String view(String view) {
		return view;
	}
}