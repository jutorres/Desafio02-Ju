package reader;

import java.util.ArrayList;
import data.BrowserSisop;
import data.FileFilter;
import data.Ip;

public class Repository {
	private ArrayList<Ip> ipList;
	public static ArrayList<BrowserSisop> browserSisopList;
	public static ArrayList<FileFilter> fileFilterList;
	
	public Repository() {
		this.ipList = new ArrayList<Ip>();
		Repository.browserSisopList = new ArrayList<BrowserSisop>();
		Repository.fileFilterList = new ArrayList<FileFilter>();
	}

	public ArrayList<Ip> getIpList() {
		return ipList;
	}
	
	public ArrayList<BrowserSisop> getBrowserSisopList() {
		return browserSisopList;
	}
	
	public ArrayList<FileFilter> getFileFilterList() {
		return fileFilterList;
	}

	public void add(Ip ip) {
		ipList.add(ip);
	}
	
	public void add(BrowserSisop browser) {
		browserSisopList.add(browser);
	}
	
	public void add(FileFilter fileFilter) {
		fileFilterList.add(fileFilter);
	}
	
	public int getCountBrowserList() {
		return browserSisopList.size();
	}
	
	public int getCountFileFilterList() {
		return fileFilterList.size();
	}
	
	public int getBandNumberList() {
		fileFilterList.;
		return 0;
	}
}	
	

