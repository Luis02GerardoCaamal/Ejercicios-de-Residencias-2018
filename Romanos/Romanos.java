/*
Luis Gerardo Caamal Chuc
luis02gerardo@gmail.com
9831408020
 */


import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;


public class Romanos {
    public static void main (String[]args){
        
       
      Scanner sc=new Scanner(System.in);
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String Millar[]={"", "M"};
      System.out.println("Ingresa numero entre 1 y 1000");
      int numero = sc.nextInt();
      //Se divide el numero ingresado por su misma equivalencia
      int unidad=numero%10;
      int decena=(numero/10)%10;
      int centena=numero/100;
      int millar=numero/1000;
      
      if (numero==1000){
          System.out.println("El numero " + numero +" en Romanos es: " + Millar[millar]);
      }else{
      if(numero>=100){         
          System.out.println("El numero " + numero +" en Romanos es: " + Centena[centena]+Decena[decena]+Unidad[unidad]);
      }else {
          if(numero>=10){
              System.out.println("El numero " + numero +" en Romanos es: " + Decena[decena]+Unidad[unidad]);          
          }else{
              System.out.println("El numero " + numero +" en Romanos es: " + Unidad[numero]);          
                }         
            }          
        }
    }  
}