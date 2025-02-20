public class Book {

    
    String title;
    double price;

    
    public Book() {
        title = "Java Programming";
        price = 100.0;
    }

    
    public void display()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) 
    {
        
        Book book = new Book();

         book.display();
    }
}
