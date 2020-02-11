package banco;

public class Conta {
	
	private String numero;
	private double saldo;
	private  Cliente cliente;
	
	public Conta(String numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public void creditar(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Cr�dito de " + valor + " realizado na Conta " + getNumero());
	}
	
	public void debitar(double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("D�bito de " + valor + " realizado na Conta " + getNumero());
		} else {
			System.out.println("A transa��o de d�bito n�o pode ser realizada!");
			System.out.println("Saldo insulficiente na Conta " + getNumero());
		}
	}
	
	public void transferir(Conta destino, double valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			System.out.println("Transferencia de " + valor + " da conta "+ getNumero() + " para conta " + destino.getNumero());
		}else {
			System.out.println("A transfer�ncia n�o pode ser realizada!");
			System.out.println("Saldo insulficiente na Conta " + getNumero());
		}
	}
	

	public String getNumero() {
		return this.numero;
	}
	private void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		 return this.saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
