package fr.ambulR.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller
public class Controller_pageGoogleAPI {

	@RequestMapping("/API_google")
	public String googlepipi(Model model) throws ClientProtocolException, IOException, JSONException {

		String lat_origin = "43.532863";
		String long_origin = "5.372646";
		String lat_destination = "43.511931";
		String long_destination = "5.443309";

		String myUrl = "https://maps.googleapis.com/maps/api/distancematrix/json?units=meter&origins=" + lat_origin
				+ "," + long_origin + "&destinations=" + lat_destination + "," + long_destination
				+ "&key=AIzaSyDm8KU6CEskrqATYlyyVQ5hJoL4b5gL7L0";

		String json = Request.Get(myUrl).connectTimeout(1000).socketTimeout(1000).execute().returnContent().asString();

		System.out.println(data(json)[0]);
		System.out.println(data(json)[1]);
		System.out.println(data(json)[2]);
		System.out.println(data(json)[3]);

		return "page_googleAPI";
	}

	public String[] data(String jsonLine) throws JSONException {

		String destination_addr = new JSONObject(jsonLine).get("destination_addresses").toString();
		String origin_addresses = new JSONObject(jsonLine).get("origin_addresses").toString();

		JSONObject jsonRespRouteDistance = new JSONObject(jsonLine).getJSONArray("rows").getJSONObject(0)
				.getJSONArray("elements").getJSONObject(0).getJSONObject("distance");
		JSONObject jsonRespRouteDuration = new JSONObject(jsonLine).getJSONArray("rows").getJSONObject(0)
				.getJSONArray("elements").getJSONObject(0).getJSONObject("duration");
		String distance = jsonRespRouteDistance.get("text").toString();
		String time = jsonRespRouteDuration.get("text").toString();

		String resultat[] = { destination_addr, origin_addresses, distance, time };
		return resultat;
	}

}
