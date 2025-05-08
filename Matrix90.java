import java.util.*;
class Matrix90
{
    int A[][]= new int[100][100];
    int M[][]= new int[100][100];
    int n;
    Matrix90(int size)
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
    void rotateright()
    {
        int x=0, y= n-1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                A[x][y]= M[i][j];
                x= x+1;
            }
            x= 0;
            y= y-1;
        }
    }
    void rotateleft()
    {
        int x=n-1, y= 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                A[x][y]= M[i][j];
                x= x-1;
            }
            x= n-1;
            y= y+1;
        }
    }
    void display()
    {
        System.out.println("Original Matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("New Matrix");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size");
        int m= in.nextInt();
        Matrix90 ob= new Matrix90(m);
        ob.accept();
        System.out.println("What kind of 90° you want?");
        System.out.println(" • Enter 1 for rightward rotate"+"\n • Enter 2 for leftward rotate");
        int c= in.nextInt();
        switch(c)
        {
            case 1:
                ob.rotateright();
                ob.display();
                break;
            case 2:
                ob.rotateleft();
                ob.display();
                break;
        }
    }
}