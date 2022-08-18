package Interface;
import org.json.JSONObject;

import model.Localizacao;

public interface cepAPI {

    public String link(String cep);

    public Localizacao build(JSONObject obj);

}
