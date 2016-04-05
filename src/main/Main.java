package main;

import java.io.IOException;

import data.Ip;
import lists.BrowserList;
import lists.FileList;
import lists.SisopList;
import lists.TimeHigherList;
import reader.Chronometer;
import reader.ReaderMethods;
import reader.Repository;

public class Main {
	
	 public static void main(String[] args) throws IOException {
		 
		 ReaderMethods r = new ReaderMethods();
		 Repository repository = r.readFile();
		 BrowserList bl = new BrowserList();
		 SisopList sl = new SisopList();
		 FileList fl = new FileList();
		 Chronometer c = new Chronometer();
		 TimeHigherList thl = new TimeHigherList();
		 
		 c.begin();
//		 System.out.println(repository.getBrowserList().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountBrowserList());
//		 
//		 System.out.println("Safari = " + bl.getCountSafari());
//		 System.out.println("Chrome= " + bl.getCountChrome());
//		 System.out.println("MSIE = " + bl.getCountMsie());
//		 System.out.println("Firefox = " + bl.getCountFirefox());
		 System.out.println("Browser em ordem decrescente = " + bl.listBrowserOrder());
//		 
//		 System.out.println("Mac OS = " + sl.getCountMac());
//		 System.out.println("Macintosh = " + sl.getCountMacintosh());
//		 System.out.println("Windows NT = " + sl.getCountWindows());
//		 System.out.println("Linux = " + sl.getCountLinux());
//		 System.out.println("Android = " + sl.getCountAndroid());
		 System.out.println("Browser em ordem crescente = " + sl.listSisopOrder());
		 
//		 System.out.println(repository.getFileFilterListPng().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListPng());
//		 System.out.println(repository.getFileFilterListGif().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListGif());
//		 System.out.println(repository.getFileFilterListCsv().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListCsv());
//		 System.out.println(repository.getFileFilterListCss().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListCss());
//		 System.out.println(repository.getFileFilterListJs().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListJs());
//		 System.out.println(repository.getFileFilterListJpg().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListJpg());
//		 System.out.println(repository.getFileFilterListTxt().toString());
//		 System.out.println("Total de linhas do arquivo = " + repository.getCountFileFilterListTxt());
		 
		 System.out.println("Arquivos em ordem decrescente = " + fl.fileListOrder());
		 System.out.println("Visits = " + r.getCount());
		 System.out.println("Duração = " + thl.listDuration());
		 
		 c.close();
	}
}
