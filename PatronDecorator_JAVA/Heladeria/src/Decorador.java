
import java.util.Scanner;


public class Decorador {
    public static void main(String... args){
    
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("Heladeria la Solucion");
        System.out.println("*********************");
        System.out.println();int name = 1;
        
        Helado helado = new Helado();
        
        int opcion = 0;
        do{
        System.out.println("Agregar al helado:");
        System.out.println("1=Chispas, 2=Melmelada, 3=Toppins, 0=Terminar");
        opcion = sc.nextInt();
        
        switch(opcion){
            
            case 0:
                break;
                
            case 1:
                helado = new Chispas(helado);
                break;
                
            case 2:
                helado = new Melmelada(helado);
                break;
            
            case 3:
                helado = new Toppins(helado);
                break;  
            
            default:
                System.out.println("La opcion no es valida");
                
        }
    }while(opcion!=0);
       
        System.out.println();
        System.out.println("Entregando...");
        System.out.println(helado.getDescripcion());
        System.out.println("Disfrute su pedido");         
                
    }   
    
}
