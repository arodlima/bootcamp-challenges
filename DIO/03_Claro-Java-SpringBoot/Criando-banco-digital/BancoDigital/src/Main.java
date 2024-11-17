
public class Main {
	
	public static void main(String[] args) {
		Cliente andreza = new Cliente();
		andreza.setNome("Andreza");
		
		Conta cc = new ContaCorrente(andreza);
		Conta poupanca = new ContaPoupanca(andreza);
		
		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
