package desafios.src.lojageek;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
          double media = scanner.nextDouble();
    
          if(media < 5){
            System.out.println("REP");
          }
          
          else if(media >= 5 && media < 7){
            System.out.println("MED");
          }
          
          else{
            System.out.println("APR");
          }
          
        }
      }
}
