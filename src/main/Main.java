package main;

import java.io.IOException;

import lists.BrowserList;
import lists.FileList;
import lists.SisopList;
import reader.ReaderMethods;
import reader.Repository;

public class Main {
	
	 public static void main(String[] args) throws IOException {
		 
		 ReaderMethods r = new ReaderMethods();
		 Repository repository = r.readFile();
		 BrowserList bl = new BrowserList();
		 SisopList sl = new SisopList();
		 FileList fl = new FileList();
		 
//		 System.out.println(repository.getIpList().toString());
//		 System.out.println(repository.getBrowserList().toString());
		 System.out.println("Total de linhas do arquivo = " + repository.getCountBrowserList());
		 
		 System.out.println("Safari = " + bl.getCountSafari());
		 System.out.println("Chrome= " + bl.getCountChrome());
		 System.out.println("MSIE = " + bl.getCountMsie());
		 System.out.println("Firefox = " + bl.getCountFirefox());
		 System.out.println("Browser em ordem decrescente = " + bl.listBrowserOrder());
		 
		 System.out.println("Mac OS = " + sl.getCountMac());
		 System.out.println("Macintosh = " + sl.getCountMacintosh());
		 System.out.println("Windows NT = " + sl.getCountWindows());
		 System.out.println("Linux = " + sl.getCountLinux());
		 System.out.println("Android = " + sl.getCountAndroid());
		 System.out.println("Browser em ordem crescente = " + sl.listSisopOrder());
		 
		 System.out.println(repository.getFileFilterList().toString());
		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterList());
		 System.out.println("Arquivos em ordem decrescente = " + fl.fileListOrder());
		 
		 
		 
	}
}
