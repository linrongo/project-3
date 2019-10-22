import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEquivalent {
	private String stID;
	private MesoAsciiCal asciiAverage;
	private final int ASCIIAVG;
	
	public MesoEquivalent(String stID) {
		this.stID = stID;
		asciiAverage = new MesoAsciiCal(new MesoStation(stID));
		ASCIIAVG = asciiAverage.calAverage();	
	}

	public HashMap<String,Integer> calAsciiEqual() throws IOException {
		HashMap<String,Integer> list = new HashMap<String,Integer>();		
		list.put(stID,ASCIIAVG);
		ArrayList<MesoStation> stationList = readFile();
		int asciiAvg = 0;

		for(MesoStation m: stationList) {
			asciiAverage = new MesoAsciiCal(m);
			asciiAvg = asciiAverage.calAverage();
			
			if (asciiAvg == ASCIIAVG) list.put(m.getStID(), asciiAvg);		
		}
		System.out.println(list);
		return list;
	}

	protected ArrayList<MesoStation> readFile() throws IOException {
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
