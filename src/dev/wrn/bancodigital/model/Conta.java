package dev.wrn.bancodigital.model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "numero")
public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	private TipoConta tipo;

	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.cliente.setConta(this);
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "Conta {\nTitular: " + cliente.getNome() + "\nAgencia: " + agencia + "\nNumero: " + numero + "\nSaldo: " + saldo +"\n}";
	}
}
