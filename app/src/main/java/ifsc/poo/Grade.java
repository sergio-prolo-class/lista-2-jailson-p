package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {
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
        //Usar um retângulo vazio como célula da grade com dimensão 40X40
        //draw.rectangle(this.getX_INIT(),this.getY_INIT(),this.getDimensaoRetX() / 2 ,this.getDimensaoRetY() / 2 ) ;
        //linhasAuxiliares(draw,1000,600,50);
        //Criar um loop para distribuir os retângulos cobrindo uma área 10x10 de retângulos
        String  alpha = "A",
                numSt = "1";

        //Neste loop também acrescenta os rótulos das coordenadas da grade
        draw.setPenColor(Draw.AQUA);
        objetoGrade(draw,1,1,getDimensaoXgrade(),getDimensaoYgrade(),true,alpha,numSt);

    }
    /**
     * Desenha células da grade em uma Grade.
     * <p>
     * Utiliza coordenadas iniciais e finais para fazer uma
     * seguência de retângulos vazados ou cheios na grade.
     * Booleana 'rotulo' = true, imprime os rótulos e retângulos vazados, o contrário somente os retângulos cheios.
     * Classe {@link Grade}.
     * </p>
     *
     * @author Jailson Pedro
     * @version 1.0
     * @since 1.0
     */
    public void objetoGrade(Draw draw, int xCelulaInit, int yCelulaInit, int xCelulaEnd,int yCelulaEnd, boolean rotulos,String rotuloVertical,String rotuloHorizontal){
        int     posX ,
                posY;
        for     (int xGrade = yCelulaInit; xGrade <= xCelulaEnd ; xGrade++) {
            for (int yGrade = xCelulaInit; yGrade <= yCelulaEnd ; yGrade++ ){
                posX = getX_INIT() + getDimensaoRetX() * xGrade - getDimensaoRetX() / 2;
                posY = getY_INIT() + getDimensaoRetX() * yGrade - getDimensaoRetY() / 2;
                if (rotulos)draw.rectangle(posX, posY, getDimensaoRetX() /2, getDimensaoRetY()/2);
                else draw.filledRectangle (posX, posY, getDimensaoRetX() /2, getDimensaoRetY()/2);

                if(xGrade == 1 && rotulos) {
                    draw.text(posX - getDimensaoRetX(), posY , rotuloVertical);
                    rotuloVertical = Character.toString(rotuloVertical.charAt(0) + 1);
                }
                else if(yGrade == 1) {
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
            draw.setPenColor(Draw.BOOK_LIGHT_BLUE);
            draw.line(i,0,i,pixelY);
            draw.setPenColor(Draw.BOOK_LIGHT_BLUE);
            draw.line(0,i,pixelX,i);
        }

    }
}
