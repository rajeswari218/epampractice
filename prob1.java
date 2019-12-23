package epam_practice;


public class prob1 {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int l=a.length;
	int sum=0;
	for(int i=0;i<l;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("sum="+sum);
	System.out.println("average="+sum/l);

	}
}
