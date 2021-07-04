package a7Array;

public class A2MultiDimensionArraydemo {

	public static void main(String[] args) {
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(b[2][0]);
		//7
		
		System.out.println("****************");
		//2 4 6
		//3 9 12
		//4 16 64
		
		int a [][] = new int[2][3];
		//a[row][column]
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		System.out.println(a[1][0]);
		//4
		
		System.out.println("****************");
		
		for(int i=0;i<a.length;i++) {//row
			for(int j=0;j<a[i].length;j++) {//column
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		//1 2 3
		//4 5 6 
		
	}

}
