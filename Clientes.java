import java.util.Scanner;

public class Clientes {
	String[] aCliente;
	
	public Clientes() {
		System.out.println("The Black List of Clientes");
		int qtdClientes =0;
		Scanner scan = new Scanner(System.in);
		while (qtdClientes<1) {
			System.out.println("Informe o numero de clientes da lista: (Digite -1 para cancelar):");
			qtdClientes = scan.nextInt();
			if (qtdClientes == -1) {
				break;
			} else if (qtdClientes <1) {
				qtdClientes = 0;
			}
		}
		
		if (qtdClientes == -1) {
			System.out.println("I'M BACK");
		} else {
			aCliente = new String[qtdClientes];
			String nomeDigitado = "";
			for (int i = 0; i < qtdClientes; i++) {
				
				boolean pass = false;
				while (!pass) {
					System.out.println("Informe o Nome do Cliente ("+i+") (Digite -1 para cancelar):");
					nomeDigitado = scan.next();
					if (nomeDigitado.equals("-1")) {
						break;
					} else if (nomeDigitado.length() < 2) {
						System.out.println("O nome deve ter conter no MINIMO 2 digitos");
						nomeDigitado = "";
					} else {
						aCliente[i] = nomeDigitado;
						System.out.println("Registrado.");
						nomeDigitado= "";
						pass = true;
					}
				}
				
				if (nomeDigitado.equals("-1")) {
					break;
				}
				
			}
			
			if (nomeDigitado.equals("-1")) {
				System.out.println("I'M BACK");
			} else {
				for (int i=0; i < qtdClientes; i++) {
					System.out.println(i+" -> "+ aCliente[i]);
				}
			}
		}
	}
}