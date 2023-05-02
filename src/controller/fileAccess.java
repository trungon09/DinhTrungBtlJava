package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Stack;

public class fileAccess {
	public  String read(  File f) {
		String line = null;
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath());
			//String line; //Stack<String> sodu,
			line = br.readLine();
//			while (true) {
//				
//
//				if (line == null) {
//					break;
//				} else {
//					System.out.println(line);
//					//sodu.push(line+"");
//				}
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println(sodu.pop() + "");
		return line;
	}//Stack<String> sodu,
	public void write( String x, File f) {
		PrintWriter pw;
		try {
			pw = new PrintWriter(f);
			pw.println(x);
			//sodu.push(x);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\TRung\\eclipse-workspace\\first\\btl_java\\soDuKhaDung.txt");
		//System.out.println(read(f));
		new fileAccess();
	}

}
