package dado;
/**
 * @author frehy
 */
import java.util.Random;
import java.util.Scanner;

public class Dado {

    public static void main(String[] args) {
        Random aleatorio=new Random();
        Scanner teclado=new Scanner(System.in);
        int dado, lanzar, caras;
        
        System.out.println("¿Cuantas caras tiene el dado?");
        caras = teclado.nextInt();
        
        do{
            System.out.println("Para lanzar el dado presione 0 y para salir cualquier otra tecla");
            lanzar = teclado.nextInt();
            dado = aleatorio.nextInt(caras)+1;
            
            if(lanzar==0){
                System.out.print("El numero que ha salido es: ");
                System.out.println(dado);
            }
            
        }while(lanzar==0);
    }
    
}
