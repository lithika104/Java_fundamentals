class Third_Largest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        if (arr.length < 3) {
            System.out.println("Array must have at least three elements.");
            return;
        }

        int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println("Third Largest: " + third);
    }
}
