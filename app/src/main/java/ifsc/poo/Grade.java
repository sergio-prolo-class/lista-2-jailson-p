package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private final int   X_INIT,
                        Y_INIT;
    private int dimensaoRetX,
                dimensaoRetY;
    private int celulasX,
                celulasY;

    public Grade(int x0, int y0) {
        X_INIT = x0;
        Y_INIT = y0;
        this.dimensaoRetX = 40;
        this.dimensaoRetY = 40;
        this.celulasX = 10;
        this.celulasY = 10;

    }

    public static void desenhar(Draw draw) {
        //Usar um retângulo vazio como célula da grade com dimensão 40X40
        //Criar um loop para distribuir os retângulos cobrindo uma área 10x10 de retângulos
        //Neste loop também acrescenta os rótulos das coordenadas da grade
    }
    //Mét. GET, retorna dimensão X do retângulo
    private int getDimensaoRetX(){ return this.dimensaoRetX; }

    //Mét. GET, retorna dimensão Y do retângulo
    private int getDimensaoRetY(){ return this.dimensaoRetY; }

    //Mét. GET, retorna quantidade de células (retângulos) em X
    private int getCelulasX(){ return this.celulasX; }

    //Mét. GET, retorna quantidade de células (retângulos) em Y
    private int getCelulasY(){ return this.celulasY; }
}