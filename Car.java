public class Car
 {

    
    String brand;

    
    public Car() 
    {
        brand = "Unknown";
    }

    
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

   
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) 
    {
        Car car = new Car();

        
        System.out.println("Default Car Details");
        car.displayDetails();

        
        car.setBrand("Toyota");

        
        System.out.println("\n Updated Car Details ");
        car.displayDetails();
    }
}
