// my btc program
// programmer: Cruz Macias
package coinapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileReader;

import java.util.Iterator;
import java.util.Map;

// third party dependent
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
	
	// parse file api_payload.json
	Object obj = new JSONParser().parse(new FileReader("api_payload.json"));
	
	// typecast obj to JSONObject
	JSONObject jo = (JSONObject) obj;

	// get the bpi
	Map bpi = ((Map)jo.get("bpi"));

	// iterator for bpi map
	Iterator<Map.Entry> itr1 = bpi.entrySet().iterator();
	while(itr1.hasNext()) {
		Map.Entry pair = itr1.next();	
		//System.out.println(pair.getKey() + " : " + pair.getValue());
		System.out.println(pair.getKey() + ":");

		Map btc = ((Map)pair.getValue());
		Iterator<Map.Entry> i = btc.entrySet().iterator();

		while(i.hasNext()) {
			Map.Entry p = i.next();
			System.out.println(p.getKey() + ": " + p.getValue());
		}
		System.out.println();
	}

	String disclaimer = (String) jo.get("disclaimer");
	System.out.println(disclaimer);
		
	} // end main class
}
