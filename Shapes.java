abstract class Shape 
{ 
abstract public double calculateArea(); 
abstract public double calculatePerimeter(); 
} 
class Circle extends Shape 
{ 
private double radius; 
public Circle(double radius)  
{ 
this.radius = radius;
} 
@Override 
public double calculateArea() 
{  
return Math.PI * radius * radius; 
} 
@Override 
public double calculatePerimeter() 
{  
return 2 * Math.PI * radius; 
} 
} 
class Triangle extends Shape 
{ 
private double side1; 
private double side2; 
private double side3; 
// Constructor for Triangle 
public Triangle(double side1, double side2, double side3)  
{ 
} 
this.side1 = side1; 
this.side2 = side2; 
this.side3 = side3; 
@Override 
public double calculateArea() 
{  
} 
double s = (side1 + side2 + side3) / 2; 
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); 
@Override 
public double calculatePerimeter() 
{  
return side1 + side2 + side3; 
} 
} 
public class Shapes { 
public static void main(String[] args) { 
Circle circle = new Circle(5.0); // Creating a Circle object with a radius of 5.0 
Triangle triangle = new Triangle(3.0, 4.0, 5.0); 
// Display the area and perimeter of the circle 
System.out.println("The area of circle is: " + circle.calculateArea()); 
System.out.println("The perimeter of circle is: " + circle.calculatePerimeter()); 
// Display the area and perimeter of the triangle 
System.out.println("The area of triangle is: " + triangle.calculateArea()); 
System.out.println("The perimeter of triangle is: " + triangle.calculatePerimeter()); 
} 
} 
