import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Jogo jogo = new Jogo(100);
        Integer numeroRodada = 1;
        Integer opcaoEscolhida = 0;
        System.out.println("\n\n------------JOGO PAR OU ÍMPAR------------");
        System.out.println("\n Você ganhou 100 pontos pra começar o jogo, vamos para a primeira rodada!");

        while (jogo.getPontuacaoJogador() > 0){

            System.out.println("\n\n********** Rodada " + numeroRodada + " **********");
            System.out.println("\nTente acertar se o próximo número será par ou ímpar!\n" +
                    "Digite 1 se você acha que será par ou 2 para ímpar: ");
            System.out.println("" +
                    "\n[1] Par" +
                    "\n[2] Ímpar" +
                    "\n[3] Sair do jogo");
            Scanner scanner = new Scanner(System.in);
            opcaoEscolhida = scanner.nextInt();

            if(opcaoEscolhida.equals(3)){
                System.out.println("\nVocê escolheu sair do jogo. Até breve!");
                System.exit(0);
            }

            Integer numeroAleatorio = jogo.sorteioNumeroAleatorio(0, 99);
            System.out.println("\nO número sorteado foi: " + numeroAleatorio);

            String mensagemJogador = jogo.verificaSeJogadorAcertou(numeroAleatorio, opcaoEscolhida);
            System.out.println(mensagemJogador);

            System.out.println("\nPONTUAÇÃO ATUAL: " + jogo.getPontuacaoJogador());

            numeroRodada++;
        }

    }
}
