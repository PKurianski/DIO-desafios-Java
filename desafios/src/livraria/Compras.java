package desafios.src.livraria;

import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
          
        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine();
        
        double precoTotal = (livro1.getPreco() * livro1.getQuantidade()) + (livro2.getPreco() * livro2.getQuantidade());
        String precoTotalFormatado = String.format("%.2f", precoTotal);
        
        int quantidadeTotal = (livro1.getQuantidade() + livro2.getQuantidade());
        
        System.out.println("Valor total da compra: " + precoTotalFormatado);
        System.out.println("Numero de livros comprados: " + quantidadeTotal);
        System.out.println("Obrigado por comprar na nossa livraria!");
        
        }
    }
      
    static class Livro {
        String nome;
        double preco;
        int quantidade;
        
        Livro(String nome, double preco, int quantidade) {
          this.nome = nome;
          this.preco = preco;
          this.quantidade = quantidade;
        }
        
        public String getNome() {
            return nome;
        }
        
        public double getPreco() {
            return preco;
        }
        
        public int getQuantidade() {
            return quantidade;
        }
    }
}
