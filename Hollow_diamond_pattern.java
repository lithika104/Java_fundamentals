class Hollow_diamond_pattern
{
    public static void main(String[] args)
    {
        int n = 4;
        int i, j;

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i - 1; j++)
            {
                if(j == 1 || j == 2 * i - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        for(i = n - 1; i >= 1; i--)
        {
            for(j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i - 1; j++)
            {
                if(j == 1 || j == 2 * i - 1)  
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}