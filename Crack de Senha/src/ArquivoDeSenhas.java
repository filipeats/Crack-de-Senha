import java.util.HashMap;

public class ArquivoDeSenhas {
	// Propriedades da classe
	private static HashMap<String, String> arquivoDeSenhas =
									new HashMap<String, String>();
	
	// Método construtor da classe
	public ArquivoDeSenhas() {
		arquivoDeSenhas.put("4813494d137e1631bba301d5acab6e7bb7aa74ce1185d456565ef51d737677b2", "root");
		arquivoDeSenhas.put("e6eb1791f2bc886e9cdb0f9b68bdf2002171d884c977028d4a6d0a33fa4f32f6", "fulano");
		arquivoDeSenhas.put("13a5c202e320d0bf9bb2c6e2c7cf380a6f7de5d392509fee260b809c893ff2f9", "maria");
		arquivoDeSenhas.put("4b7c6c0b0db7631dd5a71141fda8192035cf49ea5318daf7d0d881bcbdd0f39e", "neymar");
		arquivoDeSenhas.put("2102ef5ea8ab4df1d768ae484f5ecef3352f32b3f2ce31313525edc9c1dc6860", "elizabeth");
		arquivoDeSenhas.put("a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3", "trouxa");
		arquivoDeSenhas.put("4d1dfd3e56f95f5a2d017f9451a8e4335bd261a02e7abfc86d0c5497df489fe8", "wellington");
		arquivoDeSenhas.put("a4921c741b3e672631145c49a3b755b0e63c63ccddd78640d6b35fb5360e7c22", "lula");
		arquivoDeSenhas.put("fc5669b52ce4e283ad1d5d182de88ff9faec6672bace84ac2ce4c083f54fe2bc", "kali");
		arquivoDeSenhas.put("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92", "mane");
		arquivoDeSenhas.put("b7e94be513e96e8c45cd23d162275e5a12ebde9100a425c4ebcdd7fa4dcd897c", "beltrano");
		arquivoDeSenhas.put("1c6343f79733d0418efd455c13c78a419cc93f48b81b9ad2bbdac6a90d14c4ba", "junior");
		arquivoDeSenhas.put("d75d2785d90cab90245dc9e22a82c1a048673c4a2c54fa1754e9085f4f01d687", "sunda");
	}
	
	// Métodos da classe
	public static String getUsuario(String hash) {
		return arquivoDeSenhas.get(hash);
	}
}