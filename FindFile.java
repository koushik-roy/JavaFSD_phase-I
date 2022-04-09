package phase_I_project;

import java.io.File;
import java.util.Scanner;

public class FindFile {

	public static void run() {
		// TODO Auto-generated method stub
				System.out.println("Enter the name of the file:");
				Scanner sc=new Scanner(System.in);
				String name=sc.nextLine();
				//name=name.toLowerCase();
				if(name.length()==0)
					System.out.println("please enter the name");
				else
					find(name);

	}

	private static void find(String s) {
		// TODO Auto-generated method stub
		if(new File("D:\\eclipse-workspace\\JavaFSD_phase1\\TestFiles\\"+s+".txt").exists()) {
			System.out.println("File exists");
		}
		else
			System.out.println("file doesn't exist");
	}

}