import java.util.*;
class String_Time
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= in.nextLine();
        s= s.trim();
        s= s.toUpperCase();
        String n= " ";
        int i, j, k=0;
        for(i=s.length()-1; i>-1; i--)
        {
            char ch= s.charAt(i);
            n= n+ ch;
            if(ch== 'A'|| ch== 'E'|| ch== 'I'|| ch== 'O'|| ch== 'U')
            {
                k= k+1;
            }
        }
        System.out.println(n);
        System.out.println("The number of vowels= "+k);
    }
}