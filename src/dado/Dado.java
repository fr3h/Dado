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
            System.out.println("Para lanzar un dado presione 0, para lanzar dos dados presione 1 y para salir cualquier otra tecla");
            lanzar = teclado.nextInt();
            dado = aleatorio.nextInt(caras)+1;
            
            if(lanzar==0){
                System.out.print("\nEl numero que ha salido es: ");
                System.out.println(dado);
            }
            
            int[] x= new int[]{1,2};
            if(lanzar==1){
                System.out.print("\nEn el dado nº "+x[0]+" ha salido el número: ");
                System.out.println(x[0]=dado);
                
                dado = aleatorio.nextInt(caras)+1;
                System.out.print("En el dado nº "+x[1]+" ha salido el número: ");
                System.out.println(x[1]=dado);
                
                if(x[0]==x[1]){
                    System.out.println("\nHa salido el mismo numero");
                }
                else {
                    System.out.println("\nLos dados no han coincidido");
                }
            }
            
        }while(lanzar==0);
    }
    
}
