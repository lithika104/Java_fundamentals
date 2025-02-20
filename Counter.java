public class Counter {

    static int objectCount = 0;

    
    public Counter() {
        objectCount++;
        System.out.println("Object " + objectCount + " created current counter");
    }

    
    public static void displayTotalObjects() {
        System.out.println("Total objects created: " + objectCount);
    }

    public static void main(String[] args) {
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Object Count");
        Counter.displayTotalObjects();
    }
}
