import java.util.Scanner;

public class URI1051{
    public static void main (String args []){
        Scanner teclado =  new Scanner (System.in);
        double renda, imposto;

        renda = teclado.nextDouble();
       
        if (renda <= 2000.0) {
            System.out.println("Isento\n");      
        }
        else if (renda >= 2000.0 && renda < 3000.00){
            System.out.printf("Imposto devido R$ %.2f\n",imposto = renda * 8.0 / 100);
        }
        else if (renda >= 3000 && renda < 4500){
            System.out.printf("Imposto devido R$ ",imposto = renda * 18.0 / 100);         
        }
        else if (renda > 4500){
            System.out.printf("Imposto devido R$ ",imposto = renda * 28.0 / 100);
        }
    }
}