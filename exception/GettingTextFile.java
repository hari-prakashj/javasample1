package com.onesoft.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GettingTextFile {

	public static void main(String[] args) throws IOException{
		try {
		File f = new File("/home/hari/Documents/test.txt");
		FileReader fr = new FileReader(f);
		int temp=0;
		while((temp=fr.read()) != -1) {
			System.out.print((char)(temp));
		}
		}
		catch (FileNotFoundException ffe) {
			System.out.println("error");
		}
	}

}
