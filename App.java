package phase_I_project;

import java.util.Scanner;

public class App {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		char op='Y';
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("##############################");
			System.out.println("FileExplorer1 developed by Koushik Roy");
			System.out.println("Please choose an option:");
			System.out.println("press A for viewing files and folders");
			System.out.println("press B for entering in a folder");
			System.out.println("press C for deleting files");
			System.out.println("press D for adding files");
			System.out.println("press E for adding folders");
			System.out.println("press F for finding files");
			System.out.println("press N to exit");			
			System.out.println("##############################");
			
			System.out.println();
			System.out.println();
			System.out.println();
			char ch=sc.next().toUpperCase().charAt(0);
			
			if(ch=='N' || ch=='n') {
				op='N';
				System.out.println("you chose to exit application");
			}
			switch(ch) {
			case 'A':
				RetrieveFiles rf=new RetrieveFiles();
				rf.run();
				break;
			case 'B':
				EnterDirectory ed=new EnterDirectory();
				ed.run();
				break;
			case 'C':
				DeleteFile df=new DeleteFile();
				df.run();
				break;
			case 'D':
				AddFiles afi=new AddFiles();
				afi.run();
				break;
			case 'E':
				AddFolders afo=new AddFolders();
				afo.run();
				break;
			case 'F':
				FindFile ff=new FindFile();
				ff.run();
				break;
				}
			}
			while(op=='Y' || op== 'y');
		}
	

	

}
