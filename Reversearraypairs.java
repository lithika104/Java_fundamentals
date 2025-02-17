public class Reversearraypairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int pairs = 2;
        
        for (int i = 0; i < pairs * 2 && i + 1 < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        
        System.out.println("Array after reversing pairs:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
