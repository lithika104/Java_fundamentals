import java.util.Scanner;

public class Calculator {
    private int a, b;

    
    private void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = in.nextInt();
        System.out.print("Enter second number: ");
        b = in.nextInt();
    }

    
    public void add() {
        getInput();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    
    public int difference() {
        getInput();
        return a - b;
    }

    
    public void product(int x, int y) {
        int prod = x * y;
        System.out.println("Product = " + prod);
    }

    
    public double division(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed.");
            return -1;
        }
        return (double) x / y;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println(" Addition ");
        calc.add();

        
        System.out.println(" Difference ");
        int diff = calc.difference();
        System.out.println("Difference = " + diff);

        
        System.out.println( " Product ");
        calc.product(5, 4); 


        System.out.println(" Division ");
        double divResult = calc.division(20, 4); 
        if (divResult != -1) {
            System.out.println("Division Result = " + divResult);
        }
    }
}
