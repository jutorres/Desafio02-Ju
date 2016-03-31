package main;

import java.io.IOException;

import reader.ReaderMethods;
import reader.Repository;

public class Main {
	
	 public static void main(String[] args) throws IOException {
		 
		 ReaderMethods r = new ReaderMethods();
		 Repository repository = r.readFile();
		 System.out.println(repository.getIpList().toString());
		 
	}
}
