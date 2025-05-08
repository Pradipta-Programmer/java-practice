import java.util.*;
class Double_Sort
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 4 double values");
        double n[]= new double[4];
        int i, j;
        for(i=0; i<4; i++)
        {
            n[i]= in.nextDouble();
        }
        double l=n[0], s= n[0];
        for(i=1; i<4; i++)
        {
            if(n[i]<s)
            {
                s= n[i];
            }
            if(n[i]>l)
            {
                l= n[i];
            }
        }
        System.out.println("The range is "+ (l-s));
    }
}