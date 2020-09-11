import java.util.Scanner;

public class Exercicio2d{

    public static void main(String args[]){

        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão



        int area, diagonal1, diagonal2;



        System.out.println("Por favor, digite o valor da diagonal1 e diagonal2");
        diagonal1 = teclado.nextInt();
        diagonal2 = teclado.nextInt ();

        

        area = diagonal1 * diagonal2;



        System.out.println("A area do retangulo vale "+area);



    }

}
