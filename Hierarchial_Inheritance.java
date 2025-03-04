class Shape1
{
    public void area()
    {
        double area;
        System.out.println("Calculated Area:");

    }
}
class Triangle extends Shape1
{
    public void area (double l , double b)
    {
        double area=0.5*l*b;
        System.out.println("Area of Triangle : "+area);
    }
}
class Rectangle extends Shape1
{
    public void area(double l,double b)
    {
        double area=l*b;
        System.out.println("Area of Rectangle : "+area);
    }
}
class Circle extends Shape1
  {
      public void area(double r)
      {
          final double pi=3.14;
          double area = pi*r*r;
          System.out.println("Area of circle : "+area);
      }
  }
class Square extends Shape1
{
    public void area(int a)
    {
        double area=a*a;
        System.out.println("Area of square :"+area);
    }
}

public class Hierarchial_Inheritance
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.area( 10,2);

        Triangle t = new Triangle();
        t.area( 10,2 );

        Circle c = new Circle();
        c.area ( 10);

        Square  s = new Square();
        s.area ( 10 );


    }

}