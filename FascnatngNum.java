import java.util.*;
class FascnatngNum
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int x= n*2;
        int y= n*3; 
        String s= Integer.toString(n)+ Integer.toString(x)+ Integer.toString(y);
        int l= s.length();
        int i, j, f=1, v=0;
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                if (String.valueOf(s.charAt(j)).equals(Integer.toString(f))) 
                {
                    v= v+1;
                }
            }
            if(v==1)
            {
                f= f+1;
                v= 0;
            }
            else
            {
                System.out.println(n+" is not a Fascinating Number");
                System.exit(0);
            }
        }
        System.out.println(n+" is a Fascinating Number");
    }
}