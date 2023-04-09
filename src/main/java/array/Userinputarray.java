package array;
import java.util.Scanner;

public class Userinputarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();
		
		System.out.println("Enter of number column : ");
		int column=sc.nextInt();
		
		int array1[][]=new int [row][column];
		int array2[][]=new int [row][column];
		int array3[][]=new int [row][column];
		
		System.out.println("enter first array :  ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				array1[i][j]=sc.nextInt(); 
		    }
		}
		
    System.out.println("enter second array :  ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				array2[i][j]=sc.nextInt(); 
		    }
		}
		//addition
		
		
		for(int i=0;i<row;i++)
	    {
	     for(int j=0 ;j<column;j++)
	    {
	    	 array3[i][j]=array1[i][j]+array2[i][j];
	    }
	     System.out.println();
	        }
		
		  for(int i=0;i<row;i++)
		    {
		     for(int j=0 ;j<column;j++)
		    {
		    	 System.out.print(array3[i][j]+ "  ");
		    }
		     System.out.println();

				
			}
	}

}
