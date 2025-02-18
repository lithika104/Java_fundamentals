public class SortDescending {
    public static void main(String[] args) {
       
        int[] numbers = {5, 9, 7};

        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                   
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
