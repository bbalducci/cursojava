import java.util.Scanner;

public class Exercicio2e{

    public static void main(String args[]){

        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão



        int area, baseMaior, baseMenor, altura;



        System.out.println("Por favor, digite o valor da base maior, base menor e altura");
        baseMaior = teclado.nextInt();
        baseMenor = teclado.nextInt ();
        altura = teclado.nextInt ();

        
        area = (baseMaior + baseMenor)*altura /2;



        System.out.println("A area do Trapezio vale "+area);



    }

}
