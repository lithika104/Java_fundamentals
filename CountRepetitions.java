public class CountRepetitions {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 9};

        for (int i = 0; i < arr.length; i++) {
            int count = 1; 
            if (arr[i] != -1) { 
                
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1; 
                    }
                }
                System.out.println("Element " + arr[i] + " is repeated " + count + " times.");
            }
        }
    }
}
