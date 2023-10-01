package poo;

import poo.implementacao.Aparelho;

public class Main {

	public static void main(String[] args) {
		Aparelho iPhone = new Aparelho();
		
		System.out.println("APARELHO TELÊFONICO: \n");
		
		iPhone.ligar();
		iPhone.atender();
		iPhone.iniciarCorreioVoz();
		
		System.out.println("----------------------------------------------");
		System.out.println("NAVEGADOR NA INTERNET: \n");
		
		iPhone.exibirPagina();
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		
		System.out.println("----------------------------------------------");
		System.out.println("REPRODUTOR MUSICAL: \n");
		
		iPhone.tocar();
		iPhone.pausar();
		iPhone.selecionarMusica();

	}

}
