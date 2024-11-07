import java.util.Scanner;

// Exceção personalizada para validação de parâmetros
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        // Declaração do Scanner para entrada de dados pelo terminal
        Scanner terminal = new Scanner(System.in);

        try {
            // Leitura do primeiro parâmetro
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();  // Lê o primeiro número inteiro

            // Leitura do segundo parâmetro
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();  // Lê o segundo número inteiro

            // Chama o método de contagem, passando os dois parâmetros
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Captura a exceção personalizada e imprime a mensagem
            System.out.println(e.getMessage());
        } finally {
            // Fecha o Scanner para liberar o recurso
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcular a quantidade de iterações
        int contagem = parametroDois - parametroUm;
        
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
