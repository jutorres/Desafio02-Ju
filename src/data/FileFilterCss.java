package data;

public class FileFilterCss {
	private int bandNumber;
	
	public FileFilterCss(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .css = " + bandNumber + "\n";
	}
}
