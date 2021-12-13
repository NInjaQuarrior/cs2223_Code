package cs2223Assign4;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONLoader {

	String path = "C:\\Users\\cmmck\\git\\cs2223\\cs2223Assign4\\src\\cs2223Assign4\\network_large_directed_multiEdge.json";

	public void decodeFile() {
		try {
			JSONParser parser = new JSONParser();

			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(path));

			JSONArray Links = (JSONArray) jsonObject.get("links");
			JSONArray Nodes = (JSONArray) jsonObject.get("nodes");

			for (Object obj : Nodes) {
				JSONObject jObj = (JSONObject) obj;
				// makeNode(JSONObject jObj);
			}
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
	}

}
