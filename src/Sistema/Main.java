package Sistema;

import java.util.Date;


public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setIdade(21);
		cliente.setNascimento(new Date(1993,10,17));
		cliente.setNome("Nicolas");
		cliente.setSobrenome("Dias Bento");
		System.out.println(cliente.getSobrenome());
		System.out.println(cliente.getIdade());
	}
}
