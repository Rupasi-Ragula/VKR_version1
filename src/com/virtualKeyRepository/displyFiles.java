package com.virtualKeyRepository;
import java.io.File;
import java.util.Arrays;


public class displyFiles {
	public void sortFiles() {
		
		File fileDir = new File(Main.dirName);
		if (fileDir.mkdir() == true) { 
			System.out.println("Directory has been created successfully"); 
		} 
		else 
		{ 
			System.out.println("Directory cannot be created....It already exists"); 
		} 
		if(fileDir.isDirectory()) {
			String[] fileList = fileDir.list();
			if(fileList.length==0) {
				System.out.println("Empty Directory");
			}
			else {
			System.out.println("Listing files before sorting:\n");
			for(String s:fileList){
				System.out.println(s);
			}
			Arrays.sort(fileList,String.CASE_INSENSITIVE_ORDER);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order:\n");
			for(String s:fileList){
				System.out.println(s);
			}
			}
		}
				
	} 
	public static void main(String args[])
	{
		displyFiles obj = new displyFiles();
		obj.sortFiles();
	}

}
