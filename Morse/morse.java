import java.util.Scanner;
public class morse {
    public static void main(String[]args){
    
    Scanner entrada= new Scanner (System.in);
    
  
    
    // Se crea una cadena para almacenar el codigo Morse
    String [] morse={".-","-...","-.-.","-..",".","..-.", //a-
                    "--.","....","..",".---","-.-",".-..",
                    "--","-.","---",".--.","--.-",".-.","...",
                    "-","..-","...-",".--","-..-","-.--","--..", //z
                    ".----","..---","...--","....-",".....","-....",//1,2,3,4,5,6,7,8,9
                    "--...","---..","----.","-----"," "};
   
   // Significado de las claves morse 
    String []frase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                      "P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4",
                      "5","6","7","8","9","0"," "};
  
   
    String characters[];
    System.out.println("Ingresa la cadena.");
    String cadena = entrada.nextLine();
    

    if ((cadena.contains(".") || cadena.contains("-"))){
      characters = cadena.split(" ");
      for (int i = 0; i < characters.length; i++) {
        for (int j = 0; j < frase.length; j++) {
          String letra = characters[i];
          if (letra.equals(morse[j])) {
            System.out.print(frase[j]);
          }
        }
        System.out.print(" ");
      }
    }else{
      characters = cadena.split("");
      for (int i = 0; i < characters.length; i++) {
        for (int j = 0; j < frase.length; j++) {
          String letra = characters[i];
          if (letra.equals(frase[j])) {
            System.out.print(morse[j] + " ");
          }
        }
      }
    }
  }
}