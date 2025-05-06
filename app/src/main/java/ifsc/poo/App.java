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
                             X_INIT_2 = 550,
                             DIM_X_RETANGULO = 40,
                             DIM_Y_RETANGULO = 40;
    private static final String TITULO = "Batalha Naval";

    private final Draw draw;

    public static void main(String[] args) {
        App janela = new App();
        janela.getDraw().enableDoubleBuffering();

        Grade grade1 = new Grade(X_INIT,Y_INIT);
        grade1.setDimensaoRetangular(DIM_X_RETANGULO,DIM_Y_RETANGULO);
        janela.getDraw().setPenColor(Draw.GREEN);
        grade1.setDimensaoRetangular(DIM_X_RETANGULO,DIM_Y_RETANGULO);

        Navio barca0 = new Navio(grade1,0,0,4,true);
        barca0.desenhar(janela.getDraw());

        Navio barca1 = new Navio(grade1,5,1,3,false);
        barca1.desenhar(janela.getDraw());

        Navio barca2 = new Navio(grade1,3,2,5,false);
        barca2.desenhar(janela.getDraw());

        Navio barca3 = new Navio(grade1,7,5,3,false);
        barca3.desenhar(janela.getDraw());

        Navio barca4 = new Navio(grade1,1,8,2,true);
        barca4.desenhar(janela.getDraw());

        janela.getDraw().setPenColor(Draw.GREEN);
        grade1.desenhar(janela.getDraw());

        Grade grade2 = new Grade(X_INIT_2,Y_INIT);
        janela.getDraw().setPenColor(Draw.BLUE);
        grade2.desenhar(janela.getDraw());

        janela.draw.show();

    }

    public App() {
        this.draw = new Draw();
        this.draw.setTitle(TITULO);
        this.draw.setCanvasSize(DIMENSAO_X,DIMENSAO_Y);
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