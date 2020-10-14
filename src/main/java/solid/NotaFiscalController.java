package solid;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ws.rs.Path;

public class NotaFiscalController {
	private Conexao conexao = new Conexao();

	@Path("/notaFiscal/nova")
	public String cadastraNotaFiscal(NotaFiscal nf) throws SQLException {
		if (nf.ehValida()) {
			// faz alguma regra de negocio qualquer
			if (nf.ehDeSaoPaulo()) {
				nf.duplicaImpostos();
			}
			if (nf.ultrapassaValorLimite()) {
				SMTP smtp = new SMTP();
				String template = leTemplateDoArquivo();
				smtp.enviaEmail(nf.getUsuario(), template);
			}
			// persiste no banco de dados
			String sql = "insert into NF (...) values (...)";
			PreparedStatement stmt = conexao.preparaSql(sql);
			stmt.execute();
			// envia nf pra um webservice qualquer
			SOAP ws = new SOAP();
			ws.setUrl("http://www.meuerp.com.br");
			ws.setPort(80);
			ws.send(nf);
			// exibe pagina de sucesso
			return view("sucesso.jsp");
		} else {
			// exibe pagina de erro
			return view("erro-de-valicacao.jsp");
		}
	}

	private String leTemplateDoArquivo() {
		return null;
	}

	private String view(String view) {
		return view;
	}
}