package solid;

import static solid.Cargo.DBA;
import static solid.Cargo.DESENVOLVEDOR;
import static solid.Cargo.TESTER;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		throw new RuntimeException("funcionario invalido");
	}

	private double dezOuVintePorcento(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

	private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
		return 0;
	}

}
