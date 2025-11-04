package view;

import java.io.IOException;

import controller.LSCtrl;

public class Main {

	public static void main(String[] args) {
		LSCtrl dirReader = new LSCtrl();
		String dir = "C:/Users/janelinha/Downloads";
		
		try {
			dirReader.listFilesBySize(dir);
			
		} catch (IOException e) {
			System.err.println("IOException: ");
			System.err.println(e.getMessage());
		}
	}

}
