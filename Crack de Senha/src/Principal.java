public class Principal {
	public static void main(String[] args) {
		new ArquivoDeSenhas();
		
		// Senhas numéricas de 2 a 10 caracteres
		for (int i = 2 ; i < 10 ; i++) {
			new QuebradoraDeSenhas(i, "", 48, 58).start();
		}
		
		// Senhas alfabéticas minúsculas de 2 a 10 caracteres
		for (int i = 2 ; i < 10 ; i++) {
			new QuebradoraDeSenhas(i, "", 97, 123).start();
		}
		
		// Senhas alfabéticas maiúsculas de 2 a 10 caracteres
		for (int i = 2 ; i < 10 ; i++) {
			new QuebradoraDeSenhas(i, "", 65, 91).start();
		}
		
		// Senhas alfanuméricas com caracter especial de 2 a 10 caracteres
		for (int i = 2 ; i < 10 ; i++) {
			new QuebradoraDeSenhas(i, "", 32, 127).start();
		}
	}
}