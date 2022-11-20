package patika;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StoreMenu {
	

	public static void main(String[] args) {
		
		boolean isRun = true;
		int select;
		
		Scanner Select = new Scanner(System.in);
		
		NotebookMenu notebookMenu = new NotebookMenu();
		MobilePhoneMenu mobilePhoneMenu = new MobilePhoneMenu();
		Brands brands2 = new Brands();
	
		
		while (isRun) {
			
			System.out.println("Patika Store Main Menu ");

			System.out.println("1 - Notebook Transactions" + "\n2 - Telephone Transactions" + "\n3 - Brand List" + "\n4 - Exit");
			select = Select.nextInt();
			while (select < 0 || select > 4)
			{
				System.out.println("Please Entry 1-4");
				select = Select.nextInt();
			}

			switch (select) 
			{
				case 1:
					notebookMenu.menu();
					break;
					
				case 2:
					mobilePhoneMenu.menu();
					break;
					
				case 3:
					brandsList();
					break;
					
				case 4:
					System.out.println("Your Selection : "+select);
					System.out.println("Exit Successful");
					isRun=false;
					break;
			}

		}
		
		
	}
	
	//Default Brands
	
	  public static  void brandsList(){
		   
		 
		  	
			System.out.println("----------------------");
	        System.out.println("| ID  |  Brand Name  |" );
	        System.out.println("----------------------");
	        String printFormat ="| %-3s | %-12s |" ;
	        
	       for(int sayac=0 ; sayac<Brands.sortedCopy.size();sayac++) 
	       {
	    	   System.out.printf(printFormat+"\n",sayac,Brands.sortedCopy.get(sayac));
		       
	       }
	       System.out.println("----------------------");
	       
	       
	        
		
	    }
	

}
