package com.answer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("csv.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		System.out.println(line);
		
		String[] str=line.split(",");
		System.out.println(Arrays.toString(str));
		
		HashMap<String, String> chk= new HashMap<>();
		for(int i=0;i<str.length;i++) {
			String[] entry=str[i].split(":");
			
			chk.put(entry[0], entry[1]);
		}
		
		System.out.println(chk);
		
		Set<String> st=chk.keySet();
		for(String key : st) {
			String val=chk.get(key);
			
			try {
				Integer ans=Integer.parseInt(val);
				System.out.println(ans);
				} 
			catch (Exception e) {
				System.out.println("formula");
				String nVal=val.substring(1);
				
				System.out.println(nVal);
				String[] arr=nVal.split("+");
				
				int fAns=0;
				for(int i=0;i<arr.length;i++) {
					fAns+=Integer.parseInt(chk.get(i));
				}
				System.out.println(fAns);
										
			}
		}
		
				
	}
}
