# TesteCaixaBranca

Foram encontrados 2 erros:

1- Erro na linha 12:
O código Class.forName("com.mysql.Driver.Manager").newInstance(); está incorreto. O nome correto da classe do driver do MySQL é "com.mysql.cj.jdbc.Driver".

2- Erro na linha 24:
Falta de espaço após a palavra-chave "where":
Nas linhas em que a consulta SQL é montada (sql += " where login= " + "'" + login + "'";), faltava um espaço antes de "where".

Refiz o código e corrigi os erros apontados no código novo.
