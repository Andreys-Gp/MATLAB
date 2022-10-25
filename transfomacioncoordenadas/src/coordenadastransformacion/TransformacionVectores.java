package coordenadastransformacion;

import javax.swing.*;
import java.awt.*;

public class TransformacionVectores {
    public static void main(String[] args) {

        String operacion= JOptionPane.showInputDialog("sistema de coordenada vector inicial ");
         String operacion2=JOptionPane.showInputDialog("coordenada a convertir ");

         //vector desea convertir cartesiana
       if (operacion.equalsIgnoreCase("cartesiana")) {
            System.out.println("coordenada inicial cartesiana");
            System.out.println("toma datos vector inicial " + operacion );

            //cartesiana a cilindrica
           if (operacion2.equalsIgnoreCase("cilindrica")) {
               String ejex= JOptionPane.showInputDialog("ingrese coordenada en (X)");
               String ejez= JOptionPane.showInputDialog("ingrese coordenada en (Z)");
               String ejey= JOptionPane.showInputDialog("Ingrese coordenada en (Y)");

               //producto cruz
               String Ap= "(cos(J)"+ejex + " " + "+" + "sen(J)"+ejey;
               String Arho= "-sen(J)"+ejex + " " + "+" + "cos(J)"+ejey;
               String Az=ejez;

               //depurador
               String Ap1=Ap.replace("x","pcos(J)");
               String Ap2=Ap1.replace("y","psen(J)");

               String Arho1=Arho.replace("x","pcos(J)");
               String Arho2=Arho1.replace("y","psen(J)");

               String Az1=Az.replace("x","pcos(J)");
               String Az2=Az1.replace("y","psen(J)");

              System.out.println("vector final es \n" + "ejep " + Ap2 + "\n"
                       + "eje rho " + Arho2 + "\n"
                       + "ejez " + Az2);

              LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
              tomaDatos[0]=new LaminaEmprimir(Ap2,Arho2,Az2);



           }



           //cartesiana a esferica
           if (operacion2.equalsIgnoreCase("esferica")) {
               String ejex= JOptionPane.showInputDialog("ingrese coordenada en (X)");
               String ejez= JOptionPane.showInputDialog("ingrese coordenada en (Z)");
               String ejey= JOptionPane.showInputDialog("Ingrese coordenada en (Y)");

               //producto cruz
               String Ar= "sin(B)cos(J)"+ejex + " " + "sin(B)sin(J)"+ejey + " " + "cos(B)"+ejez;
               String Atheta= "cos(B)cos(J)"+ejex + " " + "cos(B)sin(J)"+ejey + " " + "-sin(B)"+ejez;
               String Arho="-sin(J)"+ejex + " " + "cos(J)"+ejey;

               //depurador
               String Ar1=Ar.replace("x","rsin(B)cos(J)");
               String Ar2=Ar1.replace("y","rsin(B)sin(J)");
               String Ar3=Ar1.replace("z","rcos(B)");

               String Atheta1=Atheta.replace("x","rsin(B)cos(J)");
               String Atheta2=Atheta1.replace("y","rsin(B)sin(J)");
               String Atheta3=Atheta2.replace("z","rcos(B)");

               String Arho1=Arho.replace("x","rsin(B)cos(J)");
               String Arho2=Arho1.replace("y","rsin(B)sin(J)");
               String Arho3=Arho2.replace("z","rcos(B)");

               System.out.println("vector final es \n" + "ejer " + Atheta3 + "\n"
                       + "eje theta " + Arho3 + "\n"
                       + "ejerho " + Arho3);
               LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
               tomaDatos[0]=new LaminaEmprimir(Ar3,Atheta3,Arho3);
           }
        }
        else



        // vector inicial silindrico
        if (operacion.equalsIgnoreCase("cilindrica")) {
            System.out.println("coordenada inicial cilindrica");
            System.out.println("toma datos vector inicial " + operacion );

            //cilindrica a esferica
            if (operacion2.equalsIgnoreCase("esferica")) {
                String ejep= JOptionPane.showInputDialog("ingrese coordenada en (P)");
                String ejez= JOptionPane.showInputDialog("ingrese coordenada en (Z)");
                String rho= JOptionPane.showInputDialog("Ingrese coordenada en (J)");

                //producto cruz
                String Ar="sin(B)"+ejep + " " + "cos(B)"+ejez ;
                String Atheta="cos(B)"+ejep + " " + "-sin(B)"+ejez;
                String Arho= rho;

                //Depurador
                String Ar1=Ar.replace("p","rsin(B)");
                String Ar2=Ar1.replace("z","rcos(B)");

                String Atheta1=Atheta.replace("p","rsin(B)");
                String Atheta2=Atheta1.replace("z","rcos(B)");

                String Arho1=Arho.replace("p","rsin(B)");
                String Arho2=Arho1.replace("z","rcos(B)");

                System.out.println("vector final es \n" + "ejer " + Ar2 + "\n"
                        + "eje theta " + Atheta2 + "\n"
                        + "ejerho " + Arho1);
                LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
                tomaDatos[0]=new LaminaEmprimir(Ar2,Atheta2,Arho2);
            }

            //cilindrica a cartesiana
            if (operacion2.equalsIgnoreCase("cartesiana")) {
                String ejep= JOptionPane.showInputDialog("ingrese coordenada en (P)");
                String rho= JOptionPane.showInputDialog("ingrese coordenada en (rho) (rho=J angulo))");
                String ejez= JOptionPane.showInputDialog("Ingrese coordenada en (z)");

                // producto cruz
                String Ax= "(cos(J)"+ejep + " " + "+" + "-sen(J)"+rho;
                String Ay= "sen(J)"+ejep + " " + "+" + "cos(J)"+rho;
                String Az=ejez;

                // depurador
                String Ax1=Ax.replace("J","tan^-1(y/x)");
                String Ax2=Ax1.replace("p","(x^2+y^2)^1/2");

                String Ay1=Ay.replace("J","tan^-1(x/y)");
                String Ay2=Ay1.replace("p","(x^2+y^2)^1/2");

                String Az1=Az.replace("J","tan^-1(x/y)");
                String Az2=Az1.replace("p","(x^2+y^2)^1/2");

                System.out.println("vector final es \n"
                        + "eje " + Ax2 + "\n"
                        + "eje " + Ay2 + "\n"
                        + "eje " + Az2);
                LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
                tomaDatos[0]=new LaminaEmprimir(Ax2,Ay2,Az2);
            }
        }






     else





        //vector inicial esferico
        if (operacion.equalsIgnoreCase("esferica")) {
            System.out.println("coordenada a convertir esferica");
            System.out.println("toma datos vector inicial " + operacion );

            //esferica a cilindrica
            if (operacion2.equalsIgnoreCase("cilindrica")) {
                String ejer= JOptionPane.showInputDialog("ingrese coordenada en (r) ");
                String rho= JOptionPane.showInputDialog("ingrese coordenada en (rho) (rho= J angulo)");
                String theta= JOptionPane.showInputDialog("ingrese coordenada en (theta) (theta=B angulo)");

                //producto cruz
                String Ap="sen(B)"+ejer + " " + "cos(B)"+theta;
                String Arho=rho;
                String Az="cos(B)"+ejer + " " + "-sin(B)"+theta;

                //depuradpr
                String Ap1=Ap.replace("r","(p^2+z^2)^1/2");
                String Ap2=Ap1.replace("B","tan^-1(p/z)");

                String Arho1=Arho.replace("r","(p^2+z^2)^1/2");
                String Arho2=Arho1.replace("B","tan^-1(p/z)");

                String Az1=Az.replace("r","(p^2+z^2)^1/2");
                String Az2=Az1.replace("B","tan^-1(p/z)");

                System.out.println("vector final es \n" + "ejep " + Ap2 + "\n"
                        + "eje rho " + Arho2 + "\n"
                        + "ejez " + Az2);
                LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
                tomaDatos[0]=new LaminaEmprimir(Ap2,Arho2,Az2);
            }

            //esferica a cartesiana
            if (operacion2.equalsIgnoreCase("cartesiana")) {
                String ejer= JOptionPane.showInputDialog("ingrese coordenada en (r)");
                String rho= JOptionPane.showInputDialog("ingrese coordenada en (rho) (rh0=J angulo)");
                String theta= JOptionPane.showInputDialog("ingrese coordenada en (theta) (theta=B angulo)");

                // producto cruz
                String Ax= "(cos(B)cos(J)"+ejer + " " + "+" + "cos(B)cos(J)"+theta + " " + "+" + "-sen(J)"+rho;
                String Ay= "sen(B)sen(J)"+ejer + " " + "+" + "cos(B)sen(J)"+theta + " " + "+" + "soc(J)"+rho;
                String Az="cos(B)"+ejer + "+" + "-sen(B)"+rho;

                // depurador
                String Ax1=Ax.replace("r","(x^2+y^2+z^2)^1/");
                String Ax2=Ax1.replace("B","tan^-1((x^2+y^2)^1/2)/Z");
                String Ax3=Ax2.replace("J","than^-1(y/x)");

                String Ay1=Ay.replace("r","(x^2+y^2+z^2)^1/");
                String Ay2=Ay1.replace("B","tan^-1((x^2+y^2)^1/2)/Z");
                String Ay3=Ay2.replace("J","than^-1(y/x)");

                String Az1=Az.replace("r","(x^2+y^2+z^2)^1/");
                String Az2=Az1.replace("B","tan^-1((x^2+y^2)^1/2)/Z");
                String Az3=Az2.replace("J","than^-1(y/x)");

                System.out.println("vector final es \n" + "eje " + Ax2 + "\n"
                        + "eje " + Ay2 + "\n"
                        + "eje " + Az2);
                LaminaEmprimir [] tomaDatos=new LaminaEmprimir[1];
                tomaDatos[0]=new LaminaEmprimir(Ax3,Ay3,Az3);
               // System.out.println(impresion);

            }
        }


    }
}

class LaminaEmprimir  extends  JPanel{
    public LaminaEmprimir(String coordenada1, String coordenada2, String coordenada3){
        this.coordenada1=coordenada1;
        this.coordenada2=coordenada2;
        this.coordenada3=coordenada3;
    }

    public String coordenada1;
    public String coordenada2;
    public String coordenada3;

    public String impresion (String coordenada1,String coordenada2,String coordenada3)
    {
       /* System.out.println("vector final es \n" + "eje " + Ax2 + "\n"
                + "eje " + Ay2 + "\n"
                + "eje " + Az2); */
        return "vector final es \n" + "eje:" + " coordenada1 " + "\n"
               +"eje:" + " coordenada2 " + "\n"
                +"eje:" + " coordenada3 " ;
    }
}




/*class marcoConTexto extends JFrame {
    public  marcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("marco con texto");
        lamina miLamina =new lamina();
        add(miLamina);
    }
}
//sobre esctirura clases invocacion metodos
class  lamina extends JPanel{
    public void paintComponent (Graphics g){
        g.drawString("Estamos aprendiendo Swing",100,100);
    }
}
*/