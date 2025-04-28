package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class App {
    private static final int DIMENSAO_X   =  1000,
                             DIMENSAO_Y   =  600,
                             ESCALA_MIN   =  0,
                             ESCALA_MAX_X =  1000,
                             ESCALA_MAX_Y =  600,
                             X_INIT =  50,
                             Y_INIT =  50,
                             DIM_X_RETANGULO = 40,
                             DIM_Y_RETANGULO = 40;
    private static final String TITULO = "Batalha Naval";

    private final Draw draw;

    public static void main(String[] args) {
        App janela = new App();

        Grade grade = new Grade(X_INIT,Y_INIT);
        janela.getDraw().setPenColor(Draw.GREEN);
        grade.setDimensaoRetangular(DIM_X_RETANGULO,DIM_Y_RETANGULO);
        grade.desenhar(janela.getDraw());

        //área de testes início:
        Grade grade1 = new Grade(550,50);
        janela.getDraw().setPenColor(Draw.BLUE);
        grade.setDimensaoRetangular(DIM_X_RETANGULO,DIM_Y_RETANGULO);
        grade1.desenhar(janela.getDraw());
        janela.getDraw().setVisible(false);
        grade.objetoGrade(janela.getDraw(),2,2,5,2,false,"","");//<------tete barco

        //área de testes fim:

        janela.draw.show();

    }

    public App() {
        this.draw = new Draw();
        this.draw.setTitle(TITULO);
        this.draw.setCanvasSize(DIMENSAO_X,DIMENSAO_Y);
        //this.draw.setScale(ESCALA_MIN,ESCALA_MAX_X);<-----------dúvida sobre necessidade TODO avaliar a necessidade de .setScale
        this.draw.setXscale(ESCALA_MIN,ESCALA_MAX_X);
        this.draw.setYscale(ESCALA_MIN,ESCALA_MAX_Y);
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }

    private Draw getDraw(){return this.draw;}

    @Override
    public String toString() {
        return String.format("Dimensao Janela (x;y): ( %d;%d)\nEscala Max (x;y): (%d;%d)",DIMENSAO_X,DIMENSAO_Y,ESCALA_MAX_X,ESCALA_MAX_Y);
    }
}