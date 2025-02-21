import java.util.Scanner;

public class Add {
    private int a, b, c;

    
    public void sum() {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
       
        c = a + b;
        System.out.println("Sum = " + c);
        
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum();
    }
}

