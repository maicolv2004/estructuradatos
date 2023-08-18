
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
     
      int[] arregloa= new int [10];
      int[] arreglob = new int [10];
      int[] arregloProducto = new int[10];
        
        for (int i = 0; i < 10; i++) {
           System.out.println("\n ingresa el numeros del arreglo A" );
           arregloa[i]= sc.nextInt();
            
        }
        System.out.println("los numero del arregloa");
        for (int i = 0; i < arregloa.length; i++) {
            System.out.println("numero "  + arregloa[i] );
    }
        for (int i = 0; i < 10; i++) {
            System.out.println("\n ingresa el numero del arreglo B ");
            arreglob[i]=sc.nextInt();
        }
        System.out.println("los numeros del arreglob");
        for (int i = 0; i < arreglob.length; i++) {
            System.out.println("numero "  + arreglob[i]);
            
        }
     
        for (int i = 0; i < arregloa.length; i++) {
            arregloProducto[i] = arregloa[i] * arreglob[i];
            
        }
        for (int i = 0; i < arregloProducto.length; i++) {
            System.out.println("el producto es " + arregloProducto[i]);
            
            
        }
     System.out.println("\n buscar el elemento ingresado " );
        
    }
    
}
