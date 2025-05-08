import java.util.*;
class Matrix
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the row and column");
        int r= in.nextInt();
        int c= in.nextInt();
        System.out.println("Enter the elements for Array");
        int A[][]= new int[r][c];
        int i, j, k, l, m;
        for(i=0; i<r; i++)
        {
            for(j=0; j<c; j++)
            {
                A[i][j]= in.nextInt();
            }
        }
        int B[][]= new int[r-1][c-1];
        int C[][]= new int[r-1][c-1];
        int p=0, q=0, s=0;
        for(i=0; i<c; i++)
        {
            int n= A[0][i];
            for(j=0; j<r; j++)
            {
                if(j!=0)
                {
                    for(k=0; k<c; k++)
                    {
                        if(k==i)
                        {
                            continue;
                        }
                        B[q][s]= A[j][k]*n;
                        s= s+1;
                    }
                    q= q+1;
                    s=0;
                }
            }
            q=0;
            for(l=0; l<r-1; l++)
            {
                for(m=0; m<c-1; m++)
                {
                    C[l][m]= C[l][m]+ B[l][m];
                }
            }
        }
        for(i=0; i<r-1; i++)
        {
            for(j=0; j<c-1; j++)
            {
                System.out. print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}