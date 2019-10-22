import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{

	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		 TreeMap<String, Integer> sort = new TreeMap<>(asciiVal); 
	        for (Map.Entry<String, Integer> entry : sort.entrySet())  
	            System.out.println(entry.getKey() + " " + entry.getValue());  
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		return null;
	}

}