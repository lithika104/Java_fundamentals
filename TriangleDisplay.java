
class LeftAngleTriangle {
    public void display() {
        System.out.println("Left Angle Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


class RightAngleTriangle {
    public void display() {
        System.out.println("Right Angle Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


public class TriangleDisplay {
    public static void main(String[] args) {
        
        LeftAngleTriangle leftTriangle = new LeftAngleTriangle();
        RightAngleTriangle rightTriangle = new RightAngleTriangle();

        
        leftTriangle.display();
        System.out.println();
        rightTriangle.display();
    }
}
