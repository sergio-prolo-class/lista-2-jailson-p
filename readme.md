[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)  

# Lista 2: Modelagem de classes e uso de dependências   
## Etapa 1
### Dependência e inicialização da aplicação

 -[x] Dependência pacote edu.princeton.cs.algs4  
        --arquivo algs4.jar na devida pasta  
        --adicionada a dependência no build.gradle
 -[x] Criar um objeto da classe edu.princeton.cs.algs4.Draw  
 - [x] Criar um mét. construtor para a classe App. 
   - [x] Usar janela de dimensão 1000 x 600 pixels  
   - [x] Usar uma escala de 0 a 1000 no eixo x da janela  
   - [x] Usar uma escala de 0 a 600 no eixo y da janela  
   - [x] Fechar a janela quando o usuário clicar no botão de fechar a janela  
 -[x] Crie um objeto App e faça o seu objeto draw mostrar seu conteúdo.  
   - [x] Ao executar a aplicação ela deve criar uma janela em branco nas especificações anteriores e com um botão de fechar.  
## Etapa 2  
### Grade
Modele uma classe chamada Grade que é de desenhar uma grade do tabuleiro de batalha naval
-[ ] A classe Grade deve ter um método público chamado desenhar que recebe um objeto Draw como argumento.  
-[ ] O método desenhar deve usar o objeto Draw para desenhar uma grade 10 times 10 na tela.  
-[ ] Cada célula da grade deve ter dimensão de 40 x 40 pixels.  
-[ ] A grade deve ser desenhada com seu canto inferior esquerdo na posição (x, y) da tela. Os valores de x e y devem ser informados durante a construção do objeto Grade.  
-[ ] A grade deve ser desenhada com rótulos para as linhas e colunas, como na Figura 1.  