
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private String stid;
	public MesoAsciiCal(MesoStation meso) {
		stid = meso.getStID();
	}

	

	@Override
	int calAverage() {
		int asciiTot = 0; 
		// get total value
			for(int i = 0; i < 4; ++i) {
				asciiTot += (int)stid.charAt(i);
			}
		// divide total by 4
			double asciiAve = asciiTot/4.0;
		// get average from ceiling of the diffence is >= .25
			if(asciiAve - Math.floor(asciiAve ) >= 0.25) {
				return (int) Math.ceil(asciiAve);
			}
			
		// otherwise get average from floor value
			else return (int) Math.floor(asciiAve);
	}
   
}