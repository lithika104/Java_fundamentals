import java.util.Scanner;

public class Multi {
    
    private int a, b, c;

    
    private void get() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
        in.close();
    }

    
    public void sum() {
        get();  
        c = a * b;
        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {
        Multi obj = new Multi();
        obj.sum(); 
    }
}
