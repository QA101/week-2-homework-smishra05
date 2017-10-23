import java.util.Scanner;

public class Arrays4InputDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Write a program which takes an input as doubles of arrays and print them.
EX: input: double[] a ={1.2, 2.5, 3.8, -12};
Output:
a [0] = 1.2
a[1] =2.5
a[2] =3.8
a[3] = -12

		 */
		
		int arr_size = 0;//Size will always be an integer 
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    double arr[] = new double[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextDouble();
	    }
		for (int i=0;i<arr_size;i++)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    }
		in.close();

	}

}
