package epam_practice;

import java.util.Scanner;

public class prob3 {
	private static Scanner s;

	public static void main(String[] args) {

	int a[]= {1,4,34,56,7};
	int l=a.length;
	s = new Scanner(System.in);
	int k;
	int h=0;
	k=s.nextInt();
	
	for(int i=0;i<l;i++)
	{
		
		if(a[i]==k)
		{
			h=i+1;
		}
	
	}
if(h!=0)
	System.out.println(h);
else
	System.out.println(-1);
}
}