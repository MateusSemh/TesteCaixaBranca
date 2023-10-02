# TesteCaixaBranca

Foram encontrados 3 erros:

1- Falta de documentação no código, há somente um comentário no código todo ("// INSTRUÇÃO SQL") e também o código não tem nenhuma separação, está todo junto e fica ruim de intepretá-lo.

2- Erro na linha 24:
Falta de espaço antes da palavra-chave "where":
Nas linhas em que a consulta SQL é montada (sql += "where login= " + "'" + login + "'";), faltava um espaço antes de "where...".

3- Erro na linha 27: sql += " and senha = " + "'" + senha + "';";
O ponto e vírgula dentro da consulta ("';"), não deveria existir e ainda poderia ser feito todo junto, da linha 25 até a 27


## Grafo

![image](https://github.com/MateusSemh/TesteCaixaBranca/assets/103202120/57103608-d07b-4af8-8e7a-9f57872e6aec)


 ## Complexidade ciclomática

 São 14 arestas
 11 nós

 Aplicando a fórmula: Complexidade ciclomática = Arestas – Nós +2
 A complexidade é de 5.
