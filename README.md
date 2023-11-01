# Projetos-3
Este repositório sera usado para o desenvolvimento de uma solução para o site Libreflix

# NextGem

<img src="![image](https://github.com/Kal-0/Projetos-3/assets/106926790/936b7897-ef0e-4d67-baab-a907efd32b74)" alt="image" style="width: 50%; height: 50%;">
![image](https://github.com/Kal-0/Projetos-3/assets/106926790/ea0798c2-0194-4da3-92db-a3dd556113e3)



# Objetivo | Goal
Aplicativo que tem como objetivo tornar mais fácil armazenar e avaliar as atividades de residentes cursando um programa de especialização no Hospital das Clínicas!

Application to make it easier to store and evaluate the activities of residencies attending a specialization program at the Hospital das Clínicas!



# Arquivos presentes 📄 

O projeto possui uma pasta principal chamada "Projetos-2", que por si mesmo possui os arquivos main.c, necessário para iniciar a aplicação onde lá se encontra a maior parte de manipulação de atividade, o utils.c, arquivo que abriga a maioria das funções e lógica entre as mesmas, utils.h onde ocorre a declaração das variáveis, funções e structs. É válido salientar que algumas funções tem como objetivo criar arquivos .txt que este são apresentados na pasta "Projetos-2". Com a utilização do sqlite3 foi necessário por questão de organização criar duas pastas sqlite3 que esta abriga os arquivos sqlite3.c e sqlite3.h arquivos fundamentais para a execução do banco de dados. O banco de dados chamado "db.sqlite3" é criado em uma pasta específica para ele chamada "BD". Além disso, existem outros arquivos como o .gitignore utilizado majoritariamente na filtragem de arquivos para o GITHUB e o Makefile é um arquivo que serve como um compilador para ambos sistemas operacionais.

# Requisitos
1- Git Bash <br>
2- GNU Compiler Collection(GCC) - (PATH) <br>

# Como usar
1- Clone o repositório em uma pasta <br>
2- Abra o a pasta do repositório <br>
3- Gere o executavel inserindo esse o comando no terminal: <br>
```
gcc main.c utils.c ./sqlite3/sqlite3.c -o ./executables/hclass.exe
```
4- Execute o programa inserindo esse o comando no terminal: <br>
```
./executables/hclass.exe
```


# Observações 👀

No momento o código do projeto se encontra com apenas algumas de suas funcionalidades implementadas devido ao pouco espaço de tempo entre a conclusão da interface do protótipo, e o prazo de entrega do código implementado.

O ideal para testar a aplicação é se cadastrando como um usuário do tipo "Gestão" e/ou "Residente", por possuirem o fluxo mais completo.



# Contribuintes | Contributors



## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

Desenvolvedores:
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Kal-0">
        <img src="https://avatars.githubusercontent.com/u/106926790?s=400&u=d51d91a8d447afbb4a9d0be21d664b82d7091fc5&v=4" width="100px;" alt="Foto Kal"/><br>
        <sub>
          <b>Caio Cesar</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Fiend3333">
        <img src="https://avatars.githubusercontent.com/u/116087739?v=4" width="100px;" alt="Foto Diogo"/><br>
        <sub>
          <b>Diogo Henrique</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/camilacirne">
        <img src="https://avatars.githubusercontent.com/u/28824856?v=4" width="100px;" alt="Foto Camila Cirne"/><br>
        <sub>
          <b>Camila Cirne</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/bela975">
        <img src="https://avatars.githubusercontent.com/u/113048987?v=4" width="100px;" alt="Foto Isabela Spinelli"/><br>
        <sub>
          <b>Isabela Spinelli</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/MaluArr">
        <img src="https://avatars.githubusercontent.com/u/99887403?v=4" width="100px;" alt="Foto Maria Luisa"/><br>
        <sub>
          <b>Maria Luisa</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/mariajuliapessoa">
        <img src="https://avatars.githubusercontent.com/u/112356614?v=4" width="100px;" alt="Foto Maria Julia"/><br>
        <sub>
          <b>Maria Julia</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

