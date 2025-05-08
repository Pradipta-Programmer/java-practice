import java.util.*;
class Assignment11
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the choice in 1 or 2");
        int n= in.nextInt();
        switch(n)
        {
            case 1:
                int i, j, k, p=1, q=3;
                for(i=1; i<=4; i++)
                {
                    for(k=1; k<=q; k++)
                    {
                        System.out.print(" ");
                    }
                    for(j=1; j<=p; j++)
                    {
                        System.out.print("* ");
                    }
                    p= p+1;
                    q= q-1;
                    System.out.println();
                }
                q=1; p=3;
                for(i=1; i<=3; i++)
                {
                    for(k=1; k<=q; k++)
                    {
                        System.out.print(" ");
                    }
                    for(j=1; j<=p; j++)
                    {
                        System.out.print("* ");
                    }
                    p= p-1;
                    q= q+1;
                    System.out.println();
                }
                break;
            case 2:
                i=1; j=1; k=1;
                for(i=1; i<=5; i++)
                {
                    if((i==1)||(i==5))
                    {
                        for(j=1; j<=5; j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    else
                    {
                        System.out.print("* ");
                        for(k=1; k<=3; k++)
                        {
                            System.out.print("  ");
                        }
                        System.out.print("* ");
                        System.out.println();
                    }
                }
                break;
                default:
                    System.out.println("Wrong Choice!!!");
        }
    }
}