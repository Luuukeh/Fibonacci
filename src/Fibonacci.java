import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        int fibonacciAtual = 0;
        int fibonacciProximo = 1;
        boolean pertence = false;
        
        while (fibonacciAtual <= num) {
            if (fibonacciAtual == num) {
                pertence = true;
                break;
            }
            int temp = fibonacciProximo;
            fibonacciProximo = fibonacciAtual + fibonacciProximo;
            fibonacciAtual = temp;
        }
        
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
