package one.digitalinnovation.gof.facade;

import subsistema1.CRM.CrmService;
import subsitema2.cep.CepApi;

public class facade {
    public void migrarCliente(String name, String cep){
       String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        String nome = null;
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
