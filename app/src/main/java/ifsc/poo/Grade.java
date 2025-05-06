package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
    private static String alpha = "A";
    private static String numSt = "0";
    private final int   X_INIT,
            Y_INIT;
    private int dimensaoRetX,
            dimensaoRetY;
    private int dimensaoXgrade,
            dimensaoYgrade;

    public Grade(int x0, int y0) {
        this.X_INIT = x0;
        this.Y_INIT = y0;
        this.dimensaoRetX = 40;
        this.dimensaoRetY = 40;
        this.dimensaoXgrade = 10;
        this.dimensaoYgrade = 10;
    }

    public void desenhar(Draw draw) {
        //linhasAuxiliares(draw,1000,600,50);
        //Criar um loop para distribuir os retângulos cobrindo uma área 10x10 de retângulos
        //Neste loop também acrescenta os rótulos das coordenadas da grade
        objetoGrade(draw,1,1,getDimensaoXgrade(),getDimensaoYgrade(),true,alpha,numSt);

    }
    /**
     * Desenha células da grade em uma Grade.
     * <p>
     * Utiliza coordenadas iniciais e finais para fazer uma
     * seguência de retângulos vazados ou cheios na grade.
     * Booleana 'reg' = true, desenha retângulos vazados, o contrário somente os retângulos cheios.
     * Classe {@link Grade}.
     * </p>
     *
     * @author Jailson Pedro
     * @version 1.0
     * @since 1.0
     */
    public void objetoGrade(Draw draw, int xCelulaInit, int yCelulaInit, int xCelulaEnd,int yCelulaEnd, boolean retanguloVazado,String rotuloVertical,String rotuloHorizontal){
        int     posX ,
                posY;
        for (int xGrade = xCelulaInit; xGrade <= xCelulaEnd ; xGrade++) {
            for (int yGrade = yCelulaInit; yGrade <= yCelulaEnd ; yGrade++ ){
                posX = getX_INIT() + getDimensaoRetX() * xGrade - getDimensaoRetX() / 2;
                posY = getY_INIT() + getDimensaoRetX() * yGrade - getDimensaoRetY() / 2;

                if (retanguloVazado)draw.rectangle(posX, posY, getDimensaoRetX() /2, getDimensaoRetY()/2);
                else draw.filledRectangle (posX, posY, (getDimensaoRetX() /2), (getDimensaoRetY()/2));

                //Desenha os rótulos
                if(xGrade == 1 && retanguloVazado) {
                    draw.text(posX - getDimensaoRetX(), posY , rotuloVertical);
                    rotuloVertical = Character.toString(rotuloVertical.charAt(0) + 1);
                }
                if(yGrade == 1 && retanguloVazado) {
                    draw.text(posX, posY - getDimensaoRetY(), rotuloHorizontal);
                    rotuloHorizontal = String.valueOf(Integer.parseInt(rotuloHorizontal) + 1);
                }
            }
        }

    }
    //Mét. GET, retorna dimensão X do retângulo
    private int getDimensaoRetX(){ return this.dimensaoRetX; }

    //Mét. GET, retorna dimensão Y do retângulo
    private int getDimensaoRetY(){ return this.dimensaoRetY; }

    //Mét. GET, retorna quantidade de células (retângulos) em X
    private int getDimensaoXgrade(){ return this.dimensaoXgrade; }

    //Mét. GET, retorna quantidade de células (retângulos) em Y
    private int getDimensaoYgrade(){ return this.dimensaoYgrade; }

    private int getX_INIT(){ return this.X_INIT;}

    private int getY_INIT() { return this.Y_INIT;}

    public void setDimensaoRetangular(int dimX,int dimY){
        this.dimensaoRetX = dimX;
        this.dimensaoRetY = dimY;
    }

    private void linhasAuxiliares(Draw draw, int pixelX, int pixelY, int escala){
        for(int i = 0; i <= pixelX; i+=escala){
            draw.setPenColor(Draw.OLIVE);
            draw.line(i,0,i,pixelY);
            draw.setPenColor(Draw.GRAY);
            draw.line(0,i,pixelX,i);
        }
    }
}
