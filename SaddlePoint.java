import java.util.*;
class SaddlePoint
{
    int M[][]= new int[100][100];
    int n;
    SaddlePoint(int size)
    {
        n= size;
    }
    void accept()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                M[i][j]= in.nextInt();
            }
        }
    }
    int minrow()
    {
        int i, j, min=M[0][0], p=0, q=0;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(M[i][j]<min)
                {
                    min= M[i][j];
                    p= i;
                    q= j;
                }
            }
            if(maxcolumn(min, q)== true)
            {
                return (min);
            }
            min= M[i+1][0];
        }
        return -1;
    }
    boolean maxcolumn(int m, int q)
    {
        int i, j, max=0;
        for(i=0; i<n; i++)
        {
            if(M[i][q]>max)
            {
                max= M[i][q];
            }
        }
        if((max==m))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void display()
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size");
        int t= in.nextInt();
        SaddlePoint ob= new SaddlePoint(t);
        ob.accept();
        ob.display();
        t= ob.minrow();
        if(t== -1)
        {
            System.out.println("No Saddle Point");
        }
        else
        {
            System.out.println("Saddle Point= "+t);
        }
    }
}