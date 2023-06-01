package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;

public class Livraria extends MenuFuncionario{
    private List<LivroDisponivel> livrosDisponiveis;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;

    public Livraria() {
        livrosDisponiveis = new ArrayList<>();
        funcionarios = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Métodos para adicionar livros, funcionários e clientes
    public void adicionarLivro(LivroDisponivel livro) {
        livrosDisponiveis.add(livro);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Métodos para remover livros, funcionários e clientes
    public void removerLivro(LivroDisponivel livro) {
        livrosDisponiveis.remove(livro);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    // Métodos para buscar livros, funcionários e clientes
    public LivroDisponivel buscarLivroPorTitulo(String titulo) {
        for (LivroDisponivel livro : livrosDisponiveis) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

	public Object getFuncionarios() {
		return null;
	}

    public List<LivroDisponivel> getLivrosDisponiveis() {
        return null;
    }
}
