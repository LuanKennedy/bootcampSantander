package bootcamp;
public class FormattedCep {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("06853500");
			System.out.print(cepFormatado);
		} catch (CepException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a();
	}
	
	static void a () {
		System.out.println("entrou no teste for");
		for(int i =0; i < 4; i++) {
			System.out.println(i);
			
		}
	}
	
	static void b () {
		System.out.println("entrou no metódo b");
		System.out.println("saiu do metódo b");
	}
	static String formatarCep(String cep) throws CepException {
		
		if(cep.length() != 8)
			throw new CepException();
		
		
		return "06853-500";
		
	}
	
	
}
