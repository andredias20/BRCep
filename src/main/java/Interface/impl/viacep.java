package Interface.impl;

import org.json.JSONObject;

import Interface.cepAPI;
import model.Locale;

public class viacep implements cepAPI{

    @Override
    public String link(String cep) {
        return "https://viacep.com.br/ws/"+cep+"/json/";
    }

    @Override
    public Locale build(JSONObject obj) {
        Locale l = new Locale(
            obj.getString("cep"), 
            obj.getString("logradouro"), 
            obj.getString("bairro"), 
            obj.getString("localidade"), 
            obj.getString("uf"));
        return l;
    }
    
}
