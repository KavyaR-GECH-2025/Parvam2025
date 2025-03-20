package loopingStatement;

public class LoopingStatement {
	public static void main(String[] args) {
		
		//for loop
		System.out.println("Foor Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("" + i);
        }
        
        //while loop
        System.out.println("While Loop");
        int c = 1; 
        while (c <= 10) {
          System.out.println(c); 
          c++; 
        }
        
        //do-while loop
        System.out.println("Do While Loop");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 20);
        
        
        //for each loop
        System.out.println("For Each Loop");
        int [] arr = {1,2,3,4,5};
        for(int a:arr) {
        	System.out.println(a);
        }
        
        
	}

}
