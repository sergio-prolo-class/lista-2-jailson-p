package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {
    private int tamanho;
    private int xInicial;
    private int yInicial;
    private boolean orientation;
    Grade minhGrade;

    public Navio(Grade minhaGrade, int xInicial, int yInicial, int tamanho, boolean orientation){
        this.tamanho = tamanho-1;
        this.xInicial = xInicial+1;
        this.yInicial = yInicial+1;
        this.orientation = orientation;
        this.minhGrade = minhaGrade;
    }

    public void desenhar(Draw draw){
        int xFinal = (this.orientation) ? (this.xInicial + this.tamanho): this.xInicial;
        int yFinal = (this.orientation) ? this.yInicial : (this.yInicial + this.tamanho) ;
        draw.setPenColor(Color.RED);
        this.minhGrade.objetoGrade(draw,this.xInicial,this.yInicial,xFinal,yFinal,false,"","");

    }
}