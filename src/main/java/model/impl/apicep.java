package model.impl;

import org.json.JSONObject;

import Interface.cepAPI;
import model.Locale;

public class apicep implements iCepAPI {

    @Override
    public String link(String cep) {
        return "https://ws.apicep.com/cep.json?code="+cep;
    }

    @Override
    public Locale build(JSONObject obj) {
        Locale locale = new Locale(
                    obj.getString("code"),
                    obj.getString("address"),
                    obj.getString("district"),
                    obj.getString("city"),
                    obj.getString("state"));
        return locale;
    }
    
}
