package data;

public class FileFilterCsv {
	private int bandNumber;
	
	public FileFilterCsv(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .csv = " + bandNumber + "\n";
	}
}
