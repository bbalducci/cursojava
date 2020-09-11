import java.util.Scanner;

public class Uri1074{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int ValorN, ValorX, contador;
        
        ValorN = teclado.nextInt();
        
for (contador = 1; contador <= ValorN ; contador = contador + 1){
            ValorX = teclado.nextInt();
            if (ValorX == 0){
                System.out.println("NULL");                
            }
            else if (ValorX < 0 && ValorX % 2 ==0){
                System.out.println("EVEN NEGATIVE");                                        
            }
            else if (ValorX < 0 && ValorX % 2 !=0){
                System.out.println("ODD NEGATIVE");                               
            }
            else if (ValorX > 0 && ValorX % 2 ==0){
                System.out.println("EVEN POSITIVE");                                
            }
              else if (ValorX > 0 && ValorX % 2 !=0){
                System.out.println("ODD POSTIVE");
            }
        }  
    }   
}