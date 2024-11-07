import java.util.Scanner;

// Exceção personalizada para validação de parâmetros
class ParametrosInvalidosException extends Exception {
    // Construtor da exceção que recebe uma mensagem
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);  // Chama o construtor da classe Exception passando a mensagem
    }
}

public class Contador {
    public static void main(String[] args) {
        // Declaração do Scanner para entrada de dados pelo terminal
        Scanner terminal = new Scanner(System.in);

        try {
            // Leitura do primeiro parâmetro
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();  // Lê o primeiro número inteiro

            // Leitura do segundo parâmetro
            System.out.println("Digite o segundo parâmetro");
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

    // Método para contar e imprimir os números incrementados
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção personalizada com uma mensagem de erro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações (número de elementos a serem impressos)
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
