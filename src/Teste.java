
public class Teste {

	public static void main(String[] args) {

		Gerente f1 = new Gerente();
		
		Designer d1 = new Designer();
		
		d1.setNome("Joao");
		d1.setSalario(5.0000);
		
		f1.setCpf("897.654.654-85");
		f1.setNome("Carla");
		f1.setSalario(1000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f1);
		controle.registra(d1);
		
		
		
		System.out.println(f1.getBonificacao());
		System.out.println(f1.getNome());
		System.out.println(controle.getSoma());
		
	}

}
