package poo;

import poo.implementacao.Aparelho;

public class Main {

	public static void main(String[] args) {
		Aparelho iPhone = new Aparelho();
		
		System.out.println("APARELHO TELÊFONICO:");
		System.out.println(" ");
		
		iPhone.ligar();
		iPhone.atender();
		iPhone.iniciarCorreioVoz();
		
		System.out.println("----------------------------------------------");
		System.out.println("NAVEGADOR NA INTERNET:");
		System.out.println(" ");
		
		iPhone.exibirPagina();
		iPhone.adicionarNovaAba();
		iPhone.atualizarPagina();
		
		System.out.println("----------------------------------------------");
		System.out.println("REPRODUTOR MUSICAL:");
		System.out.println(" ");
		
		iPhone.tocar();
		iPhone.pausar();
		iPhone.selecionarMusica();

	}

}
