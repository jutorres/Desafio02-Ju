package data;

public class FileFilterPng {
	private int bandNumber;
	
	public FileFilterPng(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .jpg = " + bandNumber + "\n";
	}
		
		
}
