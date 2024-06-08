package dev.wrn.bancodigital.model;

public class ContaCorrente extends Conta {

	protected ContaCorrente(Cliente cliente) {
		super(cliente);
		this.setTipo(TipoConta.CC);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
