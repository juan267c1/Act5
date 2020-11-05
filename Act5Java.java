
package act5java;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Act5Java {

public static Scanner sc= new Scanner(System.in);    
public static void main(String[] args){
     double numX;
     double numY;
    
    System.out.println("Introdusir el primer valor : ");
    numX=sc.nextDouble();
    System.out.println("Introdusir el segundo vlor : ");
    numY=sc.nextDouble();
    System.out.println("Valores X:" + numX + " Y: "+ numY);
    System.out.println("Suma: "+(numX+numY));
    System.out.println("Resta: "+(numX-numY));
    System.out.println("Multiplicacion: "+(numX*numY));
    System.out.println("Division: "+(numX/numY));
    System.out.println("Modulo: "+(numX%numY));
    
}
    
}
   
    

