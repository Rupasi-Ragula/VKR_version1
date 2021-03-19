package com.virtualKeyRepository;
import java.util.Scanner;
import java.io.IOException;
public class BusinessLevelOperations {
	
	
	public static int getchoice(Scanner sc1) throws IOException {
		System.out.println("-----------------------------------------------");
		System.out.println("\nBusiness Level Operations\n");
		System.out.println("\t1.Option to add a user specified file to the application");
		System.out.println("\t2.Option to delete a user specified file from the application");
		System.out.println("\t3.Option to search a user specified file from the application");
		System.out.println("\t4.Option to close the current execution context and return to the main context");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		System.out.println("SELECT an option from above list of operations:");
		int choice= sc1.nextInt();
		return choice;
	}
	
	public static void businessoptions(Scanner sc1) {
		try {
		int option=0;
		while(true) {
			option=getchoice(sc1);
			if(option==1) {
				new addFiles();
			}
			else if(option==2) {
				new deleteFiles();
			}
			else if(option==3) {
				String s;
				System.out.println("Enter file name to be searched:");
				s=sc1.next();
				new searchFile(s);
				
			}
			else if(option==4) {
				break;
			}
			else {
				System.out.println("Invalid option\n");			
			}
			
		}
		Main.options();
		
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	public static void main(Scanner sc1) {
		
		businessoptions(sc1);
	}

	
}
