/*
Luis Gerardo Caamal Chuc
luis02gerardo@gmail.com
9831408020
 */


import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class Main {
    public static void main (String[]args){
    
        Cuadrado C = new Cuadrado();
        Cubo cubo = new Cubo();
        
        Scanner entrada = new Scanner (System.in);
        double num1, num2, num3, resultado;
        int opcion;
        boolean opc= true;
        
        while(opc = true){
            
            System.out.println("Elija alguna opcion por favor");
            System.out.println("1 Calcular Area de un Cuadrado");
            System.out.println("2 Calcular perimetro de un Cuadrado");
            System.out.println("3 Calcular Calcular volumen de un Cubo");
            System.out.println("4 Calcular Perimetro de un Cubo");
            System.out.println("5 FInalizar programa");
            opcion = entrada.nextInt();
           
            if (opcion ==5){
                System.out.println("Finalizado");
                break;
            } else{
                
                switch (opcion){
                
                case 1:
                    System.out.println("ingrese el valor de un lado");
                    num1= entrada.nextInt();
                    resultado = C.CalcularArea(num1);
                    System.out.println("El Area es " + resultado);
                
                    break;
                
                case 2: 
                    System.out.println("Ingrese valor de un lado");
                    num1 = entrada.nextInt();
                    resultado = C.CalcularPerimetro(num1);
                    System.out.println("El Perimetro es " + resultado);
                
                break;
                
                case 3:
                    System.out.println("Ingrese largo del cubo");
                    num1= entrada.nextInt();
                    System.out.println("Ingrese ancho del cubo");
                    num2=entrada.nextInt();
                    System.out.println("Ingrese altura del cubo");
                    num3= entrada.nextInt();
                    resultado = cubo.CalcularVolumen(num1,num2,num3);
                    System.out.println("El volumen es " + resultado + " cm^3");
                    
                    break;
                    
                case 4:
                    System.out.println("ingrese el valor de un lado del cubo");
                    num1= entrada.nextInt();
                    resultado = cubo.CalcularPerimetro(num1);
                    System.out.println("El perimetro es: " + resultado);
                    
                }
                
            }
        
        
        }
        
    }
    
}
