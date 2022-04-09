package phase_I_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RetrieveFiles {
	
	public static void run() {
		System.out.println("Total number of files: "+count());
		retrieve();
	}

	
	private static void retrieve() {
		try {
			File folder=new File("C:\\Users\\JEET\\eclipse-workspace\\JavaFullStack\\src\\phase_I_project\\TestFiless");
					
			File[] files=folder.listFiles();
			for(File file:files) {
					System.out.println(file.getName());
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int count() {
		int count=0;
		try {
			File folder=new File("D:\\eclipse-workspace\\JavaFSD_phase1\\TestFiles");
					
			File[] files=folder.listFiles();
			for(File file:files) {
					count++;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return (count);
		
	}
	
	
}
