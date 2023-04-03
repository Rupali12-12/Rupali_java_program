package basics;

public class OnediaArrayProgram {

	public static void main(String[] args) {
		
		int array1[]=new int[4]; //declaration of array
		int array2[]= {12,1,34,23,12};
		
		array1[0]=11;
		array1[1]=10;
		array1[2]=9;
		array1[3]=32;
		
		System.out.println(array1[3]);
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		
		
		
		//string array operation
		String str[]={"java","selenium","bDD"};
		String str2[]=new String[3];
		str2[0]="account";
		str2[1]="tally";
		str2[2]="science";
		System.out.println(str[1]);
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
		//string character operation
		char ch[]=new char[3];
		char ch2[]= {'R','U','D','S'};
		
		ch[0]='L';
		ch[1]='a';
		ch[2]='h';
		System.out.println(ch[2]);
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		
				
		

	}

}
