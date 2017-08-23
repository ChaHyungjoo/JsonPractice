import java.util.ArrayList;

import org.json.*;

public class JsonProgram {

	public static void main(String[] args) {
		String str = "{\"firstname\":\"Jesper\",\"surname\":\"Aaberg\",\"phone\":[\"555-0100\",\"555-0120\"]}";
		
		JSONObject obj = new JSONObject(str);
		
		String firstname = null;
		String surname = null;
		ArrayList<String> phone = new ArrayList<>();
		
		firstname = obj.getString("firstname");
		surname = obj.getString("surname");
		
		JSONArray array = (JSONArray)obj.get("phone");
		
		for(int i=0; i<array.length(); i++) {
//			String _phone = (String)array.get(i);
			String _phone = array.getString(i);
			phone.add(_phone);
		}
		
		System.out.println(firstname);
		System.out.println(surname);
		System.out.println(phone.get(0));
		System.out.println(phone.get(1));

	}

}
