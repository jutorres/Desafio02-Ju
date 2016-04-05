package reader;

import java.util.ArrayList;

import data.BrowserSisop;
import data.FileFilterCss;
import data.FileFilterCsv;
import data.FileFilterGif;
import data.FileFilterJpg;
import data.FileFilterJs;
import data.FileFilterPng;
import data.FileFilterTxt;
import data.Ip;

public class Repository {
	public static ArrayList<Ip> timeList;
	public static ArrayList<BrowserSisop> browserSisopList;
	public static ArrayList<FileFilterPng> fileFilterListPng;
	public static ArrayList<FileFilterGif> fileFilterListGif;
	public static ArrayList<FileFilterCss> fileFilterListCss;
	public static ArrayList<FileFilterCsv> fileFilterListCsv;
	public static ArrayList<FileFilterJpg> fileFilterListJpg;
	public static ArrayList<FileFilterJs> fileFilterListJs;
	public static ArrayList<FileFilterTxt> fileFilterListTxt;
	
	public Repository() {
		Repository.browserSisopList = new ArrayList<BrowserSisop>();
		Repository.fileFilterListPng = new ArrayList<FileFilterPng>();
		Repository.fileFilterListGif = new ArrayList<FileFilterGif>();
		Repository.fileFilterListCss = new ArrayList<FileFilterCss>();
		Repository.fileFilterListCsv = new ArrayList<FileFilterCsv>();
		Repository.fileFilterListJpg = new ArrayList<FileFilterJpg>();
		Repository.fileFilterListJs = new ArrayList<FileFilterJs>();
		Repository.fileFilterListTxt = new ArrayList<FileFilterTxt>();
		Repository.timeList = new ArrayList<Ip>();
	}

	public ArrayList<BrowserSisop> getBrowserSisopList() {
		return browserSisopList;
	}
	
	public ArrayList<FileFilterPng> getFileFilterListPng() {
		return fileFilterListPng;
	}
	
	public ArrayList<FileFilterGif> getFileFilterListGif() {
		return fileFilterListGif;
	}
	
	public ArrayList<FileFilterCss> getFileFilterListCss() {
		return fileFilterListCss;
	}

	public ArrayList<FileFilterCsv> getFileFilterListCsv() {
		return fileFilterListCsv;
	}

	public ArrayList<FileFilterJpg> getFileFilterListJpg() {
		return fileFilterListJpg;
	}

	public ArrayList<FileFilterJs> getFileFilterListJs() {
		return fileFilterListJs;
	}

	public ArrayList<FileFilterTxt> getFileFilterListTxt() {
		return fileFilterListTxt;
	}
	
	public ArrayList<Ip> getTimeList() {
		return timeList;
	}
	
	public void add(BrowserSisop browser) {
		browserSisopList.add(browser);
	}
	
	public void add(FileFilterPng fileFilter) {
		fileFilterListPng.add(fileFilter);
	}
	
	public void add(FileFilterGif fileFilter) {
		fileFilterListGif.add(fileFilter);
	}
	
	public void add(FileFilterCss fileFilter) {
		fileFilterListCss.add(fileFilter);
	}
	
	public void add(FileFilterCsv fileFilter) {
		fileFilterListCsv.add(fileFilter);
	}
	
	public void add(FileFilterJs fileFilter) {
		fileFilterListJs.add(fileFilter);
	}
	
	public void add(FileFilterJpg fileFilter) {
		fileFilterListJpg.add(fileFilter);
	}
	
	public void add(FileFilterTxt fileFilter) {
		fileFilterListTxt.add(fileFilter);
	}
	
	public void add(Ip ipTime) {
		timeList.add(ipTime);
	}
	
	public int getCountBrowserList() {
		return browserSisopList.size();
	}
	
	public int getCountFileFilterListPng() {
		return fileFilterListPng.size();
	}
	
	public int getCountFileFilterListGif() {
		return fileFilterListGif.size();
	}
	
	public int getCountFileFilterListCss() {
		return fileFilterListCss.size();
	}
	
	public int getCountFileFilterListCsv() {
		return fileFilterListCsv.size();
	}
	
	public int getCountFileFilterListJpg() {
		return fileFilterListJpg.size();
	}
	
	public int getCountFileFilterListJs() {
		return fileFilterListJs.size();
	}
	
	public int getCountFileFilterListTxt() {
		return fileFilterListTxt.size();
	}
	
}	
	

