package desafios.src.irlanda;

import java.util.Scanner;

public class MudancaIrlanda {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
         
           // Leitura do salário e dos benefícios
           double salarioBruto = input.nextDouble();
           double beneficios = input.nextDouble();
     
           double imposto = 0;
           
           //Implemente as regras para o cálculo do imposto.
           if(salarioBruto <= 1100){
             imposto = (5*salarioBruto)/100;
           }
           else if(salarioBruto > 1100 && salarioBruto <= 2500){
             imposto = salarioBruto/10;
           }
           else{
             imposto = (15*salarioBruto)/100;
           }
     
           // Cálculo do salário líquido
           double salarioLiquido = salarioBruto - imposto + beneficios;
         
           //Imprimir o salário líquido com 2 casas decimais.
           String salarioLiquidoFormatado = String.format("%.2f", salarioLiquido);
           System.out.println(salarioLiquidoFormatado);
         
        }
    }
}
