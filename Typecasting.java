/*  Typcasting in java is the process of converting one primitive data type into another.
It can be done automatically and explicitly.
--> When we assign tje value of one data type to another data type, then there is a chance that two data type might not be compatible with each other. 
The java compiler will automaticaly perform the conversion if the data are consistent. 

---> Two type of Typecasting in java
1. Widening / Automatic type conversion :- Java compiler automatically perform the conversion

when assign value of a smaller data type to large data types and if they compatible
byte -> short -> int -> long -> float -> double


2. Narrowing / Explicit :- need to be cast explicity 

-> Assigning the value of large data type into small. There may be chance of losing the data.

 */

  


// Example of 1. 

public class Typecasting {
    public static void main(String args[]){

        int i = 213567886;
        long l = i;
        l = l+1;
        double d = 1;
        System.out.println("int value: " +i);
        System.out.println("long value: " +i);
        System.out.println("double value: " +i);

    }
    
}
