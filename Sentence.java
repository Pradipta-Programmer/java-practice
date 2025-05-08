import java.util.*;
class Sentence
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s= in.nextLine();
        s= s.trim();
        s= " "+s+" ";
        s= s.toUpperCase();
        int l= s.length();
        String n= " ";
        String m= " ";
        int i, t=0, v=0;//ANAMIKA AND SUMAN ARE NEVER GOING TO QUARREL ANYMORE
        for(i=1; i<l; i++)
        {
            if(s.charAt(t)== s.charAt(i))
            {
                char f= s.charAt(t+1);
                char e= s.charAt(i-1);
                if(((f== 'A')||(f== 'E')||(f== 'I')||(f== 'O')||(f== 'U'))&&((e== 'A')||(e== 'E')||(e== 'I')||(e== 'O')||(e== 'U')))
                {
                    v= v+1;
                    n= n+ (s.substring(t, i));
                }
                else
                {
                    m= m+ (s.substring(t, i));
                }
                t= i;
            }
        }
        System.out.println("Number of words start and end with vowels= "+v);
        System.out.println("The new sentence= "+(n.trim())+" "+(m.trim()));
    }
}