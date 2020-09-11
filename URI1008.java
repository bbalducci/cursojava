import java.util.Scanner;
public class URI1008 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int number, horas;
        double valorHora, salary;

        number = teclado.nextInt();
        horas  = teclado.nextInt();
        valorHora = teclado.nextDouble();
        
        salary = (horas * valorHora);

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n",salary);
       
    }

}