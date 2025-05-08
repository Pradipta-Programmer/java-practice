import java.util.*;
class Bubble_Sort
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 10 integers");
        int n[]= new int[10];
        int m[]= new int [10];
        int i, j, t=0;
        for(i=0; i<10; i++)
        {
            n[i]= in.nextInt();
        }
        for(i=0; i<10; i++)
        {
            m[i]= n[i];
        }
        for(i=0; i<10; i++)
        {
            for(j=0; j<9; j++)
            {
                if(n[j]<n[j+1])
                {
                    t= n[j];
                    n[j]= n[j+1];
                    n[j+1]= t;
                }
            }
        }
        System.out.print("Original Array: ");
        for(i=0; i<10; i++)
        {
            System.out.print(m[i]+ " ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for(i=0; i<10; i++)
        {
            System.out.print(n[i]+ " ");
        }
    }
}