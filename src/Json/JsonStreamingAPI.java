package Json;

import java.io.StringReader;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;



public class JsonStreamingAPI {
	public static void main(String[] args) {
		final String result = "{\r\n" + 
				"	\"id\": 1,\r\n" + 
				"	\"name\": \"Tuấn\",\r\n" + 
				"	\"salary\": 100.0\r\n" + 
				"}";
		final JsonParser parser = Json.createParser(new StringReader(result));
		String key = null;
		String value = null;
		while (parser.hasNext()) {
			final Event event = parser.next();
			switch (event) {
			case KEY_NAME:
				key = parser.getString();
				System.out.println(key);
				break;
			case VALUE_STRING:
				value = parser.getString();
				System.out.println(value);
				break;
			case END_ARRAY:
				break;
			case END_OBJECT:
				break;
			case START_ARRAY:
				break;
			case START_OBJECT:
				break;
			case VALUE_FALSE:
				break;
			case VALUE_NULL:
				break;
			case VALUE_NUMBER:
				break;
			case VALUE_TRUE:
				break;

			default:
				break;
			}
		}
		parser.close();
	}
}
