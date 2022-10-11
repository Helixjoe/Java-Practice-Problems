import java.util.Scanner;
public class matrix
{
	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no of rows of first matrix");
		int r1 = inp.nextInt();
		System.out.println("Enter no of columns of first matrix");
		int c1 = inp.nextInt();
		
		System.out.println("Enter no of rows of second matrix");
		int r2 = inp.nextInt();
		System.out.println("Enter no of columns of second matrix");
		int c2 = inp.nextInt();
		
		
		if(c1==r2)
		{			
			int matrix1[][] = new int[r1][c1];
			int matrix2[][] = new int[r2][c2];
			int mulmatrix[][] = new int[r1][c2];

			System.out.println("Enter elements of Matrix 1");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					matrix1[i][j] = inp.nextInt();
				}
			}

			System.out.println("First matrix is");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(matrix1[i][j]+" ");
				}
				System.out.println("");
			}

			System.out.println("Enter elements of Matrix 2");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					matrix2[i][j] = inp.nextInt();
				}
			}

			System.out.println("Second matrix is");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(matrix2[i][j]+" ");
				}
				System.out.println("");
			}
			int el=0;
			
				
			for(int i=0; i<r1; i++)
			{
				for(int j=0; j<c2; j++)
				{
					el = 0;
					for(int k=0; k<r2 ; k++)
					{
						el = el + matrix1[i][k] * matrix2[k][j];
					}
					mulmatrix[i][j] = el;
				}	
			}		
					
					
			
			System.out.println("Multiplied matrix is:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(mulmatrix[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Matrices cannot be multiplied");
		}
		
	}
}