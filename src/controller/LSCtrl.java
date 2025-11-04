package controller;

import java.io.File;
import java.io.IOException;

public class LSCtrl {
	
	public LSCtrl() {
		super();
	}
	
	public void listFilesBySize(String path) throws IOException {
		File dir = new File(path);
		
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			files = orderFilesBySize(files);
			
			System.out.println("=========================================================================");
			System.out.printf("%-5s %-45s %s%n", "", "NAME", "SIZE");
			System.out.println("=========================================================================");

			for (File f : files) {
				if (f.isFile()) {
					System.out.printf("%-40s %-1s %s%n", f.getName(), ((f.length()/1024.0)/1024.0), "MB");
				}
			}
		} else {
			throw new IOException("Invalid directory: "+path);
		}
	}
	
	private File[] orderFilesBySize(File[] files) {
		int size = files.length;
		File aux = new File("");
		for (int i = 0; i < size; i++) {
			for (int j = (i+1); j<size-1; j++) {
				if (files[i].length() > files[j].length()) {
					aux = files[i];
					files[i] = files[j];
					files[j] = aux;
				}
			}
		}
		return files;
	}
}
