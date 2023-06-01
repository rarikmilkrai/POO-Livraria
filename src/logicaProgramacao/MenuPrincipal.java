package logicaProgramacao;

import java.util.Scanner;

public class MenuPrincipal<T extends MenuFuncionario, U extends MenuVendaEmprestimo> {
    private Livraria livraria;

    public MenuPrincipal() {
        livraria = new Livraria();
    }

    /**
     * 
     */
    public void exibirMenu(Livraria livraria) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            while (opcao != 5) {
                System.out.println("----------- MENU PRINCIPAL -----------");
                System.out.println("1. Gerenciar Livros");
                System.out.println("2. Gerenciar Clientes");
                System.out.println("3. Gerenciar Funcionários");
                System.out.println("4. Realizar Venda ou Empréstimo");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        MenuLivro menuLivro = new MenuLivro(livraria.getLivrosDisponiveis());
                        menuLivro.exibirMenu();
                        break;
                    case 2:
                        MenuCliente menuCliente = new MenuCliente(livraria.getClass());
                        menuCliente.exibirMenu();
                        break;
                    case 3:
                        final MenuFuncionario menuFuncionario = new MenuFuncionario(livraria.getFuncionarios());
                        menuFuncionario.exibirMenu();
                        break;
                    case 4:
                        final MenuVendaEmprestimoImpl menuVendaEmprestimo = new MenuVendaEmprestimoImpl(livraria);
                        menuVendaEmprestimo.exibirMenu();
                        break;
                    case 5:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                }
            }
        }
    }

    public void exibirMenu(Object livraria2) {
    }

    public Livraria getLivraria() {
        return livraria;
    }

    public void setLivraria(Livraria livraria) {
        this.livraria = livraria;
    }
}
