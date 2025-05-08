import java.util.*;
class FutureDate
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the day number (1-366): ");
        int dn= in.nextInt();
        System.out.print("Enter the year (YYYY): ");
        int y= in.nextInt();
        System.out.print("Enter the value of n (1-100): ");
        int n= in.nextInt();
        int i=0, f=0, p=1;
        String M[]= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int j=0, g=1;
        int c=0, h=0;
        if((n>100)||(n<1))
        {
            System.out.println("Incorrect value of n");
            if((dn>365)||(dn<1))
            {
                System.out.println("Incorrect Day Number");
            }
            System.exit(0);
        }
        while(i<12)
        {
            if((M[i]=="April")||(M[i]=="June")||(M[i]=="September")||(M[i]=="November"))
            {
                f= 0;
                j= 0;
                while(j<30)
                {
                    c= c+1;
                    f= f+1;
                    if(c==dn)
                    {
                        break;
                    }
                    j++;
                }
            }
            else if((M[i]=="February"))
            {
                if(y%4==0)
                {
                    f= 0;
                    j= 0;
                    while(j<29)
                    {
                        c= c+1;
                        f= f+1;
                        if(c==dn)
                        {
                            break;
                        }
                        j++;
                    }
                }
                else
                {
                    f= 0;
                    j= 0;
                    while(j<28)
                    {
                        c= c+1;
                        f= f+1;
                        if(c==dn)
                        {
                            break;
                        }
                        j++;
                    }
                }
            }
            else
            {
                f= 0;
                j= 0;
                while(j<31)
                {
                    c= c+1;
                    f= f+1;
                    if(c==dn)
                    {
                        break;
                    }
                    j++;
                }
            }
            if(c==dn)
            {
                c= 0;
                if(g==1)
                {
                    dn= dn+n;
                    g= 2;
                    System.out.println("Date= "+f+"th "+M[i]+", "+y);
                    i= 0;
                    continue;
                }
                if(g==2)
                {
                    System.out.println(n+" Days Later, Date= "+f+"th "+M[i]+", "+y);
                    break;
                }
            }
            if(i==11)
            {
                i= 0;
                y= y+1;
                continue;
            }
            i++;
        }
    }
}