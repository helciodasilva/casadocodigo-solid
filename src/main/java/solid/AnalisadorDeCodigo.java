package solid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class AnalisadorDeCodigo {
	
	private Arquivos arquivos = new Arquivos();
	
	public int analisa() throws FileNotFoundException, IOException {
		List<File> todosArquivos = arquivos.todosJava();
		int qtdIfs = 0;
		for (File arquivo : todosArquivos) {
			String codigo = IOUtils.toString(new FileInputStream(arquivo), "UTF-8");

			String[] tokens = codigo.split(" ");
			for (String token : tokens) {
				if (token.equals("if"))
					qtdIfs++;
			}
		}
		return qtdIfs;
	}

}