import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

import Interface.cepAPI;
import model.Locale;

public class brCep {
    public static Locale search(String cep, cepAPI api) {
        String rCep = cep.replaceAll("[^0-9]*", "");
        if (rCep.length() != 8) {
            throw new RuntimeException("Invalid CEP");
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

                obj = new JSONObject(body);

            } catch (Exception e) {
                e.printStackTrace();
            }

            Locale locale = api.build(obj);

            return locale;
        }
    }
}
