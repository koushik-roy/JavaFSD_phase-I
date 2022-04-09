package phase_I_project;

import java.io.File;
import java.util.Scanner;

public class AddFolders {

	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the folder:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(name.length()==0)
			System.out.println("please enter the name");
		else
			add(name);

	}

	private static void add(String s) {
		// TODO Auto-generated method stub
		if(new File("D:\\eclipse-workspace\\JavaFSD_phase1\\TestFiles\\"+s).exists()) {
			System.out.println("already exists");
		}
		else
	
		try {
			 if(new File("D:\\eclipse-workspace\\JavaFSD_phase1\\TestFiles\\"+s).mkdir());{
				 System.out.println("Folder created with name: "+s);
			 } 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
