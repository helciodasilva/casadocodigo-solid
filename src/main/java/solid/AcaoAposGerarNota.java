package solid;

interface AcaoAposGerarNota {
	void executa(NotaFiscal nf);
}

class NFDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {

	}
}

class QualquerOutraAcao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {

	}
}
