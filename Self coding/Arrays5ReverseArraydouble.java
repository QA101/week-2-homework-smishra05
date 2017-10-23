import java.util.Scanner;

public class Arrays5ReverseArraydouble {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		
		Write a program which takes an input as doubles of arrays and prints in reverse
order
EX: input: double[] a ={1.2, -20, 3.89, 400.0};
Output:
a [0] = 400.0
a[1] =3.89
a[2] = -20
a[3] = 1.2*/ 
		
		int arr_size = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    double arr[] = new double[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextDouble();
	    }
		for (int i=(arr_size-1);i>=0;i--)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    }
		in.close();
		
			}


	}

