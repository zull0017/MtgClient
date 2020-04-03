package client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.CardsetListPojo;

public class RestClient {

	private Client client = ClientBuilder.newClient();
	private WebTarget target = client.target("https://api.scryfall.com/");

	public CardsetListPojo createMtgPojo() {
		Response response = target.path("sets").request(MediaType.APPLICATION_JSON).get();

		String jsonString = response.readEntity(String.class);
		Gson gson = new GsonBuilder().create();
		CardsetListPojo mtgPojo = gson.fromJson(jsonString, CardsetListPojo.class);

		return mtgPojo;
	}

	public static void main(String[] args) {
		RestClient rs = new RestClient();

		for (int i = 0; i <= 15; i++) {
			System.out.println(rs.createMtgPojo().getData().get(i).getName());
		}

	}
}
