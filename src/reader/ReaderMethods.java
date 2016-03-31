package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import data.Ip;

public class ReaderMethods {
	String ips;
	String bigPart;
	String secondIp;
	
	File file = new File("C:/dev/Workspaces/Workspace-Eclipse-Mars2/Desafio_Java2/access_test.log");

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
				}
				return repository;
	}
}
