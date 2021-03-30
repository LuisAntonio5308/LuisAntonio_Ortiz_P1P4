
package Practica4;
import java.util.Scanner;

public class practica4 {
    Scanner sc = new Scanner (System.in);
        private double resultado = 0;
        private double suma=0;
        double[] numero;
        
    public void definir(){
        
        numero = new double[10];
        System.out.println("PRACTICA 4");
        System.out.println("Deberas ingresar 10 numeros, el sistema sacara el promedio");
        System.out.println("------------------------------------------------------------");
        
    for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un numero ["+ (i+1)+ "]: ");
            numero[i]= sc.nextDouble();
            suma = suma + numero[i];
            System.out.println("------------------------------------------------------------");
        }
    
    }
    
    public void sacar(){
    resultado = suma / 10;
    
    }
    
    public void imprimir(){
    System.out.println("El Promedio es: " + resultado);
    }
    
    
    
}
