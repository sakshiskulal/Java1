class Outer 
{ 
void display() 
{  
System.out. println("You are inside outer class"); 
} 
class inner  
{ 
void display() 
{  
System.out. println("You are inside inner class"); 
} 
} 
} 
public class Testclass
{ 
public static void main(String [] args) 
{ 
Outer obj = new Outer(); 
obj.display(); 
Outer.inner in = obj.new inner(); 
in.display();
}}