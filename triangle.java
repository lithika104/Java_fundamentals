public class triangle {
    public static void main(String[] args) {
        int rows = 4; 
        int[][] triangle = new int[rows][];

       
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; 
            triangle[i][i] = 1; 

           
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        
        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
