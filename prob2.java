package epam_practice;

public class prob2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int l=a.length;
		int min=a[0],max=a[0];
		for(int i=0;i<l;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("minimum="+min);
		System.out.println("maximum="+max);

		}
}
