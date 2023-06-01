package logicaProgramacao;

import java.util.Date;
import java.util.List;

public class Emprestimo {
    private int id;
    private Date data;
    private Cliente cliente;
    private List<Livro> livros;
    private Date dataDevolucao;

    public Emprestimo(int id, Date data, Cliente cliente, List<Livro> livros, Date dataDevolucao) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.livros = livros;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e setters
}
