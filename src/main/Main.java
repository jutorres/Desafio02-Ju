package main;

import java.io.IOException;

import reader.ReaderMethods;
import reader.Repository;

public class Main {
	
	 public static void main(String[] args) throws IOException {
		 
		 ReaderMethods r = new ReaderMethods();
		 Repository repository = r.readFile();
		 
//		 System.out.println(repository.getIpList().toString());
		 System.out.println(repository.getBrowserList().toString());
		 System.out.println("Total de linhas do arquivo = " + repository.getCountBrowserList());
		 
		 System.out.println("Safari = " + repository.getCountSafari());
		 System.out.println("Chrome= " + repository.getCountChrome());
		 System.out.println("MSIE = " + repository.getCountMsie());
		 System.out.println("Firefox = " + repository.getCountFirefox());
		 System.out.println("Browser em ordem decrescente = " + repository.listBrowserOrder());
		 
		 System.out.println("Mac OS = " + repository.getCountMac());
		 System.out.println("Macintosh = " + repository.getCountMacintosh());
		 System.out.println("Windows NT = " + repository.getCountWindows());
		 System.out.println("Browser em ordem crescente = " + repository.listSisopOrder());
		 
		 
		 
	}
}
