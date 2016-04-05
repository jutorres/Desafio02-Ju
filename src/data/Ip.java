package data;

import java.time.LocalDateTime;

public class Ip {
	public String ip;
	public LocalDateTime date;
	
	
	public Ip(String ip, LocalDateTime date) {
		this.ip = ip;
		this.date = date;
	}
	
	public Ip(LocalDateTime date) {
		this.date = date;
	}
	
	public Ip() {
		
	}

	public String getIp() {
		return ip;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	

	@Override
	public String toString() {
		return "IpList = " + ip + date + "\n";
	}
}
