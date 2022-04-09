package phase_I_project;

import java.io.File;
import java.util.Scanner;

public class EnterDirectory {

	public static void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the folder to enter:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(name.length()==0)
			System.out.println("please enter the name");
		else
			enter(name);

	}

	public static void enter(String s) {
		// TODO Auto-generated method stub
		 if(new File("C:\\Users\\JEET\\eclipse-workspace\\JavaFullStack\\src\\phase_I_project\\TestFiles"+s).exists()) {
			 System.out.println("Inside "+s+" folder");
		 }
		 else
			 System.out.println("error: folder not found");
		

	}

}
