public class BreakContinue {

    public static void main(String[] args){

        // int i = 0;
        // while(true){
        //     //break
        //     System.out.println(i);
        //     i = i + 1;
        //     if(i>5){
        //         break;
        //     }

        // }

        //Break and Continue statement

        int i = 0;
        while(true){
            if(i==3){
                i = i + 1;
                continue;
            }

            //break
            System.out.println(i);
            i = i + 1;
            if(i>5){
                break;
            }

        }


    }
    
}
