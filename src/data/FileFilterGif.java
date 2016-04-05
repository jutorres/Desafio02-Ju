package data;

public class FileFilterGif {
	private int bandNumber;
	
	public FileFilterGif(int bandNumber) {
		this.bandNumber = bandNumber;
	}
	
	
	public int getBandNumber() {
		return bandNumber;
	}
	
	public String toString() {
		return "Lista da banda .gif = " + bandNumber + "\n";
	}
}
