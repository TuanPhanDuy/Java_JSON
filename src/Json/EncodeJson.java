package Json;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class EncodeJson {
	public static void main(String[] args) throws Exception {
		EncodeJson ej = new EncodeJson();
		
		Employee e = new Employee(1, "Tuấn", 100);
		String js = ej.getjson(e);
		ej.export("json/emp.json", js);
		
	}
	
	public String getjson(Employee e) {
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("id", e.getId());
		builder.add("name", e.getName());
		builder.add("salary", e.getSalary());
		JsonObject jo = builder.build();
		return jo.toString();
	}
	
	public void export(String filepath, String json) throws Exception{
		PrintWriter out = new PrintWriter(new FileOutputStream(filepath),true);
		out.println(json);
		out.close();
	}
}
