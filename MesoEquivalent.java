import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEquivalent {
	private String stID;
	private MesoAsciiCal asciiAverage;
	private final int ASCIIAVG;
	
	public MesoEquivalent(String stID) {
	// set stid, asciiAverage, and the Average
		this.stID = stID;
		asciiAverage = new MesoAsciiCal(new MesoStation(stID));
		ASCIIAVG = asciiAverage.calAverage();	
	}

	public HashMap<String,Integer> calAsciiEqual() throws IOException {
	// Create a hash map and put the original stid and the average in it
		HashMap<String,Integer> list = new HashMap<String,Integer>();		
		list.put(stID,ASCIIAVG);
		
	// read the file and create an arraylist of mesoStation
		ArrayList<MesoStation> stationList = readFile();
		int asciiAvg = 0;
		
	// go through the arraylist and calculate the ascii average of each STID
		for(MesoStation m: stationList) {
			asciiAverage = new MesoAsciiCal(m);
			asciiAvg = asciiAverage.calAverage();
		// put it in the HashMap if they have the same Average Ascii
			if (asciiAvg == ASCIIAVG) 
				list.put(m.getStID(), asciiAvg);		
		}
		return list;
	}

	private ArrayList<MesoStation> readFile() throws IOException {
		ArrayList<MesoStation> stationList = new ArrayList<MesoStation>();
		
		BufferedReader profile = new BufferedReader(new FileReader("Mesonet.txt"));
       	String line;
       	String[] info;
       	MesoStation meso;
       	
      //skip 3 lines
		final int limit = 3;
		for(int i = 0; i < limit; i++) {			
	       	line = profile.readLine();
		}
		
		line = profile.readLine();
	    while ( line != null) {
	    	
	      // Trim, split the line and get Station,, then add it to the list
	    	line = line.trim();
	    	info = line.split("\\s+");
	    	meso = new MesoStation(info[0]);
	    		       
	       	
	      // Add it to the arraylist of MesoStation
	    	stationList.add(meso);
	       		
	      line = profile.readLine();
       }    
	    profile.close();
  return stationList;
	}
}
