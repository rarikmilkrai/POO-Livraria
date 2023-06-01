package logicaProgramacao;

public class Livro {
    protected String titulo;
    protected String autor;
    protected String editora;
    public Livro(int anoPublicacao) {
    }

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = ""; // Coloque o valor padrão para a editora, ou remova esse parâmetro se não for necessário
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return 0;
    }

    public void setAnoPublicacao(int anoPublicacao) {
    }

    // Getters e setters
}
