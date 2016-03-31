package reader;

import java.util.ArrayList;

import data.Ip;

public class Repository {
	private ArrayList<Ip> ipList;

	public Repository() {
		this.ipList = new ArrayList<Ip>();
	}

	public ArrayList<Ip> getIpList() {
		return ipList;
	}
	
	public void add(Ip ip) {
		ipList.add(ip);
	}

	@Override
	public String toString() {
		return "Repository [ipList=" + ipList + "]";
	}
	
	
}	
	

