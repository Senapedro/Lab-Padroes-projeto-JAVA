package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singletom.SingletomEager;
import one.digitalinnovation.gof.singletom.SingletomLazy;
import one.digitalinnovation.gof.singletom.SingletomLazyHolder;
import one.digitalinnovation.gof.strategy.*;

import java.awt.*;

public class Teste {

    public static void main(String[] args) {
        SingletomLazy lanzy = SingletomLazy.getInstancia();
        System.out.println(lanzy);
        lanzy = SingletomLazy.getInstancia();
        System.out.println(lanzy);

        SingletomEager eager = SingletomEager.getInstancia();
        System.out.println(eager);
        eager = SingletomEager.getInstancia();
        System.out.println(eager);

        SingletomLazyHolder lanzyHolder = SingletomLazyHolder.getInstancia();
        System.out.println(lanzyHolder);
        lanzyHolder = SingletomLazyHolder.getInstancia();
        System.out.println(lanzyHolder);

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Pedro", "1990001");
    }
}
