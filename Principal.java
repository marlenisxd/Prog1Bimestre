import java.util.Scanner;
public class Principal {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int exerciseNumber = -1;
		while (exerciseNumber != 0) {
			System.out.println("Digite o programa que deseja executar:");
			System.out.println("Digite 1 para Lista de Clientes.");
			System.out.println("Digite 2 para Armazenamento de Nome e Email.");
			System.out.println("Digite 3 para Realizar Medias e Notas.");
			System.out.println("Digite 0 para Encerrar o programa.");
			
			exerciseNumber = scan.nextInt();
			System.out.println("");
			
			switch (exerciseNumber) {
				case 1: Clientes exercicio1 = new Clientes();
					break;
			
				case 2: Contatos exercicio2 = new Contatos();
					break;

				case 3: Media exercicio3 = new Media();
					break;
					
				case 0: System.out.println("I'M BACK!");
					exerciseNumber = 0;
					break;
			
				default: System.out.println("Deu ruim, tente novamente.");
					break;
				
			}
		}
	}
	
	
}
