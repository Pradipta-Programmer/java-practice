import java.util.*;
class Linear_Search
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 5 Strings");
        String a[]= new String[5];
        int i, j, k=0;
        for(i=0; i<5; i++)
        {
            a[i]= in.nextLine();
        }
        System.out.println("Enter the String to be searched");
        String b= in.nextLine();
        for(i=0; i<5; i++)
        {
            if(a[i].equals(b)== true)
            {
                k+= 1;
                break;
            }            
        }
        if(k== 1)
        {
            System.out.println("String Found");
        }
        else
        {
            System.out.println("String Found");
        }
    }
}