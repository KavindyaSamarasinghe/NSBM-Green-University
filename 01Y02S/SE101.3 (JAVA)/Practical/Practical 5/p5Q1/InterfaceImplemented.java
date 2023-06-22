package com.mycompany.p5q1;
public class InterfaceImplemented implements MyFirstInterface
{
    @Override
    public void display() 
    {
        x = 20; // Error: Cannot assign a value to a final variable x
        System.out.println(x);
    }
}

/*
1.Try to declare the variable with/without public static final keywords. 
  Is there any difference between these two approaches? Why?
      
           **The value 'x' is declared as ,poblic static final,
             by default an interface, so whether you explicitly 
             mention these keywords or not, the variable will be 
             treated as a constant(final), static and accessible 
             through the interface. There is no difference between
             declaring 'int x'; andpublic static final int x; within
             an interface

2.Declare the abstract method with/without abstract keyword. 
  Is there any difference between these two approaches? Why?

          **Abstract methods are implicitly declaring a method
            interface. Therefore, Whether you include the 'abstract,
            keyword or not, the method will be treated as abstract.

*/