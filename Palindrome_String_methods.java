import java.util.Scanner;

public class Palindrome_String_methods
{
    String reverse="";
    public void String_Buitin_method(String x)
    {
        for(int i=x.length()-1;i>=0;i--)
        {
            reverse = reverse + x.charAt(i);
        }
        System.out.println("The reversed sequence : " + reverse);
        if(x.equals(reverse))
        {
            System.out.println("The given sequence is Palindrome.");
        }
        else{
            System.out.println("The given sequence is not Palindrome.");
        }
    }

    public void StringBuilder_Builtin_method(String x)
    {
        StringBuilder builder = new StringBuilder(x);
        builder.reverse();
        if(x.equals(reverse))
        {
            System.out.println("The given sequence is Palindrome.");
        }
        else{
            System.out.println("The given sequence is not Palindrome.");
        }
    }

    public void StringBuffer_Builtin_method(String x)
    {
        StringBuffer buffer = new StringBuffer(x);
        buffer.reverse();
        if(x.equals(reverse))
        {
            System.out.println("The given sequence is Palindrome.");
        }
        else{
            System.out.println("The given sequence is not Palindrome.");
        }
    }


    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the sequence : ");
        String x = scn.nextLine();
        Palindrome_String_methods obj = new Palindrome_String_methods();
        obj.String_Buitin_method(x);
        obj.StringBuilder_Builtin_method(x);
        obj.StringBuffer_Builtin_method(x);
    }
}