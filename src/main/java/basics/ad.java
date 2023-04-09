package basics;

public class ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]={{"man","girl","boy"},{"abc","xyz","lmp"}};
		String str2[][]=new String[3][3];
		str2[0][0]="math";
		str2[0][1]="history";
		str2[1][0]="marathi";
		str2[1][1]="english";
		//System.out.println(str2[0][1]);
		
		 for (int k = 0; k < str.length; k++) {
				for (int j = 0; j < str[1].length; j++) {
					System.out.print(str[k][j] + "  ");
				}
	}

}
}