import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArteG9 {
  
  private static final int ANCHO = 800;
  private static final int ALTO = 800;
  private static final int MIN = 0;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 50;
  private int [][] dibujo = null;
  
  private JFrame f = null;
  
  private BufferedImage imagen = null;
  
  public ObraDeArteG9(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
     dibujo = new int[ANCHO][ALTO];
    //getdibujo();

     dibujarCirculosAleatorios(100, 500);
   


    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
         imagen.setRGB(i, j, dibujo[i][j]);
      } //for
    } //for
    
    f = new JFrame("Mi obra de arte"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
    
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f.repaint();
    f.setVisible(true);
  }// constructor
  

  public void dibujarCirculosAleatorios(int cantidad, int tamMaximo){
    for (int i = 0 ; i< cantidad; i++){
      int tamMedio = cantidad/2 + 1;
      int xPos = (int)(Math.random()*(ANCHO-tamMaximo)+tamMedio);
      int yPos = (int)(Math.random()*(ALTO-tamMaximo)+tamMedio);
      int color = (int)(Math.random()*(255 + 255*255 + 255*255*255));
      dibujarCirculo(xPos,yPos,tamMaximo/2,color,true);
    }
  }

  public void getdibujo(){
    dibujo = new int[ANCHO][ALTO];
    int aleatorio = 0;
    //for(int i=0;i<ANCHO;i+=SUBMATRIZ){
      for(int j=0;j<ALTO;j+=SUBMATRIZ){
        aleatorio = MIN + (int)(Math.random() * (MAX - MIN));
        for (int k = 0; k < ANCHO; k++) {
          for (int m = 0; m < SUBMATRIZ; m++) {
            dibujo[k][m+j] = aleatorio; 
          }
        }
      //} //for 
    }
  } //getdibujo
  
  public void dibujarCirculo(int x, int y, int radio, int color, boolean rellenar){

    double x1, y1;
   
    for (double angulo = 0; angulo < 360; angulo+=1){
      x1 = radio * Math.cos(angulo * Math.PI/180);
      y1 = radio * Math.sin(angulo * Math.PI/180);
      int posXFinal = (int)(x+x1);
      int posYFinal = (int)(y+y1);
      if (rellenar){
        dibujarLinea(x,y,posXFinal,posYFinal, color);  
      }
      else{
        dibujo[posXFinal][posYFinal] = color;
      }
      
    }


  }

  public void dibujarLinea(int fI, int cI, int fF, int cF, int color){
    int fICopia = fI < fF ? fI : fF;
    fF = fI > fF ? fI : fF;
    fI = fICopia;

    int cICopia = cI < cF ? cI : cF;
    cF = cI > cF ? cI : cF;
    cI = cICopia;

    for (int f = fI; f < fF ; f++){
      for (int c = cI; c < cF; c++){
        if (f >= 0 && c >= 0 && f < dibujo.length && c < dibujo[f].length){
          dibujo[f][c] = color;  
        }
      }
    }



  }
  
  
  public static void main(String[] args){
    ObraDeArteG9 o = new ObraDeArteG9();
  }
}

