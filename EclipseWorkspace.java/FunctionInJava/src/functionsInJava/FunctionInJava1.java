package functionsInJava;

public class FunctionInJava1 {
	
	// 1. public function
	// -->anywhere
	public void publicFunction() {
		System.out.println("This is public function");
	}
	
	// 2. Private function
	// -->within same class
	private void privatFunction() {
		System.out.println("This is private function");
	}
	
	// 3. default function
	// --> within same package
    void defaultFunction() {
		System.out.println("This is default function");
	}
    
	
	// 4. protected function
    // --> within package but subclass in different package
    protected void protectedFunction() {
    	System.out.println("This is protected function");
    }
    
    // 5. static function
    // access by using class name
    public static void staticFunction() {
    	System.out.println("This is static function");
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInJava1 obj = new FunctionInJava1();
		obj.publicFunction();
     	obj.privatFunction();
		obj.defaultFunction();
		obj.protectedFunction();
		FunctionInJava1.staticFunction();
		

	}

}
