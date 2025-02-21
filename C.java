import java.util.Scanner;

public class C {
    
    public int a, b, c;

    
    public void sum() {
        c = a - b;
        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        C obj = new C();

        
        System.out.print("Enter first number: ");
        obj.a = in.nextInt();
        System.out.print("Enter second number: ");
        obj.b = in.nextInt();

        
        obj.sum();
        
    }
}
