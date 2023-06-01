package logicaProgramacao;

import java.util.List;
import java.util.Scanner;

public class MenuCliente {
    private List<Cliente> clientes;

    public MenuCliente(List<Cliente> class1) {
        this.clientes = class1;
    }

    public MenuCliente(Class<? extends Livraria> class1) {
    }

    public void exibirMenu() {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("----------- MENU CLIENTES -----------");
                System.out.println("1. Listar clientes");
                System.out.println("2. Adicionar cliente");
                System.out.println("3. Remover cliente");
                System.out.println("4. Voltar");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        listarClientes();
                        break;
                    case 2:
                        adicionarCliente();
                        break;
                    case 3:
                        removerCliente();
                        break;
                    case 4:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                }
            }
        }
    }

    private void listarClientes() {
        System.out.println("----------- LISTA DE CLIENTES -----------");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - CPF: " + cliente.getCpf());
        }
        System.out.println("------------------------------------------");
    }

    private void adicionarCliente() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o nome do cliente: ");
            String nome = sc.nextLine();
            System.out.print("Digite o CPF do cliente: ");
            int cpf = sc.nextInt();
            sc.nextLine();

            Cliente novoCliente = new Cliente(nome, cpf);
            clientes.add(novoCliente);
        }
        System.out.println("Cliente adicionado com sucesso!");
    }

    /**
     * 
     */
    private void removerCliente() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o CPF do cliente a ser removido: ");
            int cpf = sc.nextInt();
            sc.nextLine();

            boolean clienteEncontrado = false;
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                clienteEncontrado = true;
                System.out.println("Cliente removido com sucesso!");
                break;
                }
            }

            if (!clienteEncontrado) {
                System.out.println("Cliente não encontrado.");
            }
        }
    }
}
