package logicaProgramacao;

public class LivroDisponivel extends Livro {
    private int quantidade;

    public LivroDisponivel(String titulo, String autor, String editora, int anoPublicacao, int quantidade) {
        super(titulo, autor, editora);
        this.quantidade = quantidade;
    }

    public LivroDisponivel(String titulo, String autor, String editora, int anoPublicacao) {
        super(titulo, autor, editora);
        this.quantidade = 0; // Define uma quantidade padrão, pode ser alterada posteriormente
    }

    public LivroDisponivel(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, ""); // Define uma editora padrão vazia, pode ser alterada posteriormente
        this.quantidade = 0; // Define uma quantidade padrão, pode ser alterada posteriormente
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
