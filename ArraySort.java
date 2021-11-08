
/* Given an integer array arr, remove a subarray (can be empty) from the array such that the remaining elements in arr are
non-decreasing. A subarray is a contiguous subsequence of the array. Return the length of the shortest subarray to remove*/

import java.util.*;
class ArraySort		
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");   
		int n1=sc.nextInt();   
		int[] arr = new int[n1];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n1; i++)  
		{     
			arr[i]=sc.nextInt();  
		}  
		int n = arr.length;
		System.out.print((Subarray(arr, n)));
	}

	static int Subarray(int arr[],int n)
	{
		int minlen;
		int lt = 0;
		int rt = n - 1;
 
	while (lt < rt && arr[lt + 1] >= arr[lt])
	{
		lt++;
	}
	if (lt == n - 1)
		return 0;
	while (rt > lt && arr[rt - 1] <= arr[rt])
	{
		rt--;
	}
 
	minlen = Math.min(n - lt - 1,rt);
	int b = rt;
	for (int a = 0; a < lt + 1; a++)
	{
		if (arr[a] <= arr[b])
		{
			minlen = Math.min(minlen,b - a - 1);
		}
		else if (b < n - 1)
		{
			b++;
		}
		else
		{
			break;
		}
	}
		return minlen;
	}
}
