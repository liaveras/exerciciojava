package banco;

public class Conta {
	
	private String numero;
	private float saldo;
	private  String nome;
	
	public Conta(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(String numero, float saldo, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public void creditar(float valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Crédito de " + valor + " realizado na Conta " + getNumero());
	}
	
	public void debitar(float valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Débito de " + valor + " realizado na Conta " + getNumero());
		} else {
			System.out.println("A transação de débito não pode ser realizada!");
			System.out.println("Saldo insulficiente na Conta " + getNumero());
		}
	}
	
	public void transferir(Conta destino, float valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			System.out.println("Transferencia de " + valor + " da conta "+ getNumero() + " para conta " + destino.getNumero());
		}else {
			System.out.println("A transferência não pode ser realizada!");
			System.out.println("Saldo insulficiente na Conta " + getNumero());
		}
	}
	

	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public float getSaldo() {
		 return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
