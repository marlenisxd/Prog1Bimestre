import java.util.Scanner;

public class Media {
	float[][] aAlunos;
	
	public Media() {
		System.out.println("Escola Feliz");
		int qtdAlunos =0;
		Scanner scan = new Scanner(System.in);
		while (qtdAlunos<1) {
			System.out.println("Digite o numero de alunos (Digite -1 para Cancelar.):");
			qtdAlunos = scan.nextInt();
			if (qtdAlunos == -1) {
				break;
			} else if (qtdAlunos <1) {
				qtdAlunos = 0;
			}
		}
		
		if (qtdAlunos == -1) {
			System.out.println("I'M BACK!");
		} else {
			aAlunos = new float[qtdAlunos][6];
			float nomeDigitado = -5;
			String[] suporteString = {"primeira","segunda", "terceira", "quarta", "quinta", "sexta"};
			for (int i = 0; i < qtdAlunos; i++) {
				
				for (int y =0; y < 6; y++) {
					boolean pass = false;
					while (!pass) {
						System.out.println("Digite a "+ suporteString[y] +" nota do aluno ("+i+") (-1 para cancelar):");
						nomeDigitado = scan.nextFloat();
						if (nomeDigitado == -1) {
							break;
						} else if (!(nomeDigitado >= 0 && nomeDigitado <=10)) {
							System.out.println("As notas devem permacer entre 0 e 10.");
							nomeDigitado = -2;
						} else {
							aAlunos[i][y] = nomeDigitado;
							System.out.println("Cadastrado com sucesso");
							nomeDigitado= -5;
							pass = true;
						}
					}
				
					if (nomeDigitado == -1) {
						break;
					}
					
				}
				if (nomeDigitado == -1) {
					break;
				}
			}
			
			if (nomeDigitado == -1) {
				System.out.println("I'M BACK");
			} else {
				for (int i=0; i < qtdAlunos; i++) {
					float media = 0;
					for (int y=0; y < 6; y++) {
						media += aAlunos[i][y];
					}
					media /= 6;
					System.out.println("Aluno: "+i+" ->  media = " + media);
				}
			}
		}
	}
}