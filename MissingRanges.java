public class MissingRanges {
    public static void main(String[] args) {
        int[] arr = {11, 12, 16, 23, 24, 51, 52};
        int start = 5, end = 55;

        int prev = start - 1;

        for (int i = 0; i <= arr.length; i++) {
            int curr = (i < arr.length) ? arr[i] : end + 1;

            if (prev + 1 < curr) {
                System.out.println((prev + 1 == curr - 1) ? (prev + 1) : (prev + 1) + " -> " + (curr - 1));
            }

            prev = curr;
        }
    }
}

