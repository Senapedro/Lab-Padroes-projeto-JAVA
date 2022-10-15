package subsitema2.cep;

import one.digitalinnovation.gof.singletom.SingletomEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Canitar";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }

}
