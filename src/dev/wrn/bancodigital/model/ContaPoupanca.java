package dev.wrn.bancodigital.model;

public class ContaPoupanca extends Conta {

	protected ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.setTipo(TipoConta.POUPANCA);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
