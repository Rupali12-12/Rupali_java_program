package basics;

public class InnerForLoop {

	public static void main(String[] args) {
		
         for(int i=0;i<5;i++) {
			
			
			for(int j=1;j<5;j++) {
				System.out.print("  " +j);
			}
			System.out.println();
		}

        for(int i=0;i<5;i++) {
			
			
			for(int j=5;j>i;j--) {
				System.out.print("  "+j );
			}
			System.out.println();
		}
		
		//print 1 to 5
        for(int i=0;i<5;i++) {
			
			
			for(int j=0;j<=i;j++) {
				System.out.print("  "+j );
			}
			System.out.println();
            }
	}

}
