public class ExeptionHandling {

    //Exeption hanndling is like errors in code BUT its not errors, we are not able to handle and catch the errors but Exception we can

    /*  As we know in java we can't run code, if there's any 
    error but in case of exeption we can able to run code because its 
    in exeption handling case it can able to catch the exception and 
    run the other part of the code;;
    */

    public static void main(String[] args){

        //TRY - CATCH  in EXCEPTION HANDLING
       
        int[] marks = {10,20,30};
        
        try{
            System.out.println(marks[5]);
        } 
        catch(Exception exception){
            //do something after catching 
        }

        System.out.println("the name is khushi");

    }

    
}
