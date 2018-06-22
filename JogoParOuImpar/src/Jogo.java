import java.util.Random;

public class Jogo {

    private Integer pontuacaoJogador;

    public Jogo(Integer pontuacaoJogador){
        this.pontuacaoJogador = pontuacaoJogador;
    }

    public Integer getPontuacaoJogador() {
        return pontuacaoJogador;
    }

    public void setPontuacaoJogador(Integer pontuacaoJogador) {
        this.pontuacaoJogador = pontuacaoJogador;
    }

    public Integer sorteioNumeroAleatorio(Integer numeroMinimo, Integer numeroMaximo){
        if (numeroMinimo >= numeroMaximo) {
            throw new IllegalArgumentException("\nNúmero máximo deve ser maior que o mínimo.");
        }

        Random random = new Random(System.currentTimeMillis());
        Integer numeroAleatorio = random.nextInt((numeroMaximo - numeroMinimo) + 1) + numeroMinimo;
        return numeroAleatorio;
    }


    public String verificaSeJogadorAcertou(Integer numeroSorteado, Integer opcaoEscolhida){

        Boolean verdadeiroSePar = this.verificaSeParOuImpar(numeroSorteado, opcaoEscolhida);
        String mensagemJogador = "";
        if(verdadeiroSePar && (opcaoEscolhida.equals(1))){
            mensagemJogador = "\nO número sorteado é par!\nParabéns, você acertou e ganhou 10 pontos!";
            this.incrementaPontuacaoJogador();
        }
        else if ((!verdadeiroSePar) && (opcaoEscolhida.equals(2))){
            mensagemJogador = "\nO número sorteado é ímpar!\nParabéns, você acertou e ganhou 10 pontos!";
            this.incrementaPontuacaoJogador();
        }
        else{
            mensagemJogador = "\nVocê errou a aposta, perdeu 10 pontos.";
            decrementaPontuacaoJogador();
        }
        return mensagemJogador;
    }

    public Boolean verificaSeParOuImpar(Integer numeroSorteado, Integer opcaoEscolhida){

        Boolean verdadeiroSePar = false;
        if(numeroSorteado % 2 == 0){
            verdadeiroSePar = true;
        }
        return verdadeiroSePar;
    }

    public void incrementaPontuacaoJogador(){
        this.pontuacaoJogador += 10;
    }

    public void decrementaPontuacaoJogador(){
        this.pontuacaoJogador -= 10;
    }
}
