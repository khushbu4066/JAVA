import java.util.Scanner;


public class MiniProject {

    public static void main(String[] args){


     Scanner sc = new Scanner(System.in) {
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;

        
        
        do {
        System.out.println("Guess my number(1-100) : ");
        usernumber = sc.nextInt();

        if(usernumber == mynumber){
            System.out.println("YAHOO... CORRECT NUMBER!!!!");
            break;
        }

        else if(usernumber > mynumber){
            System.out.println("Your number is too large");
        }

        else {
            System.out.println("Your number is too small");
        }
} while(usernumber >= 0);

   System.out.print("My Number was: ");
   System.out.println(mynumber);
}
    


    