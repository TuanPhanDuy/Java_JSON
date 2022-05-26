package Json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class DecodeJson {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("json/emp.json");
		JsonReader jr = Json.createReader(in);
		
		JsonObject jo = jr.readObject();
		JsonNumber id= jo.getJsonNumber("id");
		String name = jo.getString("name");
		JsonNumber salary = jo.getJsonNumber("salary");
		
		Employee employee = new Employee(id.longValue(), name, salary.doubleValue());
		System.out.println(employee);
	}
}
