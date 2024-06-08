package dev.wrn.bancodigital.model;

public enum TipoConta {
	CC("Conta corrente"),
	POUPANCA("Conta poupança");
	
	public String tipo;
	
	TipoConta(String tipo) {
		this.tipo = tipo;
	}
}
