import java.util.Scanner;

public class Uri1070{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int contador;
        valor = teclado.nextInt();

        if (valor %2 ==0){
            valor = valor+1;
        }


        for (contador = 1; contador <= 6 ; contador = contador + 1){

        System.out.println(valor);
        valor = valor + 2;
               
        }

      
              
    }

}