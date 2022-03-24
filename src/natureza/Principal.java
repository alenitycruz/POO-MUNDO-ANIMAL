package natureza;

public class Principal {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();
        Canguru ca = new Canguru();
        PeixeDourado pd = new PeixeDourado();
        Tartaruga t = new Tartaruga();
        Cobra co = new Cobra();

        ca.locomover();


        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println(m.toString());

        c.setPeso(4.5f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();

        System.out.println(c.toString());

    }
}
