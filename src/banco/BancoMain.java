package banco;

public class BancoMain {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("1111", 100, "Lia Veras");
		Conta c2 = new Conta("2222", 0, "Rita Veras");
		
		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
		System.out.println("-----------------------------------------------------");
		
		c1.creditar(550.3f);
		c2.creditar(350.9f);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
		System.out.println("-----------------------------------------------------");
		
		c1.debitar(50);
		c2.debitar(100);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
		System.out.println("-----------------------------------------------------");
		
		c1.transferir(c2, 700);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Conta: " + c1.getNumero() + " Saldo: " + c1.getSaldo());
		System.out.println("Conta: " + c2.getNumero() + " Saldo: " + c2.getSaldo());
		System.out.println("-----------------------------------------------------");
		

		
			
	}

}
