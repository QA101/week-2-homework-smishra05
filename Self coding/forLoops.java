
public class forLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 FOR LOOPS Coding exercises:

Write a program using FOR loop to print following outputs:


* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

 */

		for(int i = 0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
			System.out.print("*"+" ");
		}
		System.out.println();
		
		}
		
/*
2
2 2
2 2 2
2 2 2 2
*/

		for(int i = 0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print("2"+" ");
		}
		System.out.println();
		
		}	
		
		System.out.println();
		
		/*
$
$ $ $
$ $ $ $ $
$ $ $ $ $ $ $
*/
		
		for(int i = 0;i<4;i++)
		{
			for(int j=0;j<(2*i+1);j++)
			{
			System.out.print("$"+" ");
			
		}
		System.out.println();
		
		}		
		System.out.println();
/*
	* *
	* * * *
	* * * * * *
	* * * * * * * *
*/
	
		for(int i = 0;i<4;i++)
		{
			for(int j=0;j<=(2*i+1);j++)
			{
			System.out.print("*"+" ");
			
		}
		System.out.println();
		
		}	
		
		
		/*
		
1
1 2
1 2 3
1 2 3 4
		*/

				for(int i = 0;i<5;i++)
				{
					for(int j=1;j<=i;j++)
					{
					System.out.print(j+" ");
				}
				System.out.println();
				
				}	
				
				System.out.println();
	


/*
1 2 3
1 2 3 4 5
7 2 3 4 5 6 7
*/	
				for(int i = 1;i<4;i++)
				{
					for(int j=1;j<=(2*i+1);j++)
					{
					System.out.print(j+" ");
					
				}
				System.out.println();
				
				}		
				System.out.println();
				
				

/*
1
2 2 2
3 3 3 3 3
4 4 4 4 4 4 4	
*/

				for(int i = 0;i<4;i++)
				{
					for(int j=0;j<(2*i+1);j++)
					{
					System.out.print(i+1+" ");
					
				}
				System.out.println();
				
				}		
				System.out.println();
								
				
	
	}
	
	
	
}
	
	


