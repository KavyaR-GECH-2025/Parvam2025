package inheritence;

class Student{                
	//states or instance variables(age,name)
	public int age = 23;
	public String name = "Kavya";
	public double marks = 300.50;
	
	//actons
	public void isPlaying() {
		System.out.println(this.name+ " is Playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name+ " is Sleeping");
	}
	
}

public class ClassObjectInJava {     
	public static void main(String[] args) {
		
		Student std1 = new Student();
		System.out.println(std1.name);
		System.out.println(std1.age);
		System.out.println(std1.marks);
		std1.isPlaying();
		std1.isSleeping();
		
		
		/*
		 * class : it will represent the state and behaviour of an object
		 * for class we can provide only two acceses specifier is public and default
		 * state -->property
		 * beha --> action
		 * 
		 * object : it is implementation of class(state and action)
		 * ex: Student
		 * 
		 * property :
		 * --------
		 * USN
		 * name
		 * branch
		 * age
		 * 
		 * action:
		 * -------
		 * isplaying()
		 * issleeping()
		 * 
		 * 
		 * how to declare class and object
		 * =================================
		 * class class_name{
		 *      state
		 *      action
		 *   }
		 *   
		 * ex :
		 *     class student{
		 *     property:
		 *     public int age = 30;
		 *     
		 *     action:
		 *     public void isPlaying(){
		 *         syso("the student is playing")
		 *     }
		 *  }
		 *  
		 * Student std1 = new Student();
		 * System.out.println(std1.age);
		 * std1.isPlaying();
		 * std1.isSleeping();
		 * 		 
		 */
	}

}
