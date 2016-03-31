package data;

public class Ip {
	private String ip;
	
	public Ip(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	@Override
	public String toString() {
		return "Ip= " + ip + "\n";
	}
}
