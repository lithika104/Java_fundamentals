public class UniqueDigitCount {
    public static void main(String[] args) {
        
        String input = "222222";

       
        boolean[] digits = new boolean[10];
        
       
        for (int i = 0; i < input.length(); i++) {
            
            int digit = input.charAt(i) - '0';
            digits[digit] = true; 
        }

        
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (digits[i]) {
                count++;
            }
        }

        
        System.out.println(count);
    }
}
