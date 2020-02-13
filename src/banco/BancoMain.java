package banco;

public class BancoMain {

	public static void main(String[] args) {
		
		
		RepositorioClientesArray repo = new RepositorioClientesArray();
		
		Cliente c1 = new Cliente("Rafael", "123.123.123-12", TipoCliente.VIP);
		Cliente c2 = new Cliente("Lia", "123.123.123-13", TipoCliente.ESPECIAL);
		
		repo.inserir(c1);
		repo.inserir(c2);
		
		repo.status();
		
		
		
		
		
		
		
		
		
		
		
//		Exercício 1:
//		Cliente cl1 = new Cliente ("Lia Veras", "111.111.111-11");
//		Conta c1 = new Conta("123", cl1);
//		
//		Cliente cl2 = new Cliente ("Rita Veras", "222.222.222-22");
//		Conta c2 = new Conta("456", 0, cl2);
//		
//		
//		
//		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
//		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
//		System.out.println("-----------------------------------------------------");
//		
//		c1.creditar(550.3);
//		c2.creditar(350.9);
//		
//		System.out.println("-----------------------------------------------------");
//		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
//		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
//		System.out.println("-----------------------------------------------------");
//		
//		c1.debitar(50);
//		c2.debitar(100);
//		
//		System.out.println("-----------------------------------------------------");
//		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
//		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
//		System.out.println("-----------------------------------------------------");
//		
//		c1.transferir(c2, 700);
//		
//		System.out.println("-----------------------------------------------------");
//		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
//		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
//		System.out.println("-----------------------------------------------------");
//		

		
			
	}

}
