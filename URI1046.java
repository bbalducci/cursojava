import java.util.Scanner;

public class URI1046{
    public static void main (String args []){
        Scanner teclado =  new Scanner (System.in);
        int HoraInic, HoraFim;
        
        HoraInic = teclado.nextInt();
        HoraFim = teclado.nextInt();

        if (HoraInic == HoraFim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");            
        }
        else if (HoraFim > HoraInic) {
            System.out.println("O JOGO DUROU"+(horaFim-HoraInic)+"HORA(S)");             
        } 
         
   
        else {
           System.out.println("O JOGO DUROU"+(24-horaFim-HoraInic)+"HORA(S)");   
        }
        
    }
}