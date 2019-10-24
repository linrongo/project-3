import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{
	private Map<String,Integer> unSortedMap;
	
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		this.unSortedMap = asciiVal;
		Map<String, Integer> sort = sortedMap(asciiVal);
		 for (Map.Entry<String, Integer> entry : sort.entrySet())  
	            System.out.println(entry.getKey()); 
	}

	@Override
	protected Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		Map<String, Integer> sort = new TreeMap<>(unsorted); 
        
        return sort;
	}
}