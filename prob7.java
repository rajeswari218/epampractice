package epam_practice;

import java.util.Scanner;

public class prob7 {
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int n=s.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		//int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
		{
				if(a[j]==a[i])
				{
					for(int k=j;k<n;k++)
					{
					a[k]=a[k+1];
				}
	                n--;

				}
		}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.println(a[i]);
		}

	}
}
