package com.mycompany.practical5_3;
final class Student
{
    final int marks=100;
    final void display();
}



// Outcome

/* The Student class in Class 01 is marked as final, therefore it cannot be subclassed. 
It cannot be inherited from by any subclasses.

Code is attempting to extend the Student class in Class 02 by introducing a new subclass called Undergraduate. 
The Student class, however, is unable to be subclassed because it has been designated as final. 
Since the Student class cannot be subclassed, the code will not compile correctly and you will see an error notice.*/