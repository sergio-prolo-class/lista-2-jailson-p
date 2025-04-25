package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class App {
    private static final int    DIMENSAO_X      = 1000,
                                DIMENSAO_Y      = 600,
                                ESCALA_MIN      = 0,
                                ESCALA_MAX_X    = 1000,
                                ESCALA_MAX_Y    = 600;
    private Draw draw;

    public static void main(String[] args) {
        App janela = new App();
        janela.draw.show();
    }

    public App() {
        this.draw = new Draw();
        this.draw.setCanvasSize(DIMENSAO_X,DIMENSAO_Y);
        this.draw.setXscale(ESCALA_MIN,ESCALA_MAX_X);
        this.draw.setYscale(ESCALA_MIN,ESCALA_MAX_Y);
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}