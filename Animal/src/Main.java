import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Animal> arrayAnimal = new ArrayList<>();

        Macaco macaco = new Macaco();
        Coelho coelho = new Coelho();

        arrayAnimal.add(macaco);
        arrayAnimal.add(coelho);


        arrayAnimal.stream().forEach(animal -> {
            animal.andar();
            animal.comer();
        });

        macaco.comerBanana();

    }

}
