
public abstract class FuncionarioAutenticavel extends Funcionario {

	private int senha;

	public boolean autenticaSenha(int senha) {
		boolean autentica = false;
		if (this.senha == senha) {
			autentica = true;
		} else {
			System.out.println("Senha incorreta!");
		}
		return autentica;
	}

}
