package logicaProgramacao;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Date data;
    private Cliente cliente;
    private List<Livro> livros;

    public Venda(int id, Date data, Cliente cliente, List<Livro> livros) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.livros = livros;
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

    // Getters e setters
}
