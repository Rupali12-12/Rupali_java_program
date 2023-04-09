package array;

public class Twodimensionalarray {

	public static void main(String[] args) {
		//integer two dimensional array operation
		
		int ary[][]=new int [2][2]	;
		int ary2[][]= {{9,7,5},{12,34,13}};
		 //ary[0][0]=1;
		// ary[0][1]=3;
		 //ary[1][0]=4;
		// ary[1][1]=7;
		  //System.out.println(ary[1][0]);
		  
		  System.out.println("row   " + ary2.length); //length of rows

		  System.out.println("col   " + ary2[1].length); //length of column
		  
		  
		  for (int i = 0; i < ary2.length; i++) {
				for (int j = 0; j < ary2[1].length; j++) {
					System.out.print(ary2[i][j] + "  ");
				}
				
				
				//string array operation
				String str[][]={{"man","girl","boy"},{"abc","xyz","lmp"}};
				String str2[][]=new String[3][3];
				str2[0][0]="math";
				str2[0][1]="history";
				str2[1][0]="marathi";
				str2[1][1]="english";
				//System.out.println(str2[0][1]);
				
				 for (int k = 0; k < str.length; k++) {
						for (int l = 0; l< str[1].length; l++) {
							System.out.print(str[k][l] + "  ");
						}
						
			
			
				 }
		  }
	
	
		  }
	
	}


