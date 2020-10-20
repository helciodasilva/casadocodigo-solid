package solid;

public class GerenciadorDeNotasFiscais {
	private NFDao dao;
	private CalculadorDeImposto impostos;
	private LeiDeEntrega lei;
	private Correios correios;

	public GerenciadorDeNotasFiscais(NFDao dao, CalculadorDeImposto impostos, LeiDeEntrega lei, Correios correios) {
		this.dao = dao;
		this.impostos = impostos;
		this.lei = lei;
		this.correios = correios;
	}

	public void processa(NotaFiscal nf) {
		double imposto = impostos.para(nf);
		nf.setImposto(imposto);
		if (lei.deveEntregarUrgente(nf)) {
			correios.enviaPorSedex10(nf);
		} else {
			correios.enviaPorSedexComum(nf);
		}
		dao.persiste(nf);
	}
}
