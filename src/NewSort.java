import java.util.Scanner;


public class NewSort {

	public static void main(String[] args) {
		System.out.println("enter the size of ther array");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					temp=a[j];
					a[j]=a[min];
					a[min]=temp;
				}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
