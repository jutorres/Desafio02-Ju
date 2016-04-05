package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
	int bandValue;
	
	
	File file = new File("C:/dev/Workspaces/Workspace-Eclipse-Mars2/Desafio02-Ju/access_test.log");

	public Repository readFile() throws IOException {
		Repository repository = new Repository();
		BufferedReader br = new BufferedReader(new FileReader(file));
				while(br.ready()){
					String line = br.readLine();
					
					String[] parts = line.split(" - - ");
					ips = parts[0];
					
					String[] ipPrincipal = ips.split(" - ");
					secondIp = ipPrincipal[1];
					Ip ip = new Ip(secondIp);
					repository.add(ip);
					
					bigPart = parts[1];
					String[] subParts = bigPart.split("\"");
					searchFile = subParts[1];
					searchBand = subParts[2];
					String[] bandSeparator = searchBand.split(" ");
					bandString = bandSeparator[2].replaceAll("-", "0");
					bandValue = Integer.parseInt(bandString);
					searchBrowser = subParts[5];
					
					
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
}
