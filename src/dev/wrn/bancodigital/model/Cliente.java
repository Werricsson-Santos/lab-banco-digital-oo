package dev.wrn.bancodigital.model;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Cliente {
	private static int SEQUENCIAL = 1;

	private int id;
	private String nome;
	private Conta conta;
	
	public Cliente(String nome) {
		this.id = SEQUENCIAL ++;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente {id: " + id + ", Nome: " + nome + ", Conta { Tipo: " + conta.getTipo() + ", Agência: " + conta.getAgencia() + ", Número: " +  conta.getNumero() + "}";
	}
}
