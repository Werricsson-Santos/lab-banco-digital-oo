import dev.wrn.bancodigital.model.Banco;
import dev.wrn.bancodigital.model.Cliente;
import dev.wrn.bancodigital.model.TipoConta;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton");
		
		Cliente wericson = new Cliente("Wericson");
		
		Banco ag1 = new Banco("WBank", 1);
		Banco ag2 = new Banco("WBank", 2);
		
		ag1.criarNovaConta(venilton, TipoConta.CC);
		ag2.criarNovaConta(wericson, TipoConta.POUPANCA);
		
		
		ag1.listarClientes();
		ag2.listarClientes();
		
		venilton.getConta().depositar(100);
		venilton.getConta().imprimirExtrato();
		
		wericson.getConta().depositar(300);
		wericson.getConta().imprimirExtrato();
		
		
		wericson.getConta().transferir(100, venilton.getConta());
		
		venilton.getConta().imprimirExtrato();
		wericson.getConta().imprimirExtrato();
		
	}

}
