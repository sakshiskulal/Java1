class Shape 
{ 
void draw() 
{ 
System.out.print(" Draw a shape \n"); 
} 
void erase() 
{ 
System.out.print(" Erase the shape\n"); 
} 
} 
class circle extends Shape 
{ 
void draw() 
{ 
System.out.print(" Draw a circle \n"); 
} 
void erase() 
{ 
System.out.print(" Erase the circle\n"); 
} 
} 
class Triangle extends Shape 
{ 
void draw() 
{ 
System.out.print(" Draw a Triangle\n"); 
} 
void erase()  
{  
System.out.print(" Erase the Triangle\n"); 
} 
} 
class Square extends Shape 
{ 
void draw() 
{ 
System.out.print(" Draw a Square \n"); 
} 
void erase() 
{ 
System.out.print(" Erase the Square\n"); 
} 
} 
class Main 
{ 
public static void main (String args[]) 
{ 
Shape s1= new circle(); 
s1.draw(); 
s1.erase(); 
Shape s2= new Triangle(); 
s2.draw(); 
s2.erase(); 
Shape s3= new Square(); 
s3.draw(); 
s3.erase(); 
} 
}