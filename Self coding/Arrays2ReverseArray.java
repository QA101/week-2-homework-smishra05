import java.util.Scanner;

public class Arrays2ReverseArray {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		
		2) Write a program which takes an input as Integers of arrays and prints in reverse
	order
	EX: input : int[] a ={1,2,3,4};
	Output:
	a [0] = 4
	a[1] =3
	a[2] =2
	a[3] = 1 */
		
		int arr_size = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
		for (int i=(arr_size-1);i>=0;i--)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    }
		in.close();
		
			}


	}

