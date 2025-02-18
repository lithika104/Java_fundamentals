public class WordCount {
    public static void main(String[] args) {
        
        String input = "abc abc abc";

       
        String[] words = input.split(" ");

        
        int count = 0;
        for (String word : words) {
            if (word.equals("abc")) {
                count++;
            }
        }

        
        System.out.println(count);
    }
}
