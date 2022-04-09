package phase_I_project;

import java.io.File;
import java.util.Scanner;

public class DeleteFolder {

	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the folder:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(name.length()==0)
			System.out.println("please enter the name");
		else
			deleteFile(name);

	}
	
	private static void deleteFile(String s) {
		 if(new File("C:\\Users\\JEET\\eclipse-workspace\\JavaFullStack\\src\\phase_I_project\\TestFiles"+s).delete()) {
			 System.out.println("dolder deleted successfully");
		 }
		 else
			 System.out.println("error: file not found");
	}

}

