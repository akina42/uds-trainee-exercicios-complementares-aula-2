public class Macaco extends Animal {

    public Macaco(){
        super();
    }

    @Override
    protected void andar() {
        super.andar();
    }

    public void comerBanana(){
        System.out.println("\nO macaco está comendo uma outra banana.");
    }

    public void comer(){
        System.out.println("O macaco está comendo uma banana.");
    }
}
