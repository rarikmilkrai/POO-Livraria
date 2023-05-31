# POO-Livraria
O código fornecido consiste em um sistema de gerenciamento de uma livraria
Ele contém várias classes que representam diferentes elementos do sistema, como clientes, funcionários, livros disponíveis, empréstimos e vendas. Abaixo está um resumo do que cada classe faz e o que ela contém:

# Classe Cliente:

Herda da classe Pessoa e representa um cliente da livraria.
Possui um atributo adicional chamado "endereco".
Tem métodos para obter e definir o endereço e o telefone do cliente.
Também possui métodos para obter o nome e o CPF, herdados da classe Pessoa.

# Classe Emprestimo:
Representa um empréstimo realizado na livraria.
Possui atributos como "id" (identificador do empréstimo), "data" (data do empréstimo), "cliente" (cliente que realizou o empréstimo), "livros" (lista de livros emprestados) e "dataDevolucao" (data prevista para devolução).
Possui métodos para obter e definir os atributos mencionados acima.

# Classe Funcionario:
Herda da classe Pessoa e representa um funcionário da livraria.
Possui métodos para obter o nome e o CPF, herdados da classe Pessoa.

# Classe Livraria:
Representa a livraria em si.
Possui listas de livros disponíveis, funcionários e clientes.
Contém métodos para adicionar e remover livros, funcionários e clientes.
Também possui métodos para buscar livros, funcionários e clientes com base em critérios específicos.

# Classe Livro:
Representa um livro genérico.
Possui atributos como "titulo", "autor" e "editora".
Contém métodos para obter e definir esses atributos.

# Classe LivroDisponivel:
Herda da classe Livro e representa um livro disponível na livraria.
Além dos atributos herdados da classe Livro, possui um atributo adicional chamado "quantidade".
Possui métodos para obter e definir a quantidade e o título do livro.

# Classe MainProjeto:
Contém o método main, que é o ponto de entrada do programa.
Instancia um objeto MenuPrincipal e uma Livraria e chama o método exibirMenu do MenuPrincipal.

# Classe MenuCliente:
Representa o menu de opções relacionadas aos clientes.
Possui uma lista de clientes.
Tem métodos para exibir o menu, listar os clientes, adicionar um novo cliente e remover um cliente existente.

# Classe MenuFuncionario:
Representa o menu de opções relacionadas aos funcionários.
Possui uma lista de funcionários.
Tem métodos para exibir o menu, adicionar um novo funcionário e listar os funcionários cadastrados.

# Classe MenuLivro:
Representa o menu de opções relacionadas aos livros.
Possui uma lista de livros disponíveis.
Tem métodos para exibir o menu.

# Classe MenuPrincipal:
Representa o menu principal do sistema.
Possui um atributo Livraria.
Contém métodos para exibir o menu principal e chamar os menus relacionados
