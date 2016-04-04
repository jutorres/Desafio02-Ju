package lists;

import java.util.Collections;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import data.FileFilter;
import reader.Repository;

public class FileList {
TreeMap<String, Integer> fileList;
	
	public FileList() {
		this.fileList = new TreeMap<String, Integer>();
	}

//	public int getCountDocx() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".docx");
//	    Matcher m = p.matcher(str);
//	    int resultDocx = 0;
//	    while (m.find()){
//	       resultDocx =+ Repository.);
//	    }
//	    System.out.println();
//	    return resultDocx;
//	}
	
//	public int getCountTxt() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".txt");
//	    Matcher m = p.matcher(str);
//	    int countTxt = 0;
//	    while (m.find()){
//	    	countTxt +=1;
//	    }
//	    return countTxt;
//	}
//		
//	public int getCountCsv() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".csv");
//	    Matcher m = p.matcher(str);
//	    int countCsv = 0;
//	    while (m.find()){
//	    	countCsv +=1;
//	    }
//	    return countCsv;
//	}
//	
	public class Contador {
		
		private int count = 0;
		
		public void increment(int value) {
			count =+ value;
		}
		
		public int getValue() {
			return count;
		}
		
	}
	
	public int getCountPng() {
		
		/** **/
		
		Long banda = mapaArquivos.get(".png");
		
		if (banda == null) {
			banda = bandValue;
		} else {
			banda = banda + bandValue;
		}
		
		mapaArquivos.put(".png", banda);
		
		
		
		Long valorTotal = mapaArquivos.get(".png");
		
		/** **/
		
		Contador countPng = new Contador();

		Repository.fileFilterList.stream()
			.filter(fileFilter -> fileFilter.getLineFile().contains(".png"))
			.forEach(fileFilter -> countPng.increment(fileFilter.getBandNumber()));
		
		return countPng.getValue();
		
//		String str = Repository.fileFilterList.toString();
//		
//		if (str.contains(".png")) {
//			int posicaoPng = str.indexOf(".png");
//			
//			str.substring(posicaoPng + 19, str.ind)
//		}
//		
////		Pattern p = Pattern.compile(".png");
////	    Matcher m = p.matcher(str);
////	    while (m.find()){
////	    	countPng += 1;
////	    }
//	    return countPng;
	}
//	
//	public int getCountJpg() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".jpg");
//	    Matcher m = p.matcher(str);
//	    int countJpg = 0;
//	    while (m.find()){
//	    	countJpg += 1;
//	    }
//	    return countJpg;
//	}
//	
//	public int getCountGif() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".gif");
//	    Matcher m = p.matcher(str);
//	    int countGif = 0;
//	    while (m.find()){
//	    	countGif += 1;
//	    }
//	    return countGif;
//	}
//	
//	public int getCountCss() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".css");
//	    Matcher m = p.matcher(str);
//	    int countCss = 0;
//	    while (m.find()){
//	    	countCss += 1;
//	    }
//	    return countCss;
//	}
//	
//	public int getCountJs() {
//		String str = Repository.fileFilterList.toString();
//		Pattern p = Pattern.compile(".js");
//	    Matcher m = p.matcher(str);
//	    int countJs = 0;
//	    while (m.find()){
//	    	countJs += 1;
//	    }
//	    return countJs;
//	}
	
	public TreeMap<String, Integer> fileListOrder () {
		TreeMap < String, Integer> reverseListFilter = new TreeMap <String, Integer> (Collections.reverseOrder());
		reverseListFilter.put(".png", getCountPng());
//		reverseList.put(getCountChrome(), "Chrome");
//		reverseList.put(getCountMsie(), "IE");
//		reverseList.put(getCountSafari(), "Safari");
		return reverseListFilter;
	}
}
