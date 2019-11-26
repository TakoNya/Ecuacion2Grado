package ecuacion2gradoapp;
import java.util.Scanner;

public class Ecuacion2GradoApp {

        public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el valor de a");
        int a = teclado.nextInt();
        System.out.println("Introduce el valor de b");
        int b = teclado.nextInt();
        System.out.println("Introduce el valor de c");
        int c = teclado.nextInt();
        
        double discriminante = Math.pow(b, 2) - (4*a*c);
        
        //Mensaje de traza.
        System.out.println(">>" + discriminante);
        
        if (discriminante > 0){
            double x1=(-b) + Math.sqrt (discriminante) / (2*a);
            double x2=(-b) - Math.sqrt (discriminante) / (2*a);
            
            System.out.println("El valor de x2 es " + x1 + " yu el valor de x2 es " + x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
       
    }
    
}
