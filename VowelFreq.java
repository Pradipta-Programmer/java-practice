import java.util.*;
class VowelFreq
{
    int count(String s)
    {
        int l= s.length();
        if(l-1 == -1)
        {
            return (0);
        }
        char c= s.charAt(l-1);
        s= s.substring(0, l-1);
        if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
        {
            return(1+(count(s)));
        }
        return(count(s));
    }
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String n= in.next();
        VowelFreq ob= new VowelFreq();
        System.out.println("Frequency of vowels= "+ob.count(n));
    }
}