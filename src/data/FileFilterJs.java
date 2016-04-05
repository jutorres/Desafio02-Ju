package data;

public class FileFilterJs {
	private int bandNumber;
	
	public FileFilterJs(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .js = " + bandNumber + "\n";
	}
}
