package challenge1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		selecionaCandidato();
	}
	static void selecionaCandidato() {
		String[] nomes = {"Luan", "Márcia", "Fernanda", "Gonçalves", "Alfredo"};
        List<Candidato> listaCandidatos = new ArrayList<>();

        for (int i = 0; i < nomes.length; i++) {
            double salarioAleatorio = 2000 + Math.random() * 3000; 
            Candidato candidato = new Candidato(i + 1, nomes[i], salarioAleatorio);
            listaCandidatos.add(candidato);
        }

        double salarioPretendido = 3000;
        for (Candidato candidato : listaCandidatos) {
            System.out.println(candidato);
            
            analisarCandidato(candidato.getSalario(), salarioPretendido);

        }
    }
	
	static void analisarCandidato(double salarioCandidato, double salarioPretendido) {
		
		if(salarioCandidato <= salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else {
			System.out.println("Ignorar candidato");
		}
	}

}
