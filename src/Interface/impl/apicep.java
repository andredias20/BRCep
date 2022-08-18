package Interface.impl;

import org.json.JSONObject;

import Interface.cepAPI;
import model.Localizacao;

public class apicep implements cepAPI {

    @Override
    public String link(String cep) {
        return "https://ws.apicep.com/cep.json?code="+cep;
    }

    @Override
    public Localizacao build(JSONObject obj) {
        Localizacao locale = new Localizacao(
                    obj.getString("code"),
                    obj.getString("address"),
                    obj.getString("district"),
                    obj.getString("city"),
                    obj.getString("state"));
        return locale;
    }
    
}
