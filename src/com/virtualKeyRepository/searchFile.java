package com.virtualKeyRepository;
import java.io.File;
public class searchFile {
	public searchFile(String search) {
		int flag=0;
		File directory = new File(Main.dirName);
		String[] fileList = directory.list();
	    if (fileList == null) { 
	        System.out.println("Empty directory."); 
	    }
	    else {
	    	 for (int i = 0; i < fileList.length; i++) { 
	                String filename = fileList[i]; 
	                if (filename.equals(search)) { 
	                    System.out.println(filename + " found"); 
	                    flag = 1; 
	                } 
	            } 
	    }
	    if (flag == 0) { 
            System.out.println("File Not Found"); 
        } 
	}

}
