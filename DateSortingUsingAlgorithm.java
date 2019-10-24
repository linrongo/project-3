import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DateSortingUsingAlgorithm {
	
	 private HashMap<LocalDate, Integer> dates;
	 
	public DateSortingUsingAlgorithm() throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("SortingDates.txt"));
			dates = new HashMap<LocalDate,Integer>();
			
			String input = file.readLine();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date;
			final int LIMIT = 20;
			
			for (int i = 1; i <= LIMIT; ++i){
				input = input.trim();
				input = input.replace(" ", "");
				
				date = LocalDate.parse(input, formatter);	
				dates.put(date,i);
				
				input = file.readLine();
				
			}
		file.close();
	 }
	public void dateHashMapSortedDescending() {
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(Collections.reverseOrder());
		sort.putAll(dates);
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey());  				
	}
	public void dateHashMapSorted() {
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(dates); 
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey());  			
	}
}
