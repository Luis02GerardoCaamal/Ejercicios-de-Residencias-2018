/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gerardo
 */
public class Cubo extends Cuadrado {
    
   public Cubo(){
   
   }
   public double CalcularVolumen(double num1,double num2,double num3){
   double resultado =0;
   resultado =  num1 * num2 *num3;
   return resultado;
   
   }
   public double CalcularPerimetro(double num1){
    double resultado = 0;
    resultado = (num1 * 4) *(6);
    return resultado;  
   }
}
