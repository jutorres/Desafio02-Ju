package reader;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import data.BrowserSisop;
import data.Ip;

public class Repository {
	private ArrayList<Ip> ipList;
	private ArrayList<BrowserSisop> browserSisopList;
	ArrayList<Integer> listBrowserOrder;
	ArrayList<Integer> listSisopOrder;
	
	

	public Repository() {
		this.ipList = new ArrayList<Ip>();
		this.browserSisopList = new ArrayList<BrowserSisop>();
		this.listBrowserOrder = new ArrayList<Integer>();
		this.listSisopOrder = new ArrayList<Integer>();
	}

	public ArrayList<Ip> getIpList() {
		return ipList;
	}
	
	public ArrayList<BrowserSisop> getBrowserList() {
		return browserSisopList;
	}
	
	public int getCountBrowserList() {
		return browserSisopList.size();
	}
	
	
	public int getCountSafari() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Safari");
	    Matcher m = p.matcher(str);
	    int countSafari = 0;
	    while (m.find()){
	    	countSafari +=1;
	    }
	    return countSafari;
	}
	
	public int getCountChrome() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Chrome");
	    Matcher m = p.matcher(str);
	    int countChrome = 0;
	    while (m.find()){
	    	countChrome +=1;
	    }
	    return countChrome;
	}
		
	public int getCountMsie() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("MSIE");
	    Matcher m = p.matcher(str);
	    int countMsie = 0;
	    while (m.find()){
	    	countMsie +=1;
	    }
	    return countMsie;
	}
	
	public int getCountFirefox() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Firefox");
	    Matcher m = p.matcher(str);
	    int countFirefox = 0;
	    while (m.find()){
	    	countFirefox += 1;
	    }
	    return countFirefox;
	}
	
	public ArrayList<Integer> listBrowserOrder () {
		listBrowserOrder.add(getCountFirefox());
		listBrowserOrder.add(getCountChrome());
		listBrowserOrder.add(getCountMsie());
		listBrowserOrder.add(getCountSafari());
         int temp = 0;
        
         for(int i = 0; i < listBrowserOrder.size() - 1; i++){
                 for(int j = 0; j < (listBrowserOrder.size() - i - 1); j++){
                	 if (listBrowserOrder.get(j).compareTo(listBrowserOrder.get(j + 1)) <= 0) {
                         temp = listBrowserOrder.get(j);
                         listBrowserOrder.set(j, listBrowserOrder.get(j + 1) );
                         listBrowserOrder.set(j + 1, temp);
                     }
                 }
         }
		return listBrowserOrder;
	}
	
	public int getCountMac() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Mac");
	    Matcher m = p.matcher(str);
	    int countMac = 0;
	    while (m.find()){
	    	countMac += 1;
	    }
	    return countMac;
	}
	
	public int getCountMacintosh() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Macintosh");
	    Matcher m = p.matcher(str);
	    int countMacintosh = 0;
	    while (m.find()){
	    	countMacintosh += 1;
	    }
	    return countMacintosh;
	}
	
	public int getCountWindows() {
		String str = browserSisopList.toString();
		Pattern p = Pattern.compile("Macintosh");
	    Matcher m = p.matcher(str);
	    int countWindows = 0;
	    while (m.find()){
	    	countWindows += 1;
	    }
	    return countWindows;
	}
	
	public ArrayList<Integer> listSisopOrder() {
		listSisopOrder.add(getCountMac());
		listSisopOrder.add(getCountMacintosh());
		listSisopOrder.add(getCountWindows());
		
         int temp = 0;
        
         for(int i = 0; i < listSisopOrder.size(); i++){
                 for(int j = 0; j < (listSisopOrder.size() - i - 1); j++){
                	 if (listSisopOrder.get(j).compareTo(listSisopOrder.get(j + 1)) > 0) {
                         temp = listSisopOrder.get(j);
                         listSisopOrder.set(j, listSisopOrder.get(j + 1) );
                         listSisopOrder.set(j + 1, temp);
                     }
                 }
         }
		return listSisopOrder;
	}

	public void add(Ip ip) {
		ipList.add(ip);
	}
	
	public void add(BrowserSisop browser) {
		browserSisopList.add(browser);
	}

	
	
	
}	
	

