package interface;
import org.json.JSONObject;

import model.Locale;

public interface cepAPI {

    public String link(String cep);

    public Locale build(JSONObject obj);

}
