import java.io.PrintStream;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class InputAndOperators {

    public static void main(String[] args) {
        

    //Input in java

// Scanner sc = new Scanner(System.in);

// System.out.println("Input your name: ");
// String name = sc.next();
// System.out.println(name);

// System.out.println("Input your name: ");
// String name = sc.nextLine();
// System.out.println(name);

// System.out.println("Input your age: ");
// int age = sc.nextInt();
// System.out.println(age);




//Comparison Operators
//a==b
// a!=b
// a < b
 // a > b
 // a < = b 
 // a >= b

 //Conditional statement
//  boolean IsSunUp = true;
//  if(IsSunUp == true)
//      System.out.println("day");
//  else 
//      System.out.println("night");


    //  int age = 30;
    //  if(age>18)
    //  System.out.println("can vote");
    //  else
    //  System.out.println("can't vote");





// Logical Operators
// &&  (both the conditiion needs to be equal)

// int a = 30;
// int b = 60;

// if(a<50 && b<50)
// System.out.println("both less than 50");


// || (logical OR)

// if(a<50 || b<50)
// System.out.println("atleast one less than 50");

// // 
// boolean isadult = false;
// if(!isadult)
// System.out.println("is adult");
// else 
// System.out.println("not adult");


  Scanner sc = new Scanner(System.in);
  // pen = 10 ; notebook = 40
    int cash = sc.nextInt();
    if(cash < 10){
        System.out.println("cannot buy anything");
        System.out.println("get more cash");
    }
    
    else if(cash> 10 && cash < 40)
    {
        System.out.println("can get one thing");
    
    }
    else
    { System.out.println("can get more");
    }
}
}

