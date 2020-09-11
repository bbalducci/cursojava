import java.util.Scanner;

public class Uri1067{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int contador;
        valor = teclado.nextInt();


        for (contador = 1; contador <= valor ; contador = contador + 2){

        System.out.println(+contador);
               
        }

      
              
    }

}