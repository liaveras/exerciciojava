package banco;

public class RepositorioClientesArray {
	
	private Cliente clientes[];
	private int indice = -1;
	private final static int tamanhoCache = 100;
	
	public RepositorioClientesArray() {
		clientes = new Cliente[tamanhoCache];
	}

	public void inserir(Cliente c) {
		indice++;
		clientes[indice] = c;
	}
	
	private int procurarIndice(String cpf) {
		for(int i = 0; i <= indice; i++ ) {
			if(clientes[i].getCpf().equals(cpf)) {
				return i;
			}
		}	
		return -1;	
	}
			
	public boolean existe(String cpf) {
		
		boolean resp = false;
		int i = procurarIndice(cpf);
		
		if(i != -1) {
			resp = true;
		}
		return resp;
	}
	
	public Cliente procurar(String cpf) {
		Cliente c = null;
		int i = procurarIndice(cpf);
		if(i != -1) {
			c = clientes[i];
		}else {
			System.out.println("Cliente não existe.");
		}
		return c;
	}
	
	public void atualizar(Cliente c) {
		int i = procurarIndice(c.getCpf());
		if(i != -1) {
			clientes[i] = c;
		}else {
			System.out.println("Cliente não existe.");
		}
	}	
	
	public void remover(String cpf) {
		int i = procurarIndice(cpf);
		if(i != -1) {
			clientes[i] = clientes[indice];
			clientes[indice] = null;
			indice--;
		}else {
			System.out.println("Cliente não existe.");
		}
	}
	
	public void status() {
		for(int i = 0; i <= indice; i++) {
			System.out.println(clientes[i].toString());
		}
	}
		
}
