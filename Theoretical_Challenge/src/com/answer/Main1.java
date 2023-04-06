package com.answer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
	
	public static void main(String[] args) throws IOException {
		//Creating File......
		File file =new File("csv.txt");

		try {
			
			file.createNewFile();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		FileWriter f=new FileWriter("csv.txt");
		
		BufferedWriter bw=new BufferedWriter(f);
		bw.write("A1: 5, A2: 7, A3: 9, B1: 3, B2: 8, B3: =4+5, C1: =5+A1, "
				+ "C2: =A2+B2, C3: =C2+B3");
	
		bw.flush();
		bw.close();
		System.out.println("Task Completed...");
	}

}
