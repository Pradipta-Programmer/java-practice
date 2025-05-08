import java.util.*;
class Searcher
{
    void linear(int p, int[] A)
    {
        int i, l= A.length;
        for(i=0; i<l; i++)
        {
            if(p== A[i])
            {
                System.out.println("Found It");
            }
            else
            {
                System.out.println("Not Found It");
            }
        }
    }
    void binary(int p, int[] A)
    {
        int mid= (int)A.length/2;
        int f=0, l= A.length-1;
        if(A[mid]> p)
        {
            int C[]= Arrays.copyOfRange(A, f, l-1);
            binary(p, C);
        }
        else if(A[mid]< p)
        { 
            int C[]= Arrays.copyOfRange(A, f+1, l);
            binary(p, C);
        }
        else if(A[mid]== p)
        {
            System.out.println("Found It");
        }
        else
        {
            System.out.println("Not Found It");
        }
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        Searcher ob= new Searcher();
        System.out.println("Enter the length");
        int l= in.nextInt();
        int A[]= new int[l];
        System.out.println("Enter the elements");
        for(int i=0; i<l; i++)
        {
            A[i]= in.nextInt();
        }
        System.out.println("Enter the searching number");
        int p= in.nextInt();
        System.out.println("Enter the searching method you want to use");
        System.out.println("1 for Linear Searching\n"+"2 for Binary Searching\n");
        int n= in.nextInt();
        switch(n)
        {
            case 1:
                ob.linear(p, A);
            case 2:
                ob.binary(p, A);
        } 
    }
}