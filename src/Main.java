// importa as classes Random e Scanner para gerar números aleatórios e ler a entrada do usuário
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner é usado para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // random é usado para gerar números aleatórios
        Random random = new Random();
        // a variável points é usada armazenar a pontuação total do usuário
        int points = 0;
        // a variável keepplaying serve para para controlar o laço do jogo
        boolean keepplaying = true;

        // inicia um laço while que continua executando enquanto keepplaying for true
        while (keepplaying) {
            // gera um número aleatório entre 1 e 10
            int drawnnumber = random.nextInt(10) + 1;

            // solicita o palpite do usuário.
            System.out.print("Digite seu palpite (1 a 10): ");
            int guess = scanner.nextInt();

            // verificação do palpite e atualização da pontuação do usuário
            if (guess == drawnnumber) {
                points += 10;
                System.out.println("Parabéns! Você acertou o número. Ganhou 10 pontos.");
            } else if (guess == drawnnumber - 1 || guess == drawnnumber + 1) {
                points += 5;
                System.out.println("Quase lá! Você estava a 1 de distância do número sorteado. Você ganhou 5 pontos.");
            } else {
                System.out.println("Que pena! Você não ganhou pontos desta vez.");
            }

            // exibe a pontuação total
            System.out.println("Sua pontuação total é: " + points);

            // pergunta se o usuário deseja jogar novamente
            System.out.print("Deseja jogar novamente? (digite 's' para sim/digite 'n' para não): ");
            // declara a variável char para armazenar a resposta do usuário sobre se deseja continuar jogando ou não
            char answer = scanner.next().charAt(0);
            keepplaying = (answer == 's');
        }

        // fecha o scanner
        scanner.close();
    }
}
