package solid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class AnalisadorDeCodigo {
	
	private Arquivos arquivos = new Arquivos();
	
	private int qtdIfs = 0;

	public int analisa() throws FileNotFoundException, IOException {
		List<File> todosArquivos = arquivos.todosJava();
		for (File arquivo : todosArquivos) {
			contaIfs(arquivo);
		}
		return qtdIfs;
	}

	private void contaIfs(File arquivo) throws FileNotFoundException, IOException {
        String codigo = IOUtils.toString(new FileInputStream(arquivo), "UTF-8");
		String[] tokens = codigo.split(" ");
		for (String token : tokens) {
			if (token.equals("if"))
				qtdIfs++;
		}
	}

}