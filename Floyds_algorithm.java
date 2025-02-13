class Floyds_algorithm
{
    public static void main( String[] args)
    {
        int n=5;
        int count=1;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
