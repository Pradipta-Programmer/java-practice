public class MyStringBuffer
{
    public static void main()
    {
        StringBuffer s1= new StringBuffer("Hi, ");//this makes its capacity 16+ 4= 20
        System.out.println(s1.capacity());//first, s has capacity of 16 and when some string x is stored there, it becomes 16+no. of characters in x 
        s1= s1.append("Pradipta Singha  "); //since it exceeds 20, it becomes (20*2)+2= 42
        System.out.println(s1.capacity());//if s exceeds the old capacity (16+x), then it will show ((16+x)*2)+2, otherwise (16+x)
        s1.ensureCapacity(43);//since it exceeds 42, it becomes (42*2)+2= 86
        System.out.println(s1);
        System.out.println(s1.capacity());
        StringBuffer s2= new StringBuffer("Pradipta Singha");
        s2.setLength(6);
        System.out.println(s2);
    }
}