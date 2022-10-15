package one.digitalinnovation.gof.singletom;

public class SingletomLazy {

    private static SingletomLazy instancia;

    private SingletomLazy() {
        super();
    }

    public static SingletomLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletomLazy();
        }
        return instancia;
    }
}
