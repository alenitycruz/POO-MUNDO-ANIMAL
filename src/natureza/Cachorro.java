package natureza;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando quando filhote e comendo racao pedigree quando adulto");
    }
}
