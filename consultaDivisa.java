import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class consultaDivisa {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/8b5cb7464fecd0a090c4d6ba/pair/";

    public double obtenerTipoCambio(String baseCode, String targetCode) {
        String url = API_URL + baseCode + "/" + targetCode;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Divisas divisas = new Gson().fromJson(response.body(), Divisas.class);

            if (divisas.result().equals("error")) {
                return -1; // Retorna un valor negativo para indicar que ocurrió un error
            }

            return divisas.conversion_rate();

        } catch (Exception e) {
            System.out.println("No se encontraron las divisas seleccionadas.");
            return -1; // Retorna un valor negativo para indicar que ocurrió un error
        }
    }
}


