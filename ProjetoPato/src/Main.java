public class Main {

    public static void main(String[] args){
        IPato patoDeCabecaVermelha = new PatoDeCabecaVermelha();
        IPato patoCibernetico = new PatoCibernetico();

        patoDeCabecaVermelha.voar();
        patoCibernetico.voar();
    }
}
