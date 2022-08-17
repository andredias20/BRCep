import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                searchCEP("85902215"));
    }

    public static Localizacao searchCEP(String cep) {
        if (cep.length() != 8) {
            System.out.println("CEP Inválido");
            return null;
        } else {
            String replaced = cep.replaceAll("[^0-9]*", "");

            JSONObject obj = null;

            try {
                URI url = new URI("https://ws.apicep.com/cep.json?code=" + replaced);

                var request = HttpRequest.newBuilder(url).GET().build();

                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String body = response.body();

                obj = new JSONObject(body);

            } catch (Exception e) {
                e.printStackTrace();
            }

            // (String cep, String rua, String bairro, String municipio, String uf)
            Localizacao locale = new Localizacao(
                    obj.getString("code"),
                    obj.getString("address"),
                    obj.getString("district"),
                    obj.getString("city"),
                    obj.getString("state"));

            return locale;
        }
    }
}
