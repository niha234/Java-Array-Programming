
import java.util.Scanner;
class  DynamicArrayProgram
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array...");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<=arr.length-1 ;i++ )
		{
			System.out.println("Enter the value for index---->"+i);
			arr[i]=sc.nextInt();
		}
		System.out.print("[");
		for (int i=0;i<=arr.length-1 ;i++ )
		{
			int ele=arr[i];
			System.out.print(ele+" ");
		}
		System.out.println("]");
	}
}



