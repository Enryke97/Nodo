
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Main
{
   public static void main (String[] args){
        Pilas p = new Pilas();

     
        String Inser="";
        
        while(!Inser.equals("8")){
            System.out.println("Menu ");
            System.out.println("1 Insertar");
            System.out.println("2 Mostrar");
            System.out.println("3 Buscar");
            System.out.println("4 Eliminar");
            System.out.println("5 Contar");
            System.out.println("6 Minimo");
            System.out.println("7 Maximo");
            System.out.println("8 Terminar");

            Scanner sc= new Scanner(System.in);
            System.out.println("Elije la opcion ");
            Inser=sc.nextLine();

            switch(Inser)
            {case "1":
                System.out.println("Ingresa el valor: ");
                int valor=sc.nextInt();
                p.push(valor);
                
                break;
                case "2":
                p.peek();

                break;
                case "3":
                p.cima();


                break;
                case "4":
                p.pop();
                break;
                case "5":
                
                break;
                case "6":
                
                break;
                case "7":
                
                break;
                case "8":
                System.out.println(Inser);
                break;
                default:
                System.out.println("Error no existe la opcion");
                break;
            }

        }

    }
}
