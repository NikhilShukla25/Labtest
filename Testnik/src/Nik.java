
	import java.util.Scanner;

	public class Nik
	{
		public static void main(String args[])
	    {
			System.out.println("Enter The Value For N :");
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			int[][] spiral = new int[m][m];
			int value = 1;
			int minC = 0;
			int maxC = m-1;
			int minR = 0;
			int maxR = m-1;
			while (value <= m*m)
			{
				for (int i = minC; i <= maxC; i++)
				{
					spiral[minR][i] = value;
					value++;
				}
				for (int i = minR+1; i <= maxR; i++)
				{
					spiral[i][maxC] = value;
					value++;
				}
				for (int i = maxC-1; i >= minC; i--)
				{
					spiral[maxR][i] = value;
					value++;
				}
				for (int i = maxR-1; i >= minR+1; i--)
				{
					spiral[i][minC] = value;
					value++;
				}
				minC++;
				minR++;
				maxC--;
				maxR--;
			}
			for (int i = 0; i < spiral.length; i++)
			{
				for (int j = 0; j < spiral.length; j++)
				{
					System.out.print(spiral[i][j]+ "\t");
				}
				System.out.println();
			}
	    }
	}



