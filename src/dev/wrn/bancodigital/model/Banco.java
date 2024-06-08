package dev.wrn.bancodigital.model;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private int agencia;
	private Set<Conta> contas = new LinkedHashSet<>();
	
	public Banco(String nome, int agencia) {
		this.nome = nome;
		this.agencia = agencia;
	}
	
	
	private List<Cliente> getClientes() {
		return contas.stream()
					 .map(Conta::getCliente)
					 .toList();
	}
										   


	
	public void criarNovaConta(Cliente cliente, TipoConta tipo) {
        Conta conta = null;
        if (tipo == TipoConta.CC) {
            conta = new ContaCorrente(cliente);
            conta.setAgencia(this.agencia);
        } else if (tipo == TipoConta.POUPANCA) {
            conta = new ContaPoupanca(cliente);
            conta.setAgencia(this.agencia);
        }

        if (conta != null) {
            contas.add(conta);
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido");
        }
    }
	
	public void listarClientes() {
		getClientes().forEach(c -> System.out.println(c.getNome()));
	}

}
