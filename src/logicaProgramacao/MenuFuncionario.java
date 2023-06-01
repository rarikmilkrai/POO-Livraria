package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFuncionario {

    private List<Funcionario> funcionarios;

    public MenuFuncionario() {
        funcionarios = new ArrayList<>();
    }

    public MenuFuncionario(Object funcionarios2) {
    }

    public void adicionarFuncionario() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = sc.nextLine();

            System.out.print("Digite o CPF do funcionário: ");
            int cpf = sc.nextInt();
            sc.nextLine();

            Funcionario funcionario = new Funcionario(nome, cpf);
            funcionarios.add(funcionario);
        }

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("-----");
        }
    }

    public void exibirMenu() {
    }
}
