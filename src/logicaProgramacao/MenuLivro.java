package logicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuLivro {
    private List<LivroDisponivel> livrosDisponiveis;

    public MenuLivro(List<LivroDisponivel> livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public void exibirMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                System.out.println("===== Menu de Livros =====");
                System.out.println("1. Listar livros disponíveis");
                System.out.println("2. Adicionar livro");
                System.out.println("3. Remover livro");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        listarLivrosDisponiveis();
                        break;
                    case 2:
                        adicionarLivro();
                        break;
                    case 3:
                        removerLivro();
                        break;
                    case 0:
                        System.out.println("Saindo do menu...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

                System.out.println();
            } while (opcao != 0);
        }
    }

    private void listarLivrosDisponiveis() {
        System.out.println("===== Livros Disponíveis =====");
        for (LivroDisponivel livro : livrosDisponiveis) {
            System.out.println(livro);
        }
    }

    private void adicionarLivro() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== Adicionar Livro =====");
            System.out.print("Título do livro: ");
            String titulo = scanner.nextLine();
   
            System.out.print("Autor do livro: ");
            String autor = scanner.nextLine();
   
            System.out.print("Editora do livro: ");
            String editora = scanner.nextLine();
   
            System.out.print("Ano de publicação: ");
            int anoPublicacao = scanner.nextInt();
   
            LivroDisponivel livro = new LivroDisponivel(titulo, autor, editora, anoPublicacao);
            livrosDisponiveis.add(livro);
        }

        System.out.println("Livro adicionado com sucesso!");
    }

    private void removerLivro() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== Remover Livro =====");
            System.out.print("Índice do livro a ser removido: ");
            int indice = scanner.nextInt();

            if (indice >= 0 && indice < livrosDisponiveis.size()) {
                LivroDisponivel livroRemovido = livrosDisponiveis.remove(indice);
                System.out.println("Livro removido: " + livroRemovido);
            } else {
                System.out.println("Índice inválido. Nenhum livro removido.");
            }
        }
    }

    public static void main(String[] args) {
        List<LivroDisponivel> livros = new ArrayList<>();
        livros.add(new LivroDisponivel("Livro 1", "Autor 1", 2020));
        livros.add(new LivroDisponivel("Livro 2", "Autor 2", 2019));

        MenuLivro menuLivro = new MenuLivro(livros);
        menuLivro.exibirMenu();
    }
}
