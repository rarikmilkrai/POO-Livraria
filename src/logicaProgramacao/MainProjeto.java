package logicaProgramacao;

public class MainProjeto {
    public static void main(String[] args) {
        final var menuPrincipal = new MenuPrincipal<Livraria, MenuVendaEmprestimo>(); // Especifique os tipos genéricos T e U
        Livraria livraria = new Livraria();
        menuPrincipal.exibirMenu(livraria);
    }
}
