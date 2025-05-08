import java.util.*;
class WrdContFreq
{
    public static void main()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= in.nextLine();
        int i, j, k;
        s= s.trim();
        int l= s.length();
        String p= " ";
        if((s.charAt(l-1)== '?')||(s.charAt(l-1)== '!')||(s.charAt(l-1)== '.'))
        {
            s= s.substring(0, l-1);
            s= " "+s+" ";
            l= s.length();
            for(i=0; i<l-1; i++)
            {
                char c= s.charAt(i);
                if(c== ' ')
                {
                    for(j=i+1; j<l; j++)
                    {
                        char h= s.charAt(j);
                        if(h== ' ')
                        {
                            p= s.substring(i, j);
                            String q= " ";
                            String r= " ";
                            p= p.trim();
                            for(k=0; k<p.length(); k++)
                            {
                                c= p.charAt(k);
                                if((c== 'A')||(c== 'E')||(c== 'I')||(c== 'O')||(c== 'U')||(c== 'a')||(c== 'e')||(c== 'i')||(c== 'o')||(c== 'u'))
                                {
                                    q= q+ "v";
                                }
                                else
                                {
                                    r= r+ "c";
                                }
                            }
                            System.out.println(p+"   "+q);
                            System.out.println("      "+r);
                            q= " ";
                            r= " ";
                            break;
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Cannot Accept This Sentence");
        }
    }
}