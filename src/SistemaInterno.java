
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autenticaSenha(this.senha);
		if (autenticou ) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("Nao pode entrar no sistema!");
		}
	}
	
	
}
