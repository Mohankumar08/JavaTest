package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;

public class FileOperations {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Selenium\\Maven\\Tesing\\Testing1\\sample.txt");
		
		List <String> readLines = FileUtils.readLines(f);
		
		/*boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		
		
		File f = new File("D:\\Selenium\\Maven\\Tesing");
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
		}
		
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
		}
		/*boolean mkdir = f.mkdir();
		System.out.println(mkdir); 
		
		boolean directory = f.isDirectory();
		System.out.println(directory); 
		
		File f = new File("D:\\Selenium\\Maven\\Testing\\sample.xlsx"); 
		boolean createNewFile = f.createNewFile(); 
		System.out.println(createNewFile);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		boolean file = f.isFile();
		System.out.println(file); */
		
		
		
		
		
		
	}

}
