public class LongNumber_addition
{
    public static void main(String[] args)
    {
        String n1 = "99999999999999";
        String n2 = "4444444444";
        String sum = " ";
        int carry = 0;

        int i = n1.length() - 1, j = n2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0)
        {
            int digit1 = (i >= 0) ? n1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? n2.charAt(j--) - '0' : 0;
            int tempSum = digit1 + digit2 + carry;
            sum = (tempSum % 10) + sum;
            carry = tempSum / 10;
        }

        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("Sum: " + sum);
    }
}
