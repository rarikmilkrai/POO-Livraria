package logicaProgramacao;

public class Cliente extends Pessoa {
    private String endereco;

    public String getEndereco() {
        return endereco;
    }
    public Cliente(String nome, int cpf) {
        super(nome, cpf);
    }
    public String getEndereco(String endereco) {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone(String telefone) {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.nome = telefone;
    }
    public String getNome() {
        return null;
    }
    public Object getCpf() {
        return null;
    }
    

    // Outros métodos e atributos específicos de Cliente
}
