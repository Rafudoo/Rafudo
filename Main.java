import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teste_Livro
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        livro.exibirInformacoes();
        System.out.print("\n");

        // Teste_Aluno
        Aluno aluno = new Aluno("João", "20251234", 9.5);
        aluno.exibirDados();
        System.out.print("\n");
        
        //Teste_Conta
        Conta conta = new Conta("12345", "Maria", 1000);
        conta.depositar(500);
        conta.sacar(200);
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.print("\n");

        //Teste_Produto
        Produto produto = new Produto("Camisa", 79.90, 10);
        produto.vender(2);
        System.out.println("Quantidade restante: " + produto.getQuantidade());
    }
}