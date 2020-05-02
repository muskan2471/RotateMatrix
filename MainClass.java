import java.util.*;
public class MainClass
{
	int n;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter N:");
		n=sc.nextInt();
		int mat[][]=new int[n][n];
		System.out.println("Enter Data:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		rotateMatrix(mat,n);
	}
	void rotateMatrix(int mat[][],int n)
	{
		int rotatedMat[][]=new int[n][n];
		
		int i=0,j=0;
		int k=1;
		int flag=0;
		while(flag==0)
		{
			if(rotatedMat[i][j]!=0)
			{
				flag=1;
			}
			else if(i==j && j==(n/2))
			{
				rotatedMat[i][j]=mat[i][j];
				flag=1;
			}
			else
			{
				while(j<n-k)
				{
					rotatedMat[i][j+1]=mat[i][j];
					j++;
				}
				
				while(i<n-k)
				{
					rotatedMat[i+1][j]=mat[i][j];
					i++;
				}
				
				while(j>=k)
				{
					rotatedMat[i][j-1]=mat[i][j];
					j--;
				}
				
				while(i>=k)
				{
					rotatedMat[i-1][j]=mat[i][j];
					i--;
				}
				
				k++;
				i++;
				j++;
			}
		}
		System.out.println("\nOriginal Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("\nRotated Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(rotatedMat[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		m.getData();
		

	}

}
/*=================OUTPUT===================
 Original Matrix:
1  2  3  4  
5  6  7  8  
9  10  11  12  
13  14  15  16  

Rotated Matrix:
5  1  2  3  
9  10  6  4  
13  11  7  8  
14  15  16  12  




Original Matrix:
1  2  3  4  5  
6  7  8  9  10  
11  12  13  14  15  
16  17  18  19  20  
21  22  23  24  25  

Rotated Matrix:
6  1  2  3  4  
11  12  7  8  5  
16  17  13  9  10  
21  18  19  14  15  
22  23  24  25  20 
*/
