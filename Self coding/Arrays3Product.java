import java.util.Scanner;

public class Arrays3Product {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub

3) Write a program which takes an input as Integers of arrays and it finds product
of all arrays.
EX: input : int[] a ={1,2,3,4};
Output: 1*2*3*4 = 24 */
		
		int arr_size = 0;
		int product = 1;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
		for (int i=0;i<arr_size;i++)
	    {
	    	product = product * arr[i];
	    }
		in.close();
		System.out.println(product);
		
			}

	}


