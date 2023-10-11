# Autenticação de Usuários

Este repositório contém um código Java para autenticar usuários em um sistema utilizando um banco de dados MySQL.

# Funcionalidades

Conexão com o Banco de Dados: O código inclui um método para estabelecer uma conexão com o banco de dados MySQL.

Verificação de Usuário: Há um método que verifica se um usuário com um login e senha fornecidos existe no banco de dados. Se o usuário for encontrado, a variável result é marcada como verdadeira e o nome do usuário é armazenado na variável nome.

# Utilização

Certifique-se de ter o MySQL instalado e configurado em seu ambiente.

Modifique a string de conexão no método conectarBD() para refletir suas credenciais de banco de dados.

Compile e execute o código.

Use o método verificarUsuario(String login, String senha) para verificar a autenticação do usuário.
