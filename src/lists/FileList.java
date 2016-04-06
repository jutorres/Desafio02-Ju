package lists;

import java.util.Collections;
import java.util.TreeMap;

import data.FileFilterPng;
import reader.Repository;

public class FileList {
	TreeMap<Integer,String> fileList;
	
	public FileList() {
		this.fileList = new TreeMap<Integer,String>();
	}
	
	public int getSumBandPng() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListPng.size(); i++) {
			
			sum += Repository.fileFilterListPng.get(i).getBandNumber();
		}
		return sum;
	}

	public int getSumBandJpg() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListJpg.size(); i++) {
			
			sum += Repository.fileFilterListJpg.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandCss() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListCss.size(); i++) {
			
			sum += Repository.fileFilterListCss.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandCsv() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListCsv.size(); i++) {
			
			sum += Repository.fileFilterListCsv.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandGif() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListGif.size(); i++) {
			
			sum += Repository.fileFilterListGif.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandJs() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListJs.size(); i++) {
			
			sum += Repository.fileFilterListJs.get(i).getBandNumber();
		}
		return sum;
	}
	
	public int getSumBandTxt() {
		int sum = 0;
		for(int i = 0; i < Repository.fileFilterListTxt.size(); i++) {
			
			sum += Repository.fileFilterListTxt.get(i).getBandNumber();
		}
		return sum;
	}
	
	public TreeMap<Integer,String> fileListOrder () {
		TreeMap <Integer,String> reverseList = new TreeMap <Integer,String> (Collections.reverseOrder());
		reverseList.put(getSumBandPng(), ".png");
		reverseList.put(getSumBandCsv(), ".csv");
		reverseList.put(getSumBandCss(), ".css");
		reverseList.put(getSumBandGif(), ".gif");
		reverseList.put(getSumBandJpg(), ".jpg");
		reverseList.put(getSumBandJpg(), ".jpg");
		reverseList.put(getSumBandJs(), ".js");

		return reverseList;
	}
}
