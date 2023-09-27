package contador;

import java.util.Scanner;

@SuppressWarnings("serial")
class ParametrosInvalidosException extends Exception {
	
}

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmentro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException e) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro");
			
		} finally {
			terminal.close();
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) 
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
