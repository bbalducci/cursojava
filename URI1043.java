import java.util.Scanner;

public class URI1043{
    public static void main (String args []){
        Scanner teclado =  new Scanner (System.in);
        double a,b,c;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();


        if ((a + b) > (c) && (b + c) > (a) && (c + b) > (a))  {
            System.out.printf("Perimetro =%.2f\n",a+b);            
        }
        
    }
}