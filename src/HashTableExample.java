import java.util.Hashtable;
import java.util.Enumeration;

/**
 * 
 * @author andres.rubiano
 *
 * This example shown the simply way to create a hashtable, populate it and how to display it's key-value pair using
 * enumeration
 * 
 */
public class HashTableExample {
	
	public static void main (String[] args) {
		Enumeration enume;
		String key;
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("2", "Juan");
		hashtable.put("4", "Harrisson");
		hashtable.put("6", "Lucky");
		hashtable.put("1", "Tired");
		hashtable.put("3", "Trees");
		
		enume = hashtable.keys();
		while (enume.hasMoreElements()) {
			key = (String) enume.nextElement();
			System.out.println("Key => " + key + " | Values => " + hashtable.get(key));
		}
	}
}