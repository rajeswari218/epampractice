package epam_practice;

import java.util.Scanner;

public class prob5 {
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
		
		int max1=a[0];
		int max2=a[1];
		int min1=a[n-1];
		int min2=a[n-2];
		System.out.println("max1="+max1+" max2="+max2+" min1="+min1+" min2="+min2);
		}

}
