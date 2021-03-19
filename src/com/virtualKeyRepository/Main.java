package com.virtualKeyRepository;
import java.util.Scanner;
public class Main {
	static String dirName;
	static Scanner sc = new Scanner(System.in);
	public static void welcomeScreen()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("\n\t\tLockersApp\t\t\n");
		System.out.println("Welcome to LockedMe.com");
		System.out.println("-----------------------------------------------");
		System.out.println("Developer:\tRupasi Ragula");
		System.out.println("Company Name:\tTek Systems Global Services");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------\n\n");
		Main.dirName=getDirectory();
		
	}
	public static String getDirectory() {
		System.out.println("Enter the name of the directory:");
		String name = sc.next();
		return name;
	}
	public static void options()
	{
		System.out.println("Available options\n");
		System.out.println("\t1.Retrieving file names in ascending order");
		System.out.println("\t2.Business Level Operations");
		System.out.println("\t3.Exit");
		System.out.println("-----------------------------------------------\n");
		
		System.out.println("SELECT an option and enter the respective number:");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			displyFiles o = new displyFiles();
			o.sortFiles();
			options();
			break;
		case 2:
			BusinessLevelOperations.main(sc);
			break;
		case 3:
			
			sc.close();
			System.out.println("***********THANK YOU***********");
			addFiles.reader.close();
			System.exit(0);
			break;
		default:
			System.out.println("You have entered incorrect option.\n!!Try Again.");
			break;
		}

	
		
	}
	

	public static void main(String[] args) {
		
		welcomeScreen();
		options();
			
		
		
		
		}

}
