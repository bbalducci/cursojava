import java.util.Scanner;

public class Uri1066{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor;
        int contador;
        int numerosPares=0;
        int numerosImpares=0;
        int numerosPositivos=0;
        int numerosNegativos=0;



        for (contador = 1; contador <= 5 ; contador = contador + 1){

            valor = teclado.nextInt();

            if (valor %2==0){
                numerosPares     = numerosPares+1; 
            }
            else{
                numerosImpares   = numerosImpares+1; 
            }
            if (valor > 0) {
                numerosPositivos = numerosPositivos+1; 
            }
            else if (valor < 0) {
                numerosNegativos = numerosNegativos+1; 
            }

            
        }

        System.out.println(numerosPares+" valor(es) par (es)");
        System.out.println(numerosImpares+" valor(es) impar (es)");
        System.out.println(numerosPositivos+" valor(es) positivo (s)");
        System.out.println(numerosNegativos+" valor(es) negativo (s)");
        
    }

}