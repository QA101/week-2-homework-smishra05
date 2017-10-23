import java.util.Scanner;

public class Arrays7AverageDouble {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub

Write a program which takes an input as doubles of arrays and it finds average
of all arrays.*/
		
		int arr_size = 0;
		double sum = 0;
		double average = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    double arr[] = new double[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextDouble();
	    }
		for (int i=0;i<arr_size;i++)
	    {
	    	sum = sum + arr[i];
	    }
		average = sum/arr_size;
		in.close();
		System.out.println(average);
		
			}

	}


