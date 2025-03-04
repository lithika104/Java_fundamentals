public class substring_form
{
    public static void main(String[] args)
    {

        String x = "Hello, Java ";
        System.out.println("String substring: " + x.substring(7, 11));


        StringBuilder y = new StringBuilder("Welcome to Programming");
        System.out.println("StringBuilder substring: " + y.substring(11, 22));


        StringBuffer z = new StringBuffer("Learning Java is fun");
        System.out.println("StringBuffer substring: " + z.substring(9, 13));
    }
}


