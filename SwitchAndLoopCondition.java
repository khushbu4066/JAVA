import java.util.Scanner;

public class SwitchAndLoopCondition {
    
    public static void main(String[] args) {

        //condition - Switch ( when we want to get out from the loop)
        // int day = 2;  // 1-Monday, 2- Tuesday.....

        // switch(day){
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     default:
        //     System.out.println("wed-sun");
        // }
        


        //Loops
        // FOR Loop

        // for(int i = 1; i<=100 ; i++){
        //     System.out.println(i);

            // i = 1 to 100

        // for(int i = 100; i>=1; i--){
        //     System.out.println(i);
        
        // i = 100 to 1



        // WHILE Loop 

        // int i = 100;
        // while(i >= 1){
        //     System.out.println(i);
        //     i--;
    // 



    //DO WHILE LOOP

    // int k = 100;
    // do{
    //     System.out.println(k);
    //     k = k-1;
    // }
    // while(k>=1);

// In while loop First we check the condition then If condition will true then only run the code...
// In Do while loop first run the code then condition will check in last 


// Practice example

Scanner sc = new Scanner(System.in);
int number = 0;
do{
    System.out.println("Input a value:");
    number = sc.nextInt();
    System.out.print("here is your number: ");
    System.out.println(number);

}while(number >=0);

System.out.println("the end.");
}
}

