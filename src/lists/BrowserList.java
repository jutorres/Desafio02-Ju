package lists;

import java.util.Collections;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import reader.Repository;

public class BrowserList {
	TreeMap<Integer, String> listBrowserOrder;
	
	public BrowserList() {
		this.listBrowserOrder = new TreeMap<Integer, String>();
	}

	public int getCountSafari() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Safari");
	    Matcher m = p.matcher(str);
	    int countSafari = 0;
	    while (m.find()){
	    	countSafari +=1;
	    }
	    return countSafari;
	}
	
	public int getCountChrome() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Chrome");
	    Matcher m = p.matcher(str);
	    int countChrome = 0;
	    while (m.find()){
	    	countChrome +=1;
	    }
	    return countChrome;
	}
		
	public int getCountMsie() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("MSIE");
	    Matcher m = p.matcher(str);
	    int countMsie = 0;
	    while (m.find()){
	    	countMsie +=1;
	    }
	    return countMsie;
	}
	
	public int getCountFirefox() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Firefox");
	    Matcher m = p.matcher(str);
	    int countFirefox = 0;
	    while (m.find()){
	    	countFirefox += 1;
	    }
	    return countFirefox;
	}
	
	public TreeMap<Integer, String> listBrowserOrder () {
		TreeMap <Integer, String> reverseList = new TreeMap <Integer, String> (Collections.reverseOrder());
		reverseList.put(getCountFirefox(), "Firefox");
		reverseList.put(getCountChrome(), "Chrome");
		reverseList.put(getCountMsie(), "IE");
		reverseList.put(getCountSafari(), "Safari");
		return reverseList;
	}
}
