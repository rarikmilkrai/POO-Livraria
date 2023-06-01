package logicaProgramacao;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int cpf, double salario, String cargo) {
        super(nome, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario(String nome, int cpf) {
        super(nome, cpf);
        // Aqui você pode inicializar os atributos adicionais ou deixar vazios, dependendo da lógica do seu programa
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void realizarTarefa(String tarefa) {
        // Lógica para realizar uma tarefa específica
        System.out.println("Realizando tarefa: " + tarefa);
    }

    public void receberAumento(double aumento) {
        salario += aumento;
        System.out.println("Salário atualizado: " + salario);
    }

    // Outros métodos e atributos específicos de Funcionario

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 123456789, 5000.0, "Gerente");

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Cargo: " + funcionario.getCargo());

        funcionario.realizarTarefa("Analisar relatórios");
        funcionario.receberAumento(1000.0);
    }
}
