package banco;

public class StringTeste {

	public static void main(String[] args) {
		
		String s1 = new String("Lia Veras");
		String s2 = new String("Lia Veras");
		
		int soma = (int)s1.length() + (int)s2.length();
		System.out.println("A soma dos tamanhos dos nomes s1 e s2 � " + soma);
		
		if(s1.equals(s2)) {
			System.out.println("O conte�do de s1 e s2 s�o iguais!");
		}else {
			System.out.println("O conte�do de s1 e s2 s�o diferentes!");
		}
		
		if(s1 == s2) {
			System.out.println("S1 e s2 s�o iguais!");
		}else {
			System.out.println("S1 e s2 s�o diferentes!");
		}
		System.out.println(" ");
		
		
		String s3 = ("Rita Veras");
		String s4 = ("Rita Veras");
		
		if(s3.equals(s4)) {
			System.out.println("O conte�do de s3 e s4 s�o iguais!");
		}else {
			System.out.println("O conte�do de s3 e s4 s�o diferentes!");
		}
		
		if(s3 == s4) {
			System.out.println("S3 e s4 s�o iguais!");
		}else {
			System.out.println("S3 e S4 s�o diferentes!");
		}
		System.out.println(" ");
		
		
		s3 = ("Joana Veras");
		
		if(s3.equals(s4)) {
			System.out.println("O conte�do de s3 e s4 s�o iguais!");
		}else {
			System.out.println("O conte�do de s3 e s4 s�o diferentes!");
		}
		
		if(s3 == s4) {
			System.out.println("S3 e s4 s�o iguais!");
		}else {
			System.out.println("S3 e S4 s�o diferentes!");
		}
		
		

	}

}
