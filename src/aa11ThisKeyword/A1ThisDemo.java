package aa11ThisKeyword;

public class A1ThisDemo {
	
	int a = 2;
	//this variable used in entire program
	
	public void getData() {
		int a = 3;
		
		System.out.println(a);//3
		System.out.println(this.a);//2
		
	}

	public static void main(String[] args) {
		
		A1ThisDemo td = new A1ThisDemo();
		td.getData(); //3
	}
	
	/*
	 * So If some variable used defined globally
	 * And in Local Method you needs to use both local and global variable
	 * So in this case this keyword comes into the picture
	 * 
	 * So this refers to class object
	 * object scope lies in class level 
	 */

}
