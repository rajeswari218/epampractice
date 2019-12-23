package epam_practice;

import java.util.Scanner;

public class prob6 {
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		int n=s.nextInt();
		int a[] = new int[n];

		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
		{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		}


		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}
}
