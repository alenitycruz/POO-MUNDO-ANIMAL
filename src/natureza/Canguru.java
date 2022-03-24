package natureza;

public class Canguru extends Mamifero{
    public void usarbolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
