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
	// read file
		BufferedReader file = new BufferedReader(new FileReader("SortingDates.txt"));
			dates = new HashMap<LocalDate,Integer>();		
			String input = file.readLine();
			
		// Create DateTime format so it works with
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date;
			final int LIMIT = 20;
		// go though all the lines in the file	
			for (int i = 1; i <= LIMIT; ++i){
			// Trim and delete all spaces
				input = input.trim();
				input = input.replace(" ", "");
			// turn it LocalDate and put it in the HashMap	
				date = LocalDate.parse(input, formatter);	
				dates.put(date,i);
				
				input = file.readLine();
				
			}
		file.close();
	 }
	
	public void dateHashMapSortedDescending() {
	// sort using TreeMap and Collection to reverse the order
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(Collections.reverseOrder());
		sort.putAll(dates);
	// print out the contents
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey());  				
	}
	public void dateHashMapSorted() {
	// sort using TreeMap ad print out the contents
		TreeMap<LocalDate,Integer> sort = new TreeMap<>(dates); 
        for (Map.Entry<LocalDate,Integer> entry : sort.entrySet())  
            System.out.println(entry.getKey());  			
	}
}
