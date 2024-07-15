import java.security.MessageDigest;

public class QuebradoraDeSenhas extends Thread {
	// Propriedades da classe
	private int tamanho = 0;
	private String prefixo = "";
	private int caractereInicial = 0;
	private int caractereFinal = 0;
	
	// Método construtor cheio da classe
	public QuebradoraDeSenhas(int tamanho, String prefixo, int caractereInicial, int caractereFinal) {
		super();
		this.tamanho = tamanho;
		this.prefixo = prefixo;
		this.caractereInicial = caractereInicial;
		this.caractereFinal = caractereFinal;
	}
	
	// Métodos da classe
	private String calcularHash(String senha) throws Exception {
		String retorno = "";
		
		MessageDigest resumo =
							MessageDigest.getInstance("SHA-256");
		
		byte[] vetorResultado =
							resumo.digest(senha.getBytes("UTF-8"));
		for (int i = 0; i < vetorResultado.length; i++) {
			String hex = Integer.toHexString(0xff &
											 vetorResultado[i]);
			if(hex.length() == 1) {
				hex = "0" + hex;
			}
			retorno += hex;
		}
		
		return retorno;
	}
	
	private void gerarSenha(int nivelDaRecursao,
							String senha) throws Exception {
		for (int i = caractereInicial ; i < caractereFinal ; i++) {
			String temp = (senha + ((char) i));
			if (nivelDaRecursao == tamanho) {
				testarSenha(temp);
			} else {
				gerarSenha(++nivelDaRecursao, temp);
				--nivelDaRecursao;
			}
		}
	}
	
	private void testarSenha(String senha) throws Exception {
		String usuario = ArquivoDeSenhas.getUsuario(
						 calcularHash(senha));
		if (usuario != null) {
			System.out.println("QUEBREI A SENHA " +
							   "DE UM TROUXA: " +
							   usuario + " => " + senha);
		}
	}
	
	// Método de execução paralela da classe
	public void run() {
		try {
			gerarSenha(prefixo.length() + 1, prefixo);
		} catch (Exception erro) {
			System.out.println(erro);
		}
	}
}