package com.virtualKeyRepository;
import java.io.File; 
import java.util.Scanner; 
public class deleteFiles {

	public deleteFiles() {
		try
        { 	Scanner sc = Main.sc;
        	String filename=Main.dirName+"/";
        	System.out.println("Enter the name of the file to be deleted");
        	String path=filename+sc.next().trim();
        	File files = new File(path);
        	if(files.delete()) {
        		System.out.println("Deletion Successfull");
        	}
        	else {
        		System.out.println("Deletion Failed-File Not Found");
        	}
        }
		
        
		catch(Exception e) 
        { 
            System.out.println(e); 
        } 
        
		
	}

	public static void main(String[] args) {
		new deleteFiles();

	}

}
