import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
1) Write a program, which takes an input as Integers of arrays, and print them.
EX: input : [] a ={1,2,3,4};
Output:
a [0] = 1
a[1] =2
a[2] =3
a[3] = 4	
*/
		
		int arr_size = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
		for (int i=0;i<arr_size;i++)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    }
		in.close();
		
			}

}
