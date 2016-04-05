package data;

public class FileFilterTxt {
	private int bandNumber;
	
	public FileFilterTxt(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .txt = " + bandNumber + "\n";
	}
}
