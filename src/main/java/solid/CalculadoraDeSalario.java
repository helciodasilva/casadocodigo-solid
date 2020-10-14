package solid;

import static solid.Cargo.DBA;
import static solid.Cargo.DESENVOLVEDOR;
import static solid.Cargo.TESTER;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario) {
		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return new DezOuVintePorCento().calcula(funcionario);
		}
		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
		}
		throw new RuntimeException("funcionario invalido");

	}
}
