package one.digitalinnovation.gof.singletom;

public class SingletomEager {
    private static SingletomEager instancia = new SingletomEager();

    private SingletomEager() {
        super();
    }

    public static SingletomEager getInstancia() {

        return instancia;
    }


}
