class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Largest Number: " + secondMax);
    }
}

