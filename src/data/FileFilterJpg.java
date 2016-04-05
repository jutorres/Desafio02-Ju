package data;

public class FileFilterJpg {
	private int bandNumber;
	
	public FileFilterJpg(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .jpg = " + bandNumber + "\n";
	}
}
