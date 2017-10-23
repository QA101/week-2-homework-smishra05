import java.util.Scanner;

public class Arrays6ProductDouble {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub

Write a program which takes an input as doubles of arrays and it finds product
of all arrays.
EX: input : double[] a ={1.0, 2.0, 3.89, 4.78};
Output: 1.0*2.0*3.89* 4.78= 37.1884 */
		
		int arr_size = 0;
		double product = 1;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    double arr[] = new double[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextDouble();
	    }
		for (int i=0;i<arr_size;i++)
	    {
	    	product = product * arr[i];
	    }
		in.close();
		System.out.println(product);
		
			}

	}


