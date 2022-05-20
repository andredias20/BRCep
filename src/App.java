
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import org.json.*;

public class App {
    public static void main(String[] args) throws Exception {
        searchCEP("8590215").toString();
    }

    public static Localizacao searchCEP(String cep) {
        JSONObject obj = null;
        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json/");
            URLConnection conUrl = url.openConnection();
            
            //obj = new JSONObject(HTTP.toJSONObject(/**/));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new Localizacao(obj.getString("cep"), obj.getString("logradouro"), obj.getString("bairro"), obj.getString("localidade"), obj.getString("uf"));

    }
}
