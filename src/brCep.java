import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

import Interface.cepAPI;
import model.Localizacao;

public class brCep {
    public static Localizacao searchCEP(String cep, cepAPI api) {
        String rCep = cep.replaceAll("[^0-9]*", "");
        if (rCep.length() != 8) {
            System.out.println("CEP Inválido");
            return null;
        } else {

            JSONObject obj = null;

            try {
                String link = api.link(rCep);

                // Making the http configuration
                URI url = new URI(link);
                var request = HttpRequest.newBuilder(url).GET().build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String body = response.body();

                // System.out.println(body);

                obj = new JSONObject(body);

            } catch (Exception e) {
                e.printStackTrace();
            }

            Localizacao locale = api.build(obj);

            return locale;
        }
    }
}
