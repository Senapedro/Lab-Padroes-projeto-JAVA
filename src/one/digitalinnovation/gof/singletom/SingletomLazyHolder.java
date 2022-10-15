package one.digitalinnovation.gof.singletom;

public class SingletomLazyHolder {

    private static class instanceHolder {
        public static SingletomLazyHolder instancia = new SingletomLazyHolder();
    }

    private SingletomLazyHolder() {
        super();
    }

    public static SingletomLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
}
