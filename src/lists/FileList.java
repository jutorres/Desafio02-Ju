package lists;

import java.util.Collections;
import java.util.TreeMap;

import data.FileFilterPng;
import reader.Repository;

public class FileList {
	TreeMap<String, Integer> fileList;
	FileFilterPng bandPng;
	
	public FileList() {
		this.fileList = new TreeMap<String, Integer>();
	}
	
	public int getSumBandPng() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListPng.size(); i++) {
			
			sum =+ Repository.fileFilterListPng.get(i).getBandNumber();
		}
		return sum;
	}

	public int getSumBandJpg() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListJpg.size(); i++) {
			
			sum =+ Repository.fileFilterListJpg.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandCss() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListCss.size(); i++) {
			
			sum =+ Repository.fileFilterListCss.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandCsv() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListCsv.size(); i++) {
			
			sum =+ Repository.fileFilterListCsv.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandGif() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListGif.size(); i++) {
			
			sum =+ Repository.fileFilterListGif.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandJs() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListJs.size(); i++) {
			
			sum =+ Repository.fileFilterListJs.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandTxt() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListTxt.size(); i++) {
			
			sum =+ Repository.fileFilterListTxt.get(i).getBandNumber();
		}
		return sum;
	}
	
	public TreeMap<String, Integer> fileListOrder () {
		TreeMap <String, Integer> reverseList = new TreeMap <String, Integer> (Collections.reverseOrder());
		reverseList.put(".png", getSumBandPng());
		reverseList.put(".csv", getSumBandCsv());
		reverseList.put(".css", getSumBandCss());
		reverseList.put(".gif", getSumBandGif());
		reverseList.put(".jpg", getSumBandJpg());
		reverseList.put(".jpg", getSumBandJpg());
		reverseList.put(".js", getSumBandJs());

		return reverseList;
	}
}
