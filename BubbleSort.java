
import java.util.Scanner;
class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	//System.out.println(" ");
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the number into array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		BubbleSort ob=new BubbleSort();
		ob.bubbleSort(arr);
		ob.printArray(arr);

	}
}