import java.util.*;
class Prog2
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 1 to see all Letters and their Unicodes");
        System.out.println("Enter 2 to see the pattern");
        int n= in.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Letters     Unicodes");
                int i;
                for(i=65; i<=90; i++)
                {
                    System.out.println(" "+(char)i+"           "+i);
                }
                break;
            case 2:
                int k, j;
                for(k=1; k<=5; k++)
                {
                    for(j=1; j<=k; j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong Choice BRUH!!!");
        }
    }
}