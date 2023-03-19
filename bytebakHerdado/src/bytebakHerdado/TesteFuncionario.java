package bytebakHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario mateus = new Funcionario();
		mateus.setNome("Mateus Sodré");
		mateus.setCpf("49067414875");
		mateus.setSalario(2600.00);
		
		System.out.println(mateus.getNome());
		System.out.println(mateus.getBonificacao());
		
		

	}

}
