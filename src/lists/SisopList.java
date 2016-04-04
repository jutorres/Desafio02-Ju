package lists;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import reader.Repository;

public class SisopList {
	TreeMap<Integer, String> listSisopOrder;

	public SisopList() {
		this.listSisopOrder = new TreeMap<Integer, String>();
	}
	
	public int getCountMac() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Mac");
	    Matcher m = p.matcher(str);
	    int countMac = 0;
	    while (m.find()){
	    	countMac += 1;
	    }
	    return countMac;
	}
	
	public int getCountMacintosh() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Macintosh");
	    Matcher m = p.matcher(str);
	    int countMacintosh = 0;
	    while (m.find()){
	    	countMacintosh += 1;
	    }
	    return countMacintosh;
	}
	
	public int getCountWindows() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Windows");
	    Matcher m = p.matcher(str);
	    int countWindows = 0;
	    while (m.find()){
	    	countWindows += 1;
	    }
	    return countWindows;
	}
	
	public int getCountLinux() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Linux");
	    Matcher m = p.matcher(str);
	    int countLinux = 0;
	    while (m.find()){
	    	countLinux += 1;
	    }
	    return countLinux;
	}
	
	public int getCountAndroid() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("Android");
	    Matcher m = p.matcher(str);
	    int countAndroid = 0;
	    while (m.find()){
	    	countAndroid += 1;
	    }
	    return countAndroid;
	}
	
	public int getCountIphone() {
		String str = Repository.browserSisopList.toString();
		Pattern p = Pattern.compile("iPhone");
	    Matcher m = p.matcher(str);
	    int countIphone = 0;
	    while (m.find()){
	    	countIphone += 1;
	    }
	    return countIphone;
	}
	
	public TreeMap<Integer, String> listSisopOrder() {
		listSisopOrder.put(getCountWindows(), "Windows");
		listSisopOrder.put(getCountMacintosh(), "Macintosh");
		listSisopOrder.put(getCountMac(), "Mac OS");
		listSisopOrder.put(getCountLinux(), "Linux");
		listSisopOrder.put(getCountAndroid(), "Android");
		listSisopOrder.put(getCountIphone(), "iPhone");
	    return listSisopOrder;
	}
	
}
