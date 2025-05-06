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
-[x] A classe Grade deve ter um método público chamado desenhar que recebe um objeto Draw como argumento.  
-[x] O método desenhar deve usar o objeto Draw para desenhar uma grade 10 times 10 na tela.    
-[x] Cada célula da grade deve ter dimensão de 40 x 40 pixels.  
-[x] A grade deve ser desenhada com seu canto inferior esquerdo na posição (x, y) da tela. Os valores de x e y devem ser informados durante a construção do objeto Grade.    
-[x] A grade deve ser desenhada com rótulos para as linhas e colunas, como na Figura 1.  
## Etapa 3 
### Navio  
 Modele uma classe chamada Navio que é capaz de desenhar um navio em uma grade, como na Figura 2.  
 Especificamente:  
 -[x] A classe Navio deve ter um método público chamado desenhar que recebe um objeto Draw como argumento.  
 -[x] O método desenhar deve usar o objeto Draw para desenhar um navio na tela.  
 -[x] O objeto Navio deve ser construído com argumentos para definir à qual Grade ele pertence, seu tamanho, posição (x, y) na grade e orientação (vertical ou horizontal) (Por exemplos, o Navio da Figura 2 possui tamanho 5, posição (3, 2) e orientação vertical)    
 -[x] O Navio deve ser desenhado como uma série de quadrados coloridos. A dimensão dos quadrados é igual ao tamanho da célula da Grade (40 × 40 pixels). A cor dos quadrados deve ser a mesma dos rótulos da Grade.  
  
## Etapa 4
### Imagem do jogo  
  Use objetos Grade e Navio para criar uma imagem de um jogo de batalha naval, como na Figura 3.  
  Gerar essa imagem deve ser o comportamento padrão da execução da aplicação (resultado de executar  
  ./gradlew run no terminal).  


Para esse fim:  
-[x] Crie duas grades e posicione elas em lados opostos da tela. A grade da esquerda representa o
tabuleiro do jogador, enquanto a grade da direita representará os alvos do jogador no tabuleiro inimigo.  
-[x] Crie cinco navios e posicione-os na grade a esquerda, representando os navios do jogador. Posicioneos como na Figura 3.  
  


