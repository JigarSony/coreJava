package aa13Collections1;

import java.util.ArrayList;

public class A5IntQue {

	public static void main(String[] args) {
		
		//find the unique number in the array
		
		int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};
		
		//4-3, 5-3, 6-2, 9-1
		
		//Empty ArrayList  push unique then search for other
		//counter also
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0;i<a.length;i++) 
		{
			int k=0;
			
			if(!al.contains(a[i])) 
			{
				al.add(a[i]);
				k++;
				for(int j = i+1;j<a.length;j++) 
				{
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+ " - times - "+k);
				
				if (k==1) {
					System.out.println(a[i] + " is a unique Number ");
				}
			}
			
		}
		
	}

}
