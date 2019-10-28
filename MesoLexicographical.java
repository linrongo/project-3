import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
	// get sorted map and print out contents
		Map<String, Integer> sort = sortedMap(asciiVal);
		 for (Map.Entry<String, Integer> entry : sort.entrySet())  
	            System.out.println(entry.getKey()); 
	}

	@Override
	protected Map<String, Integer> sortedMap (HashMap<String, Integer> unsorted) {
	// sort using TreeMap
		Map<String, Integer> sort = new TreeMap<>(unsorted);       
        return sort;
	}
}