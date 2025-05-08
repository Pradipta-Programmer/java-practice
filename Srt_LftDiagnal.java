import java.util.*;
class Srt_LftDiagnal
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter either the row or coloum");
        int n= in.nextInt();
        int A[][]= new int[n][n];
        int i, j;
        System.out.println("Enter the numbers");
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                A[i][j]= in.nextInt();
            }
        }
        int t=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n-1; j++)
            {
                if(A[j][j]>A[j+1][j+1])
                {
                    t= A[j][j];
                    A[j][j]= A[j+1][j+1];
                    A[j+1][j+1]= t;
                }
            }
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}