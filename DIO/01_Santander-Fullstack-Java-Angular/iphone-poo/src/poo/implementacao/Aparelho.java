package poo.implementacao;

import poo.interfaces.Navegador;
import poo.interfaces.Reprodutor;
import poo.interfaces.Telefone;

public class Aparelho implements Telefone, Navegador, Reprodutor {
	
	public void ligar() {	
		System.out.println("Ligando...");
	}
	
	public void atender() {
		System.out.println("Atendendo ligação");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Ligação encaminhada para o Correio de Voz.");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo uma página no navegador");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada no navegador");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página do navegador");
	}
	
	public void tocar() {
		System.out.println("Música tocando...");
	}
	
	public void pausar() {
		System.out.println("Música pausada.");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando uma nova música");
	}

}
