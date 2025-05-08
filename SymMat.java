import java.util.*;
class SymMat
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the width");
        int r= in.nextInt();
        int A[][]= new int[r][r];
        int B[][]= new int[r][r];
        System.out.println("Enter the elements");
        int i, j;
        for(i=0; i<r; i++)
        {
            for(j=0; j<r; j++)
            {
                A[i][j]= in.nextInt();
            }
        }
        System.out.println("Output:-");
        for(i=0; i<r; i++)
        {
            for(j=0; j<r; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0; i<r; i++)
        {
            for(j=0; j<r; j++)
            {
                B[j][i]= A[i][j];
            }
        }
        int f= 0;
        for(i=0; i<r; i++)
        {
            for(j=0; j<r; j++)
            {
                if(B[i][j]==A[i][j])
                {
                    continue;
                }
                else
                {
                    f= 1;
                }
            }
        }
        if(f==1)
        {
            System.out.println("It is not Symmetric Matrix");
        }
        else
        {
            System.out.println("It is Symmetric Matrix");
        }
    }
}