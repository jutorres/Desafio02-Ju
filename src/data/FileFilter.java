package data;

public class FileFilter {
	private String lineFile;
	private int bandNumber;
	
	public FileFilter(String lineFile, int bandNumber) {
		this.lineFile = lineFile;
		this.bandNumber = bandNumber;
	}
	
	public String getLineFile() {
		return lineFile;
	}
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public int addBandNumber() {
		int result =+ bandNumber;
		return result;
	}

	public String toString() {
		return "lineFile = " + lineFile + " " + "lineBand + " + bandNumber + "\n";
	}
		
		
}
