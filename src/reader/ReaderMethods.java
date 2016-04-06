package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;

import data.BrowserSisop;
import data.FileFilterCss;
import data.FileFilterCsv;
import data.FileFilterGif;
import data.FileFilterJpg;
import data.FileFilterJs;
import data.FileFilterPng;
import data.FileFilterTxt;
import data.Ip;

public class ReaderMethods {
	String ips;
	String bigPart;
	String secondIp;
	String searchFile;
	String searchBand;
	String searchBrowser;
	String bandString;
	LocalDateTime dateNow;
	int bandValue;
	int count = 0;
	int countFirefox = 0;
	int countSafari = 0;
	int countChrome = 0;
	int countMsie = 0;
	private static HashMap<String, LocalDateTime> visits = new HashMap<String, LocalDateTime>();
	
	
	File file = new File("C:/dev/Workspaces/Workspace-Eclipse-Mars2/Desafio02-Ju/access.log");

	public Repository readFile() throws IOException {
		Repository repository = new Repository();
		BufferedReader br = new BufferedReader(new FileReader(file));
				while(br.ready()){
					String line = br.readLine();
					
					String[] parts = line.split(" - - ");
					ips = parts[0];
					
					String[] ipPrincipal = ips.split(" - ");
					secondIp = ipPrincipal[1];
					if (ipPrincipal[1].contains(",")) {
						String[] subIpPrincipal = ipPrincipal[1].split(",");
						secondIp = subIpPrincipal[1];
					}
					String date = parts[1].substring(1, 21);
					LocalDateTime dateNow = LocalDateTime.parse(date,DateTimeFormatter
									  .ofPattern("dd/MMM/yyyy:HH:mm:ss")
									  .withLocale(Locale.CANADA));
					Ip ipTime = new Ip(dateNow);
					repository.add(ipTime);
					LocalDateTime firstAcess = visits.get(secondIp);
							  
					if (firstAcess == null) {
						visits.put(secondIp, dateNow);
						count++;
					} else {
								   
						Duration d = Duration.between(firstAcess, dateNow);
								   
						if (d.toMillis() > 1800000) {
							visits.put(secondIp, dateNow);
							count++;
						}
					}
					
					bigPart = parts[1];
					String[] subParts = bigPart.split("\"");
					searchFile = subParts[1];
					searchBand = subParts[2];
					String[] bandSeparator = searchBand.split(" ");
					bandString = bandSeparator[2].replaceAll("-", "0");
					bandValue = Integer.parseInt(bandString);
					try {
						searchBrowser = subParts[5];
						if (searchBrowser.contains("Firefox")) {
							countFirefox++;
						}  
						
						if (searchBrowser.contains("Safari")){
							countSafari++;
						} 
						
						if (searchBrowser.contains("Chrome")){
							countChrome++;
						} 
						
						if (searchBrowser.contains("MSIE")){
							countMsie++;
						}
					} catch (Exception e) {
						
					}
					
					
					if (searchFile.contains(".png")) {
						FileFilterPng fileFilterPng = new FileFilterPng(bandValue);
						repository.add(fileFilterPng);
					} else if (searchFile.contains(".gif")) {
						FileFilterGif fileFilterGif = new FileFilterGif(bandValue);
						repository.add(fileFilterGif);
					} else if (searchFile.contains(".css")) {
						FileFilterCss fileFilterCss = new FileFilterCss(bandValue);
						repository.add(fileFilterCss);
					} else if (searchFile.contains(".csv")) {
						FileFilterCsv fileFilterCsv = new FileFilterCsv(bandValue);
						repository.add(fileFilterCsv);
					} else if (searchFile.contains(".jpg")) {
						FileFilterJpg fileFilterJpg = new FileFilterJpg(bandValue);
						repository.add(fileFilterJpg);
					} else if (searchFile.contains(".js")) {
						FileFilterJs fileFilterJs = new FileFilterJs(bandValue);
						repository.add(fileFilterJs);
					} else {
						FileFilterTxt fileFilterTxt = new FileFilterTxt(bandValue);
						repository.add(fileFilterTxt);
					}
					
					
					BrowserSisop browser = new BrowserSisop(searchBrowser);
					repository.add(browser);
				}
				return repository;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getCountFirefox() {
		return countFirefox;
	}
	
	public int getCountSafari() {
		return countSafari;
	}
	
	public int getCountChrome() {
		return countChrome;
	}
	
	public int getCountMsie() {
		return countMsie;
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
