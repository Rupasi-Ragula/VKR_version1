package com.virtualKeyRepository;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class addFiles {
	static Scanner reader =new Scanner(System.in);
	public addFiles(){
		
		File directory = new File(Main.dirName);
		if(directory.exists()) {
			System.out.println("Directory already exists ...");
		}
		else
		{
			System.out.println("Directory not exists, creating now");
			if(directory.mkdir()) {
				System.out.printf("Successfully created new directory : %s%n", directory); 

			}
			else {
				System.out.printf("Failed to create new directory: %s%n", directory);
			}
		}
		System.out.println("Enter file name to be created "); 
		String filename1 = reader.nextLine();
		String filename=directory+"/"+filename1;
		File f = new File(filename);
		if(f.exists()) {
			System.out.println("File already exists");
		}
		else 
		{
			try {
				System.out.println("No such file exists, creating now"); 
				if(f.createNewFile())
				{
					System.out.printf("Successfully created new file: %s%n", f); 
				} 
				else
				{ 
					System.out.printf("Failed to create new file: %s%n", f);
				} 
				
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
		

		
	}
	public static void main(String args[]) {
		new addFiles();
	}
		
		
	}
